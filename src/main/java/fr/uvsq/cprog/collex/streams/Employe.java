package fr.uvsq.cprog.collex.streams;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author :debbah Mehdi Sofiane
 * defintion de la classe employe avec ses methode
 *
 *
 */
public class Employe {
    private final String nomEMp;
    private final int ageEMp;
    private final BigDecimal salaireEMP;
    private final LocalDate dateEmbauche;
    private final Service serviceRatta;
    private final Employe.sexeEMP sexeEMP;
    public enum sexeEMP {
        Femme,
        Homme,

    }
        public Employe(String nom, int age, Employe.sexeEMP sexe, BigDecimal salaire, LocalDate dateEmbauche, Service service_Ratta) {
            this.nomEMp = nom;
            this.ageEMp = age;
            this.salaireEMP = salaire;
            this.dateEmbauche = dateEmbauche;
            this.serviceRatta = service_Ratta;
            this.sexeEMP = sexe;
        }

        public String getNom() {
            return this.nomEMp;
        }

        public int getAge() {
            return this.ageEMp;
        }

        public Employe.sexeEMP getSexe() {
            return this.sexeEMP;
        }

        public BigDecimal getSalaire() {
            return this.salaireEMP;
        }

        public LocalDate getDateEmbauche() {
            return this.dateEmbauche;
        }

        public Service getServiceRattachement() {
            return this.serviceRatta;
        }

        @Override
        public String toString() {
            return "nom = "
                    + getNom()
                    + ", age = "
                    + getAge()
                    + ", sexe = "
                    + getSexe()
                    + ", salaire = "
                    + getSalaire()
                    + ", dateEmbauche = "
                    + getDateEmbauche()
                    + ", serviceRattachement = "
                    + getServiceRattachement();
        }


    }

