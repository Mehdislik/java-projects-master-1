package fr.uvsq.cprog.collex.dessin;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author :debbah mehdi sofinae
 * lass representant un point avec
 * les coordone x , y
 */
public class Point{

    private double x;
    private double y;

    // Constructor
    public Point(double x,double y){
        this.x = x ;
        this.y =y;
    }

    public Point() {
        double x;
        double y;
        System.out.print("donner les coordonnée sur l'axe X:\n\t>> ");
        Scanner In = new Scanner(System.in);
        try {
            x =In.nextDouble();
        }
        catch(InputMismatchException e) {
            System.out.println("Erreur : l'entree n'est pas correcte");
            x = 0;
        }

        In = null;
        System.out.print("donner les coordonnée sur l'axe y :\n\t>> ");
        In = new Scanner(System.in);
        try {
            y = In.nextDouble();
        }
        catch(InputMismatchException e) {
            System.out.println("Erreur : l'entree n'est pas correcte");
            y = 0;
        }
        this.x = x;
        this.y = y;
    }

    // Methods
    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void deplacer(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    public void afficher() {
        System.out.println("x = " + this.x + ", y = " + this.y);
    }
}