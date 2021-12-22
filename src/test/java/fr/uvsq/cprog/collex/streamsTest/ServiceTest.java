package fr.uvsq.cprog.collex.streamsTest;
import static org.junit.Assert.assertEquals;
import fr.uvsq.cprog.collex.streams.Service;
import fr.uvsq.cprog.collex.streams.Service;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author debbah mehdi sofiane
 * simple test unitaire pour l'enumeration service
 */

public class ServiceTest {

    @Test
    public void Test_constructeur (){

       Service s=  Service.RESSOURCE_HUMAINE;
       assertEquals("RESSOURCE_HUMAINE",s.getNom());
        assertEquals("42 ,avenue de l'Amandier",s.getAdresse());

    }



}
