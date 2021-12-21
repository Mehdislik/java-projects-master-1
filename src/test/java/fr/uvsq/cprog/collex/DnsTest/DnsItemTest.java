package fr.uvsq.cprog.collex.DnsTest;

import fr.uvsq.cprog.collex.Dns.AdresseIP;
import fr.uvsq.cprog.collex.Dns.DnsItem;
import fr.uvsq.cprog.collex.Dns.NomMachine;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**@author :debbah Mehdi sofiane
 * simple test unitaire pour la  classe DnsItem
 */

public class DnsItemTest  {
    /** test du constructeur */
    @Test
    public void test_constructeur (){
        AdresseIP ip1 = new AdresseIP(192, 168 ,0 ,1);
        NomMachine machine1 = new NomMachine("dell", "domaine", "local");
        DnsItem dn1 = new DnsItem(machine1,ip1);
        assertEquals(true ,dn1.getAdresseIP().equals(new AdresseIP(192, 168 ,0 ,1)));
        assertEquals(true ,dn1.getNomMachine().equals(new NomMachine("dell", "domaine", "local")));

    }

    /** test du toString */
    @Test
    public   void test_ToString (){
        AdresseIP ip1 = new AdresseIP(192, 168 ,0 ,1);
        NomMachine machine1 = new NomMachine("dell", "domaine", "local");
        String str =machine1.toString()+" "+ip1.toString();
        assertEquals("dell.domaine.local 192.168.0.1",str);

    }


}