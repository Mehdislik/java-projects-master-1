package fr.uvsq.cprog.collex.DessinTest;
import fr.uvsq.cprog.collex.dessin.Point;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * simple test unitaire pour la  classe Point
 */
public class PointTest {

    @Test
    public void test_constructeur (){
        Point p = new Point(2,10);
        assertEquals(2,p.getX(),0);
        assertEquals(10,p.getY(),0);

    }

    @Test
    public void  test_deplacer (){
        Point p = new Point(2,10);
        p.deplacer(4,5);
        assertEquals(6,p.getX(),0);
        assertEquals(15,p.getY(),0);
    }


}
