package fr.uvsq.cprog.collex.Dns;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

import static java.lang.Integer.parseInt;

/** classe DNS qui charge la base de donne
 * et fait des requete dns dans la base de donne 
 */
public class    Dns {

    private HashMap<AdresseIP, NomMachine> Ip_Ver_Machine;
    private HashMap<NomMachine, AdresseIP> Machine_Ver_Ip;


    //constructeur qui charger la bdd
    public Dns() {
        //jai creer deux hashmap pour avoir une recherche plus rapide en O(1) avec la methode contain()
        //parceque on recherche avec une clé qui est l'addrs ip
        // et aussi la clée nomMachine
        Ip_Ver_Machine = new HashMap<AdresseIP, NomMachine>();
        Machine_Ver_Ip = new HashMap<NomMachine, AdresseIP>();
        AdresseIP adrIP= null;
        NomMachine nomach = null;


        String bddpath = "";// chemin de la base de donne

        //  charger le fichier de proprieté
        // pour avoir le path de la base de donne
        try {

            FileInputStream in = new FileInputStream(".properties");
            Properties defaultProps = new Properties();
            defaultProps.load(in);
            bddpath = defaultProps.getProperty("db.path");

        } catch (IOException e) {
            System.out.println("fichier de proprité introuvable ");
        }
        try {
            File myObj = new File(bddpath);
            Scanner myReader = new Scanner(myObj);

            //lire la base de donne ligne par ligne
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                try {
                    String[] bddl1 = data.split("\\s");
                    adrIP = IPaddres_after_read(bddl1);
                    nomach =NomMachine_after_read(bddl1);

                } catch (Exception e) {
                    //cas on peut pas decouper l'addres ip ou le nom de la machine
                    System.out.println("erreur l'entree Dns n'est pas dans le format correct");
                }
                // ajout de chaque ligne de notre Dns dans des hashmap
                Ip_Ver_Machine.put(adrIP, nomach);
                Machine_Ver_Ip.put(nomach, adrIP);


            }
            //fermer le fichier
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Erreur fichier inexistant ou chemin erroné");
            e.printStackTrace();
        }


    }
    /**
     * function qui lit une addres ip en String et la decouper pour donner  l'objet  de type d'instance   AdrresIp */
    public AdresseIP IPaddres_after_read(String[] bdd_line) {

        int adr = -1;
        int es = -1;
        int se = -1;
        int ip = -1;
        String[] addrIp = bdd_line[1].split("[.]");//addrese ip
        //decouper l'addresse  ip
        adr = parseInt(addrIp[0]);
        es = parseInt(addrIp[1]);
        se = parseInt(addrIp[2]);
        ip = parseInt(addrIp[3]);
        return new AdresseIP(adr, es, se, ip);
    }

    /**
     * function qui lit un nom de machine en String et la decouper pour donner  l'objet de type d'instance NomMachine */
    public NomMachine NomMachine_after_read(String[] bdd_line) {
        String nom = "null";
        String domaine = "null";
        String local = "null";
        String[] nomMachine = bdd_line[0].split("[.]");//nom MAchine

        // decouper le nom de machine
        nom = nomMachine[0];
        domaine = nomMachine[1];
        local = nomMachine[2];
        return new NomMachine(nom, domaine, local);

    }


}



