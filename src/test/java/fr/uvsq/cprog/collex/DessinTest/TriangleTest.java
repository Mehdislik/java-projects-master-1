package fr.uvsq.cprog.collex.DessinTest;
import fr.uvsq.cprog.collex.dessin.Point;
import fr.uvsq.cprog.collex.dessin.Rectangle;
import fr.uvsq.cprog.collex.dessin.Triangle;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * simple test unitaire pour la  classe Triangle
 */
public class TriangleTest {

    @Test
    public void test_constructeur (){
        Point a = new Point(3,5) ;
        Point  b = new Point(2, 1);
        Point  c = new Point(2, 5);
        Triangle t = new Triangle(a,b,c);
        assertEquals(3 ,t.getA().getX(),0);
        assertEquals(5 ,t.getA().getY(),0);

        assertEquals(2 ,t.getB().getX(),0);
        assertEquals( 1,t.getB().getY(),0);

        assertEquals(2,t.getC().getX(),0);
        assertEquals(5,t.getC().getY(),0);


    }

    @Test
    public  void test_deplacer(){
        Point a = new Point(3,5) ;
        Point  b = new Point(2, 1);
        Point  c = new Point(2, 5);
        Triangle t = new Triangle(a,b,c);

        t.deplacer(2,1);//deplacer l'axe x,y

        assertEquals(5 ,t.getA().getX(),0);
        assertEquals(6 ,t.getA().getY(),0);

        assertEquals(4 ,t.getB().getX(),0);
        assertEquals( 2,t.getB().getY(),0);

        assertEquals(4,t.getC().getX(),0);
        assertEquals(6,t.getC().getY(),0);
    }


    @Test
    public void test_perimetre (){
        Point a = new Point(3,5) ;
        Point  b = new Point(2, 1);
        Point  c = new Point(2, 5);
        Triangle t = new Triangle(a,b,c);
        assertEquals(Math.sqrt(17)+5,t.Perimeter(),0);

    }
    @Test
    public void test_aire (){
        Point a = new Point(3,5) ;
        Point  b = new Point(2, 1);
        Point  c = new Point(2, 5);
        Triangle t = new Triangle(a,b,c);
        double smep= (Math.sqrt(17)+5)/2;
        assertEquals(Math.sqrt(smep*(smep-t.coteA())*(smep-t.coteB())*(smep-t.coteC())),t.Aire(),0);

    }


}
