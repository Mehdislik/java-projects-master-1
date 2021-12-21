package fr.uvsq.cprog.collex.DnsTest;

import static org.junit.Assert.assertEquals;

import fr.uvsq.cprog.collex.Dns.NomMachine;
import org.junit.Test;
/**
 *  fichier test de la classe NomMachine
 *
 * */
public class NomMachineTest {

    @Test
    public void  test_constructeur () {
        NomMachine machine1  = new NomMachine("dell","fruvsq","mehdipc");
        assertEquals("dell",machine1.getMachine());
        assertEquals("fruvsq",machine1.getDomaine());
        assertEquals("mehdipc",machine1.getLocal());
    }

    @Test
    public  void test_ToString () {
        NomMachine machine1 = new NomMachine("dell", "domaine", "local");
        assertEquals("dell.domaine.local", machine1.toString());

    }
    @Test
    public  void test_equals () {
        NomMachine machine1  = new NomMachine("dell","domaine","local1");
        NomMachine machine2  = new NomMachine("dell","domaine","locaL1");

        assertEquals(true, machine1.equals(machine2));
    }

    @Test
    public void test_compare_to (){
        NomMachine machine1  = new NomMachine("hp","domaine1","local1");
        NomMachine machine2  = new NomMachine("dell","domaine2","local1");
        NomMachine machine3  = new NomMachine("hp","domaine1","local1");
        assertEquals(1,machine1.compareTo(machine2));
        assertEquals(-1,machine2.compareTo(machine1));

        assertEquals(0,machine1.compareTo(machine3));

    }

    @Test
    public void test_hascode (){
        NomMachine machine1  = new NomMachine("dell","domaine","local1");
        NomMachine machine2  = new NomMachine("dell","domaine","locaL1");

        assertEquals(machine2.hashCode(),machine1.hashCode());

    }

}
