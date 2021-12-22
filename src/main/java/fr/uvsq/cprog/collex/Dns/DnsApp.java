package fr.uvsq.cprog.collex.Dns;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author :debbah Mehdi sofiane
 *
 * classe qui va lire les commande de l'utlisateur  et les excuter
 */
public class DnsApp
{
    private DnsTUI ui ;

    public DnsApp(){
        this.ui = new DnsTUI();
    }

    public void run() throws  IOException {

        Scanner scanner = new Scanner(System.in);
        String commande = null;

        if (scanner.hasNextLine()) {
            commande = scanner.nextLine();
            this.ui.nextCommand(commande);
        }


}
    public static void main( String[] args )throws  IOException
    {

        System.out.println("bienvnue dans le serveur DNS");
        DnsApp Dns1 = new DnsApp();
        while (true ) {
            System.out.println("*************le commandes ******");
            System.out.println("1/rechercher une addres IP aprtir d'un nom de machine " +
                    "Ecrire une nom de machine " +
                    " (exp :machine.domaine.local) ");
            System.out.println("2/rechercher un nom de machine aprtir d'une address Ip  " +
                    "Ecrire une addres ip correcte (exp :192.168.0.1) ");
            System.out.println("3/afficher liste machine par domaine donne   trie par leur nom :( ls)");
            System.out.println("4/afficher liste machine par demaine donnne trie par leur addres ip  :( ls -a)");
            Dns1.run();
        }



    }

}
