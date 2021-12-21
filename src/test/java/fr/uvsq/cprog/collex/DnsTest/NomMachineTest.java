package fr.uvsq.cprog.collex.DnsTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import fr.uvsq.cprog.collex.Dns.NomMachine;
import org.junit.Test;

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
        NomMachine machine1 = new NomMachine("dell", "domaine", "mehdipc");
        assertEquals("dell.domaine.mehdipc", machine1.toString());

    }
  

}
