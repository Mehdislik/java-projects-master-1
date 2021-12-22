package fr.uvsq.cprog.collex.streamsTest;
import fr.uvsq.cprog.collex.streams.Employe;
import fr.uvsq.cprog.collex.streams.Service;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author :debbah Mehdi sofiane
 * simple test unitaire pour la classe Employe
 */
public class EmployeTest {

    @Test
    public void test_constructeur (){
        Employe a =  new Employe("Aubin",33,Employe.sexeEMP.Homme, BigDecimal.valueOf(4600), LocalDate.parse("2021-03-03"), Service.DIRECTION_ACHAT);
        assertEquals("Aubin",a.getNom());
        assertEquals(33,a.getAge());
        assertEquals(Employe.sexeEMP.Homme ,a.getSexe());
        assertEquals(BigDecimal.valueOf(4600),a.getSalaire());
        assertEquals(LocalDate.parse("2021-03-03"),a.getDateEmbauche());
        assertEquals(Service.DIRECTION_ACHAT, a.getServiceRattachement());

    }

    @Test
    public void test_To_String (){
        Employe employe2 = new Employe("Heloise",23,Employe.sexeEMP.Femme,BigDecimal.valueOf(3300),LocalDate.parse("2017-05-20"),Service.RESSOURCE_HUMAINE);
        String tesstr= "nom = "
                + "Heloise"
                + ", age = "
                + "23"
                + ", sexe = "
                + "Femme"
                + ", salaire = "
                + BigDecimal.valueOf(3300)
                + ", dateEmbauche = "
                + LocalDate.parse("2017-05-20")
                + ", serviceRattachement = "
                + "RESSOURCE_HUMAINE";

        assertEquals(tesstr,employe2.toString());
    }

}
