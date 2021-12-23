package fr.uvsq.cprog.collex.dessin;
/**
 * @author : debbah Mehdi Sofiane
 *  classe represetant un circle
 *
 **/
    public class Circle extends Forme {
        // Attributes
        private Point center;
        private double radius;

        // Constructor
        public Circle(Point center, double radius) {
            this.center = center;
            this.radius = radius;
        }

        // Methods
        public double Diametere() {

            return this.radius * 2;
        }

        public double Perimeter() {

            return Math.PI * 2 * this.radius;
        }

        public double Aire() {

            return Math.PI * Math.pow(this.radius, 2);
        }

        public void deplacer(double dx, double dy) {

            this.center.deplacer(dx, dy);
        }

        public void afficher() {
            System.out.println("\nCircle");
            System.out.format("le centre du circle est a (%.2f, %.2f)\n", this.center.getX(), this.center.getY());
            System.out.format("Diametere = %.2f cm\n", Diametere());
            System.out.format("Perimetere = %.2f cm\n", Perimeter());
            System.out.format("Aire = %.2f cm²\n", Aire());
        }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

