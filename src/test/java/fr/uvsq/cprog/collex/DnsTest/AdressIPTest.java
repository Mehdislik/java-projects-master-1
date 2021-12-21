package fr.uvsq.cprog.collex.DnsTest;
import static org.junit.Assert.assertEquals;
import fr.uvsq.cprog.collex.Dns.AdresseIP;
import org.junit.Test;

/**
 * simple test unitaire pour la  classe addres ip
 */
public class AdressIPTest
{

    /** test du constructeur */
    @Test
    public void test_constructeur (){
        AdresseIP ip1 = new AdresseIP(192, 168 ,0 ,1);
        assertEquals(192,ip1.getAdr());
        assertEquals(168,ip1.getEs());
        assertEquals(0,ip1.getSe());
        assertEquals(1,ip1.getIp());


    }

    /** test du toString */
    @Test
    public   void test_ToString (){
        AdresseIP ip1 = new AdresseIP(192, 168 ,0 ,1);
        assertEquals("192.168.0.1",ip1.toString());

    }
    /** test de equals de deux  */
    @Test
    public void equals_test(){
        AdresseIP ip1 = new AdresseIP(192, 168 ,0 ,2);
        AdresseIP ip2 = new AdresseIP(192, 168 ,0 ,2);
        assertEquals(true ,ip1.equals(ip2));
    }
    /** test de la fonction compare to  **/
    @Test
    public void test_compare_to() {

        AdresseIP ip1 = new AdresseIP(192, 168 ,0 ,2);
        AdresseIP ip2 = new AdresseIP(190, 168 ,0 ,2);
        AdresseIP ip3 = new AdresseIP(190, 168,0,1);
        AdresseIP ip4 = new AdresseIP(190, 168,0,1);

        // test compare to si l'objet instancie   > l'objet en entrée
        assertEquals(1 ,ip1.compareTo(ip2));
        assertEquals(1 ,ip2.compareTo(ip3));

        // test compare to si l'objet instancie   < l'objet en entrée
        assertEquals(-1 ,ip2.compareTo(ip1));
        assertEquals(-1 ,ip3.compareTo(ip2));

        // test compare to si l'objet instancie   =l'objet en entrée
        assertEquals(0 ,ip3.compareTo(ip4));

    }

    /** test du hascode   **/
    @Test
    public void test_hascode (){
        AdresseIP ip1 = new AdresseIP(192, 168 ,0 ,2);
        AdresseIP ip2 = new AdresseIP(192, 168 ,0 ,2);

        assertEquals(ip2.hashCode(), ip1.hashCode() );

    }



}
