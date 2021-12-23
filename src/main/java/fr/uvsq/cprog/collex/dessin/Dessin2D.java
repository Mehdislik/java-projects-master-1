package fr.uvsq.cprog.collex.dessin;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * @author :debbah mehdi Sofiane
 * classe contenat les opertaion
 * afficher ,deplacer  ,supprimer formes
 */
public class Dessin2D {

    // liste des forme s
    private List<Forme> Draw= new ArrayList<>();

    public Dessin2D() {
    }

    public void Creer_Rectangle () {
        System.out.println("entree la longeur de votre Rectangle  :");
         Scanner In = new Scanner(System.in);
        double length=0;
        try {
           length  =In.nextDouble();
        }
        catch(InputMismatchException e) {
            System.out.println("Erreur : l'entree n'est pas correcte");
        }
        System.out.println("entree la largeur de votre Rectangle  :");
        Scanner In2 = new Scanner(System.in);
        double width=0;
        try {
            width  =In2.nextDouble();
        }
        catch(InputMismatchException e) {
            System.out.println("Erreur : l'entree n'est pas correcte");
        }

        System.out.println("entree les coordonne du point de coin bas gauche de votre rectangle  :");
        Point basgauche  = new Point();
        System.out.println("entree les coordonne du point de coin haut droit  de votre rectangle:");
        Point hautdroit = new Point();
        if (basgauche.getX() > hautdroit.getX() || basgauche.getY() > hautdroit.getY()) {
            System.out.println("Erreur : coordonne impossible");
        }
        this.Draw.add(new Rectangle(basgauche , hautdroit,length,width));
        System.out.println("rectangle cree avec succee");

    }

    public void creer_Triangle() {
        System.out.println("entrez les coordonne du premier coin de votre triangle:");
        Point a = new Point();
        System.out.println("entrez les coordonne du deuxieme  coin de votre triangle:");
        Point b = new Point();
        System.out.println("entrez les coordonne du troiseme coin de votre triangle:");
        Point c = new Point();
        this.Draw.add( new Triangle(a, b, c));
        System.out.println("Triangle creer avec succee");
    }

    public void creer_Circle() {
        System.out.println("entrez les coordonne du centre de votre cercle:");
        Point center = new Point();
        System.out.print("entre le rayon de votre cercle :\n\t>> ");
        Scanner userInput = new Scanner(System.in);
        double radius;
        try {
            radius = userInput.nextDouble();
        }
        catch(InputMismatchException e) {
            System.out.println("Erreur : entre incorrect");
            radius = 5;
        }
        this.Draw.add(new Circle(center, radius));
        System.out.println("Circle creer avec succee");

    }



    public void Afficher_forme() {//afficher forme
        if (Draw.size() > 0) {
            int i=0;
            System.out.format("il ya  %d figures dessine\n", Draw.size());
            for(Forme elem : Draw) {
                System.out.println("fome n°: "+i);
                elem.afficher();
                System.out.println("\n**********");
                i++;
            }

        }
        else {
            System.out.println("il ya pas de forme a afficher");
        }
    }

    public void deplacer_forme() {
        if (Draw.size() > 0) {
            System.out.format("il ya  %d formes  dessine\n", Draw.size());
            List<Integer> forme_Adeplacer = new ArrayList<>();
            int numforme; // le numero de la forme a deplacer

            do {
                System.out.print("donner le numero de la  formes a deplacer ? Tapper '-1'si vous voulez deplacer aucune\n\t>> Figure n°");
                Scanner userInput = new Scanner(System.in);
                numforme = userInput.nextInt();
                if (numforme != -1) {
                    forme_Adeplacer.add(numforme);
                }
            }
            while (numforme != 0);

            // deplacer la figure nO n
            double dx, dy;
            Scanner userInput = new Scanner(System.in);
            System.out.print("entrez combien dplacer la forme sur l'axe x \n\t>> ");
            userInput = new Scanner(System.in);
            dx = userInput.nextDouble();

            userInput = null;
            System.out.print("entrez combien deplacer la forme sur l'axe Y\n\t>> ");
            userInput = new Scanner(System.in);
            dy = userInput.nextDouble();

            for (int i = 0; i < forme_Adeplacer.size(); i++) {
                numforme = forme_Adeplacer.get(i) ;
                if (numforme <= Draw.size()) {
                    Draw.get(numforme).deplacer(dx, dy);
                    System.out.println("la forme a etait depalcer!");
                }
                else {
                    System.out.println("Erreur :  L'entree est plus grande que le nombre de formes ");
                }
            }
        }
        else {
            System.out.println("il ya a pas de forme a deplacer!");
        }
    }

    public void supprimer_forme() {
        if (Draw.size() > 0) {
            System.out.format("il ya  %d formes  dessine\n", Draw.size());
            System.out.print("vous voulez supprimer tout les formes? [Y/n]\n\t>> ");
            Scanner userInput = new Scanner(System.in);
            String answer = userInput.nextLine();

            if (answer.equals("Y")) {//supprimer tout les formes
                Draw.clear();
            }
            else if (answer.equals("n")) {//supprimer une forme par son numero
                List<Integer> forme_Asupprimer = new ArrayList<>();
                int numforme;

                do {
                    System.out.print("donner le numero de la formes a supprimer ? Tapper '-1'si vous voulez suprrimer aucune autre \n\t>> Figure n°");
                    Scanner userInput2 = new Scanner(System.in);
                    numforme = userInput2.nextInt();
                    if (numforme != -1) {
                        forme_Asupprimer.add(numforme);
                    }
                }
                while (numforme != -1);



                for (int i = 0; i < forme_Asupprimer.size(); i++) {
                    numforme = forme_Asupprimer.get(i) ;
                    if (numforme <= Draw.size()) {
                        Draw.remove(numforme);
                        System.out.println("la forme a etait supprimer!");
                    }
                    else {
                        System.out.println("Erreur :  L'entree est plus grande que le nombre de formes ");
                    }
                }
                }

        }
        else {
            System.out.println("il ya a pas de forme a supprimer!");
        }
    }


    public List<Forme> getDraw() {
        return Draw;
    }

    public void setDraw(List<Forme> draw) {
        Draw = draw;
    }

}


