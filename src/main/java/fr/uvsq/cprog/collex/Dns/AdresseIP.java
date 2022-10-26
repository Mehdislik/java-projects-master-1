package fr.uvsq.cprog.collex.Dns;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;


import java.util.Objects;

/**
 * definition de la classe d'adresse ip avec 4 champs :
 * adr.es.se.ip
 * @author :debbah Mehdi sofiane
 */
public class AdresseIP implements java.lang.Comparable<AdresseIP>  {
    private int adr;
    private int  es ;
    private int  se  ;
    private int  ip ;


    public AdresseIP(int adr, int es, int se, int ip){
        this .adr = adr ;
        this .es = es ;
        this .se = se ;
        this .ip = ip ;
    }

    @Override
    public String toString() {
        return  adr+"."+es +"."+se+"."+ip;

    }

    public int getAdr() {
        return adr;
    }

    public void setAdr(int adr) {
        this.adr = adr;
    }

    public int getEs() {
        return es;
    }

    public void setEs(int es) {
        this.es = es;
    }

    public int getSe() {
        return se;
    }

    public void setSe(int se) {
        this.se = se;
    }

    public int getIp() {
        return ip;
    }

    public void setIp(int ip) {
        this.ip = ip;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdresseIP adresseIP = (AdresseIP) o;
        return adr == adresseIP.adr && es == adresseIP.es && se == adresseIP.se && ip == adresseIP.ip;
    }

    @Override
    public int hashCode() {
        return Objects.hash(adr, es, se, ip);
    }

    @Override
    public int compareTo(AdresseIP o) {

        int i=0;
        // creation de deux liste contenat chaqun une addre ip
        ArrayList<Integer> IPother = new  ArrayList<Integer>();
        IPother.add(o.adr);
        IPother.add (o.es);
        IPother.add (o.se);
        IPother.add (o.ip);
        ArrayList<Integer> IPothis = new  ArrayList<Integer>();
        IPothis.add(this.adr);
        IPothis.add (this.es);
        IPothis.add (this.se);
        IPothis.add (this.ip);

        while ( i< 4){
            if(IPothis.get(i).equals(IPother.get(i)))
                i++;
            else if( IPothis.get(i) < IPother.get(i))
              return -1;
            else if ( IPothis.get(i) > IPother.get(i))
                return  1;

        }
        return 0;
    }
}
