package fr.uvsq.cprog.collex.DnsTest;
import fr.uvsq.cprog.collex.Dns.AdresseIP;
import fr.uvsq.cprog.collex.Dns.Dns;
import fr.uvsq.cprog.collex.Dns.DnsItem;
import fr.uvsq.cprog.collex.Dns.NomMachine;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**@author :debbah Mehdi sofiane
 * simple test unitaire pour la  classe Dns
 */
public class DnsTest {


    @Test
    public  void test_getitem(){// test methode utlise dans la commande qui fait machine vers ip et ip vers machine
        Dns dn = new Dns();
        AdresseIP ip = new AdresseIP(192,168,0,1);
        NomMachine nm = new NomMachine("machine" ,"domaine" , "local" );

        DnsItem item = dn.getItem(ip);//ip  to machine
        assertEquals(ip,item.getAdresseIP());
        assertEquals(nm ,item.getNomMachine());

        DnsItem item2 = dn.getItem(nm);//machine to ip
        assertEquals(ip,item2.getAdresseIP());
        assertEquals(nm ,item2.getNomMachine());
    }

    @Test
    public  void test_getItemes (){// test de getitmes utliser dans la command Ls
        Dns dn = new Dns();
        AdresseIP ip = new AdresseIP(192,168,0,1);
        NomMachine nm = new NomMachine("machine" ,"domaine" , "local" );

        // test liste trie par nom machine a un domaine donne
        ArrayList<String> listmachine = dn.getItems("domaine3",'m');
        assertEquals("machine3.domaine3.local3",listmachine.get(0));
        assertEquals("machine4.domaine3.local4",listmachine.get(1));

        // test liste trie par addres ip a un domaine donne
        ArrayList<String> listip = dn.getItems("domaine3",'a');
        assertEquals("192.168.0.4",listip .get(0));
        assertEquals("192.168.0.5",listip .get(1));

    }


















}
