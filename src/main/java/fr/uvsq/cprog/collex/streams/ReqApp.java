package fr.uvsq.cprog.collex.streams;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
/**
 * @author :debbah Mehdi Sofiane
 * defintion la classe MAin pour lancer les requetes
 *
 *
 */
public class ReqApp {

        public static void main(String[] args) {

            // jeu de test
            Employe employe1 = new Employe("Aubin",33,Employe.sexeEMP.Homme,BigDecimal.valueOf(4600),LocalDate.parse("2021-03-03"),Service.DIRECTION_ACHAT);
            Employe employe2 = new Employe("Francois",40,Employe.sexeEMP.Homme,BigDecimal.valueOf(3380),LocalDate.parse("2017-02-16"),Service.INDUSTRIEL);
            Employe employe3 = new Employe("Nathalie",28,Employe.sexeEMP.Femme,BigDecimal.valueOf(2200),LocalDate.parse("2020-06-10"),Service.MARKETING);
            Employe employe4 = new Employe("Heloise",23,Employe.sexeEMP.Femme,BigDecimal.valueOf(3300),LocalDate.parse("2017-05-20"),Service.RESSOURCE_HUMAINE);
            Employe employe5 = new Employe("Alexandre",26,Employe.sexeEMP.Homme,BigDecimal.valueOf(3300),LocalDate.parse("2013-03-10"),Service.RESSOURCE_HUMAINE);
            Employe employe6 = new Employe("julien",48,Employe.sexeEMP.Homme,BigDecimal.valueOf(2900),LocalDate.parse("2016-01-17"),Service.FINANCE);
            Employe employe7 = new Employe("yasmine",24,Employe.sexeEMP.Femme,BigDecimal.valueOf(2200),LocalDate.parse("2021-01-11"),Service.MARKETING);


            List<Employe> employes = new ArrayList<>(7);
            employes.add(employe1);
            employes.add(employe2);
            employes.add(employe3);
            employes.add(employe4);
            employes.add(employe5);
            employes.add(employe6);
            employes.add(employe7);
            System.out.println("**********liste des requeteS *********");

            System.out.println("liste des employes :"); // liste des employes
            List<String> requeteA = employes
                    .stream()
                    .map(Employe::toString)
                    .collect(Collectors.toList());
            for (String e: requeteA) {
                System.out.println(e);
            }
            System.out.println("\n");

            System.out.println("liste de emplye inferieur a 30 ans :");// liste de employe inferieur a 30 ans
            List<Employe> requeteB= employes
                    .stream()
                    .filter(employe -> employe.getAge() < 30)
                    .collect(Collectors.toList());
            for (Employe e: requeteB) {
                System.out.println(e.toString());
            }
            System.out.println();

            System.out.println("le nom des employe homme :");// le nom des employe homme
            List<String> requeteC = employes
                    .stream()
                    .filter(employe -> employe.getSexe() == Employe.sexeEMP.Homme)
                    .map(Employe::getNom)
                    .collect(Collectors.toList());
            for (String e : requeteC) {
                System.out.println(e);
            }
            System.out.println("*** requete termine ********");
            System.out.println();
            System.out.println("le nom et le salaire trié par salaire décroissant :");//le nom et le salaire trié par salaire décroissant
            List<String> requeteD = employes
                    .stream()
                    .sorted(Comparator.comparing(Employe::getSalaire).reversed())
                    .map(employe -> employe.getNom() + " " + employe.getSalaire())
                    .collect(Collectors.toList());
            System.out.println(requeteD );
            System.out.println("** requete temrine  ********\n ");


            System.out.println("la moyenne des salaires :");//la moyenne des salaires
            double requeteE = employes
                    .stream()
                    .mapToInt(employe -> employe.getSalaire().intValue())
                    .average()
                    .getAsDouble();
            DecimalFormat format = new DecimalFormat("#.###");
            System.out.println(format.format(requeteE) + "\n");
            System.out.println("");

            System.out.println("les employés regroupés selon leur sexe :");//les employés regroupés selon leur sexe
            List<Employe> requeteF = employes
                    .stream()
                    .filter(employe -> employe.getSexe() == Employe.sexeEMP.Homme)
                    .collect(Collectors.toList());
            List<Employe> requeteFF = employes
                    .stream()
                    .filter(employe -> employe.getSexe() == Employe.sexeEMP.Femme)
                    .collect(Collectors.toList());
            for (Employe homme : requeteF) {
                System.out.println(homme);
            }
            System.out.println();
            for (Employe femme : requeteFF) {
                System.out.println(femme);
            }
            System.out.println();
            System.out.println("la moyenne des salaires par sexe :");//la moyenne des salaires par sexe
            double requeteG = employes
                    .stream()
                    .filter(employe -> employe.getSexe() == Employe.sexeEMP.Homme)
                    .mapToInt(employe -> employe.getSalaire().intValue())
                    .average()
                    .getAsDouble();

            System.out.println("moyenne du salaire des hommes: " + format.format(requeteG));
            double requeteGF = employes
                    .stream()
                    .filter(employe -> employe.getSexe() == Employe.sexeEMP.Femme)
                    .mapToInt(employe -> employe.getSalaire().intValue())
                    .average()
                    .getAsDouble();

            System.out.println("moyenne du salaire des femmes: " + format.format(requeteGF) + "\n");



            System.out.println("le nom et la date d’embauche par services:");//le nom et la date d’embauche par services
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            employes.stream()
                    .sorted(Comparator.comparing(Employe::getServiceRattachement))
                    .forEach(employe -> System.out.println(employe.getServiceRattachement()+"  "+employe.getNom() + " " + employe.getDateEmbauche().format(formatter)));





        }


    }


