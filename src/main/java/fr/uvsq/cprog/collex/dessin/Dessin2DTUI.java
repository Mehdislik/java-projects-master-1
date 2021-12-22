package fr.uvsq.cprog.collex.dessin;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * @author :debbah mehdi Sofiane
 * classe qui les commandes de l'utlisateur
 */
public class Dessin2DTUI {
    ExAction cmd =null;
    public Dessin2DTUI() {
        cmd = new ExAction(null,null);
    }
    public ExAction Input () {

        Scanner sc = new Scanner(System.in);

        System.out.println("Les commandes sont les suivantes : laisser un vide pares la commande");
        System.out.println("\t - Creer <typeForme>  ");
        System.out.println("\t - Supprimer ");
        System.out.println("\t - Déplacer ");
        System.out.println("\t - Afficher ");
        System.out.println("\n");
        System.out.println("\t type formes sont :(Triangle ,Rectangle ,Cercle)");
        System.out.println("\t - Taper NO pour les options par défaut");

        System.out.println("Saisie de la commande : ");

        String li = sc.nextLine();//ligne lue
        String form;

        if(li.contains("Creer")) { //creation d'un forme
            String[] arg = li.split( " ", 2);
            form = arg[1];//type de forme :circle , traiagle


            cmd.setAction ("Creer");
            cmd.setForm(form);
            return cmd;
        }
        else if (li.contains("Supprimer")) {
            String[] arg = li.split( " ", 2);


            cmd.setAction ("Supprimer");
            cmd.setForm("form");
            return cmd;
        }
        else if(li.contains("Deplacer")){
            String[] arg = li.split( " ", 2);
            //form = arg[1];



            cmd.setAction ("Deplacer");
            cmd.setForm("form");
            return cmd;
        }
        else if(li.contains("Afficher")){
            String[] arg = li.split( " ", 2);

            cmd.setAction ("Afficher");
            cmd.setForm("form");
            return cmd;
        }
        else {
            System.out.println("Commande incorrecte.\n");

            System.out.println("Les commandes sont les suivantes : ");
            System.out.println("\t - Creer <Forme> ");
            System.out.println("\t - Supprimer ");
            System.out.println("\t - Deplacer ");
            System.out.println("\t - Afficher ");
            System.out.println("\n");
            System.out.println("\t - Taper NO pour les options par défaut");

            throw new InputMismatchException();
        }
    }
}







