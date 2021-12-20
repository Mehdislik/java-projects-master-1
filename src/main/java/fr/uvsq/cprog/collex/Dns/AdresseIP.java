package fr.uvsq.cprog.collex.Dns;
/**
 *  par  debbah Mehdi sofaine */

/** definition de la classe d'adresse ip avec 4 champs :
 * adr.es.se.ip
 */
public class AdresseIP {
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



}
