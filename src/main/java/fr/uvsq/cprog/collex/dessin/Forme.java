package fr.uvsq.cprog.collex.dessin;


import java.io.Serializable;

public abstract class Forme implements Serializable {

    public abstract void deplacer(double dx, double dy);
    public abstract void afficher();
}


