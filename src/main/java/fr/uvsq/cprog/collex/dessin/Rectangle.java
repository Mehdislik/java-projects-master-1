package fr.uvsq.cprog.collex.dessin;


/**
 * @author : debbah Mehdi Sofiane
 *  classe represetant
 *
 * un rectangle **/
    public class Rectangle extends Forme {
        // Attributes
        private Point Bas_gauche;
        private Point haut_droite;
        private double  length;
        private double width ;

        // Constructor
        public Rectangle(Point Bas_gauche, Point haut_droite, double l , double w) {
            this.length= l ;
            this.width= w;
            this.Bas_gauche = Bas_gauche;
            this.haut_droite = haut_droite;
        }


        public double Perimeter() {
            return  (length * 2) + (width * 2);
        }

        public double Aire() {
           return length * width;
        }

        public void deplacer(double dx, double dy) {
            this.Bas_gauche.deplacer(dx, dy);
            this.haut_droite.deplacer(dx, dy);
        }

        public void afficher() {
            System.out.println("\nRectangle");
            System.out.format(" le point basgauche est a (%.2f, %.2f)\n", this.Bas_gauche.getX(), this.Bas_gauche.getY());
            System.out.format("le point haut_droit est  a (%.2f, %.2f)\n", this.haut_droite.getX(), this.haut_droite.getY());
            System.out.format("le perimetre = %.2f cm\n", Perimeter());
            System.out.format("l'aire = %.2f cm²\n", Aire());
            System.out.format("sa longeur = %.2f et largeur = %.2f\n", this.length,this.width);
        }
    }

