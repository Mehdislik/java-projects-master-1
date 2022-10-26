package fr.uvsq.cprog.collex.Dns;

import static java.lang.Integer.parseInt;

import java.io.File;

import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.io.IOException;

import java.util.ArrayList;

import java.util.Collections;


import java.util.HashMap;

import java.util.Map;

import java.util.Properties;

import java.util.Scanner;



/**
 * classe qui represente le serveur DNs.
 * @author :debbah Mehdi sofiane
 *
 *
 *
 */
public class    Dns {
  //jai creer deux hashmap pour avoir une recherche plus rapide en O(1) avec la methode contain()
  //parceque on recherche avec une clé qui est l'addres ip ou la clée nomMachine
  private final HashMap<AdresseIP, NomMachine> Ip_Ver_Machine;
  private final HashMap<NomMachine, AdresseIP> Machine_Ver_Ip;


  /**
   * constructeur qui charger la bdd et intilalise les hashmap.
   */
  public Dns() {

    Ip_Ver_Machine = new HashMap<AdresseIP, NomMachine>();
    Machine_Ver_Ip = new HashMap<NomMachine, AdresseIP>();
    AdresseIP adrIP = null;
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
                adrIP = IPaddres_after_read(bddl1[1]);
                nomach =NomMachine_after_read(bddl1[0]);

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
    public AdresseIP IPaddres_after_read(String bdd_line) {

        int adr = -1;
        int es = -1;
        int se = -1;
        int ip = -1;
        String[] addrIp = bdd_line.split("[.]");//addrese ip
        //decouper l'addresse  ip
        adr = parseInt(addrIp[0]);
        es = parseInt(addrIp[1]);
        se = parseInt(addrIp[2]);
        ip = parseInt(addrIp[3]);
        return new AdresseIP(adr, es, se, ip);
    }

    /**
     * function qui lit un nom de machine en String et la decouper pour donner  l'objet de type d'instance NomMachine */
    public NomMachine NomMachine_after_read(String bdd_line) {
        String nom = "null";
        String domaine = "null";
        String local = "null";
        String[] nomMachine = bdd_line.split("[.]");//nom MAchine

        // decouper le nom de machine
        nom = nomMachine[0];
        domaine = nomMachine[1];
        local = nomMachine[2];
        return new NomMachine(nom, domaine, local);

    }

     /** fonction qui retourne un DnsItem apartir d'une address ip */
    public DnsItem getItem(AdresseIP adr) {
        DnsItem dn1;
        NomMachine nm;

        if (Ip_Ver_Machine.containsKey(adr)) {
            nm = Ip_Ver_Machine.get(adr);
            dn1 = new DnsItem(nm, adr);

        } else {
            dn1 = new DnsItem(null, null);
            throw new IllegalArgumentException("addres ip qui  n'existe pas dans la base de donne ou elle est dans un format incorrect ");
        }
        return dn1;

    }

    /** fonction qui retourne un DnsItem apartir d'un nom de machine */
    public DnsItem getItem(NomMachine nomach) {
        DnsItem dn1;
        AdresseIP adrip;

        if (Machine_Ver_Ip.containsKey(nomach)) {
            adrip = Machine_Ver_Ip.get(nomach);
            dn1 = new DnsItem(nomach, adrip);
        } else {
            dn1 = new DnsItem(null, null);
            throw new IllegalArgumentException("nomMachine  qui  n'existe pas dans la base de donne ou elle est dans un format incorrect ");
        }
        return dn1;

    }
    /** fonction qui retourner une liste de machine qui sont dans le meme domaine */
    public ArrayList<String> getItems(String domain, char arg) {
        ArrayList<String> meme_domaine = new ArrayList<String>();

        for (Map.Entry<NomMachine, AdresseIP>  element : this.Machine_Ver_Ip.entrySet()) {
            String domaine = element.getKey().getDomaine();
            if (domaine.equals(domain)) {
                if (arg == 'm') {//nom machine
                    meme_domaine.add(element.getKey().toString());
                }
                if (arg == 'a') {// adres ip
                    meme_domaine.add(element.getValue().toString());
                }
            }
        }
        Collections.sort(meme_domaine);//trie par addres ip ou nommachine
        return meme_domaine;
    }


}



