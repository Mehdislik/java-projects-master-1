package fr.uvsq.cprog.collex.dessin;

/**
 * @author : debbah Mehdi Sofiane
 *  classe represetant un triangle
 *
 **/
public class Triangle extends Forme {
    // variables
    private Point a;
    private Point b;
    private Point c;

    // Constructeur
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // les methodes
    public double coteA() {//longeur cote A
        return Math.sqrt(Math.pow(this.b.getX() - this.c.getX(), 2) + Math.pow(this.b.getY() - this.c.getY(), 2));
    }

    public double coteB() {//longeur cote B
        return  Math.sqrt(Math.pow(this.a.getX() - this.c.getX(), 2) + Math.pow(this.a.getY() - this.c.getY(), 2));
    }

    public double coteC() {// longeur cote c
        return Math.sqrt(Math.pow(this.a.getX() - this.b.getX(), 2) + Math.pow(this.a.getY() - this.b.getY(), 2));
    }

    public double Perimeter() {
        return coteA() + coteB() + coteC();
    }

    public double Aire() {
        double semiPerimeter = Perimeter() / 2;
        return  Math.sqrt(semiPerimeter * ((semiPerimeter - coteA()) * (semiPerimeter - coteB()) * (semiPerimeter - coteC())));
    }

    public void deplacer(double dx, double dy) {
        this.a.deplacer(dx, dy);
        this.b.deplacer(dx, dy);
        this.c.deplacer(dx, dy);
    }

    public void afficher() {
        System.out.println("\nTriangle");
        System.out.format("le point A est   (%.2f, %.2f)\n", this.a.getX(), this.a.getY());
        System.out.format("le point B est  (%.2f, %.2f)\n", this.b.getX(), this.b.getY());
        System.out.format("le Point c  (%.2f, %.2f)\n", this.c.getX(), this.c.getY());
        System.out.format("Perimeter = %.2f cm\n", Perimeter());
        System.out.format("Aire = %.2f cm²\n", Aire());
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }
}