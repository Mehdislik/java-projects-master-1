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


}
