package fr.uvsq.cprog.collex.DessinTest;
import fr.uvsq.cprog.collex.dessin.Point;
import fr.uvsq.cprog.collex.dessin.Rectangle;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * simple test unitaire pour la  classe Rectangle
 */
public class RectangleTest {

    @Test
    public void test_constructeur (){
        Point b_g = new Point(3,5) ;
        Point  h_d = new Point(1, 1);
        Rectangle r = new Rectangle(b_g,h_d,2,5);
        assertEquals(new Point(3,5).getX() ,r.getBas_gauche().getX(),0);
        assertEquals(new Point(3,5).getY() ,r.getBas_gauche().getY(),0);
        assertEquals(new Point(1,1).getX() ,r.getHaut_droite().getX(),0);
        assertEquals(new Point(1,1).getY() ,r.getHaut_droite().getY(),0);

        assertEquals(2,r.getLength(),0);
        assertEquals(5,r.getWidth(),0);


    }

    @Test
    public  void test_deplacer(){
        Point b_g = new Point(3,5) ;
        Point  h_d = new Point(1, 1);
        Rectangle r = new Rectangle(b_g,h_d,2,5);

        r.deplacer(2,1);//deplacer l'axe x,y

        assertEquals(5 ,r.getBas_gauche().getX(),0);
        assertEquals(6 ,r.getBas_gauche().getY(),0);
        assertEquals(3 ,r.getHaut_droite().getX(),0);
        assertEquals(2,r.getHaut_droite().getY(),0);
    }


    @Test
    public void test_perimetre (){
        Point b_g = new Point(3,5) ;
        Point  h_d = new Point(1, 1);
        Rectangle r = new Rectangle(b_g,h_d,2,3);
        assertEquals(10,r.Perimeter(),0);

    }
    @Test
    public void test_aire (){
        Point b_g = new Point(3,5) ;
        Point  h_d = new Point(1, 1);
        Rectangle r = new Rectangle(b_g,h_d,2,3);
        assertEquals(6,r.Aire(),0);

    }



}
