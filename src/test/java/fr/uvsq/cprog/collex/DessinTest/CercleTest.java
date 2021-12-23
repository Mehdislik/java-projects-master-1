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
    public  void test_permetre(){


    }

    @Test
    public void test_Aire(){

    }

    @Test
    public void test_diametre(){

    }
}
