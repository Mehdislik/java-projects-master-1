package fr.uvsq.cprog.collex.DessinTest;
import fr.uvsq.cprog.collex.dessin.Circle;
import fr.uvsq.cprog.collex.dessin.Point;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * simple test unitaire pour la  classe Cercle
 */
public class CercleTest {


    @Test
    public void test_constructeur(){
        Point p1 = new Point(3,1);
        Circle c = new Circle(p1,4);
        assertEquals(3,c.getCenter().getX(),0);
        assertEquals(1,c.getCenter().getY(),0);
        assertEquals(4,c.getRadius(),0);
    }

    @Test
    public void test_deplacer(){
        Point p1 = new Point(6,4);
        Circle c = new Circle(p1,7);
        c.deplacer(3,3);
        assertEquals(9,c.getCenter().getX(),0);
        assertEquals(7,c.getCenter().getY(),0);
    }

    @Test
    public  void test_perimetre(){
        Point p1 = new Point(6,4);
        Circle c = new Circle(p1,7);
        double permetre = Math.PI * 2*7;
        assertEquals(permetre,c.Perimeter(),0);
    }

    @Test
    public void test_Aire(){
        Point p1 = new Point(6,4);
        Circle c = new Circle(p1,7);
        double aire =  Math.PI * Math.pow(7,2);
        assertEquals(aire,c.Aire(),0);
    }

    @Test
    public void test_diametre(){
        Point p1 = new Point(6,4);
        Circle c = new Circle(p1,3);
       assertEquals(6, c.Diametere(),0);

    }
}
