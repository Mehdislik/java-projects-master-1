package fr.uvsq.cprog.collex.Dns;

import java.io.IOException;
import java.lang.*;

/**
 * @author :debbah Mehdi sofiane
 *  classe DnsTUI qui se chargera des interactions avec l’utilisateur
 */
public class DnsTUI {

    public DnsTUI() {

    }

    /**
     *  une méthode qui analysera le texte saisi par l’utilisateur
     *  et retournera un objet implémentant l’interface Commande
     * @param command
     * @throws IOException
     */
    public void nextCommand(String command) throws IOException {
        Commande1 cmd = new Commande1();
        String domaine = "";
        int vide  = 0;

        // analyse du test saisi par l'utlisateur
       int nbword_point =command.split("[.]").length;

        if (nbword_point == 3) {//c'est un  nom de machine avec 3 champs
           cmd.setCmd(command, "AddressIP");//cherchez l'address ip avec en entree le nom
            // de la machine
            affiche(cmd.execute());
        } else if (nbword_point == 4) {
            cmd.setCmd(command, "NomMachine");
            affiche(cmd.execute());


        } else if (command.contains("ls")) {//list de machine

            if (command.contains("-a")) {// trie selon l'addresse ip
                domaine = "";
                vide = 0;
                for (int i = 0; i < command.length(); i++) {
                    if (Character.isWhitespace(command.charAt(i))) {
                        vide++;
                    }
                    if (vide == 2) {// sil le vide existe apres le premier vide de -a
                        domaine = command.substring(i + 1, command.length());
                        break;
                    }
                }
                cmd.setCmd(domaine, "ls -a");
                affiche(cmd.execute());

            } else {// trie selon le nom de domaine

                for (int i = 0; i < command.length(); i++) {
                    if (Character.isWhitespace(command.charAt(i))) {
                        domaine = command.substring(i + 1, command.length());
                        break;
                    }
                }
                cmd.setCmd(domaine, "ls");
                affiche(cmd.execute());
            }
        } else if (command.equals("q")) {//quitter l'application
            System.exit(0);
        } else {
            affiche("Error: commande inconnue ");
        }
    }

    public void  affiche(String resultat) {
        System.out.println(resultat);
    }
}
