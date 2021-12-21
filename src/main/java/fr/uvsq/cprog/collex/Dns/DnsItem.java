package fr.uvsq.cprog.collex.Dns;

public class DnsItem {
    /**
     * @autor :debbah mehdi sofiane
     * classe representant une entré DNS  :
     * nomMachine addresIP
     * tel que :
     * nomMachine :nom.domaine.local
     * **/


    NomMachine nomMachine ;
    AdresseIP adresseIP;

    public DnsItem(NomMachine nom, AdresseIP adresseIP) {
        this.nomMachine = nom;
        this.adresseIP = adresseIP;
    }

    public NomMachine getNomMachine() {
        return nomMachine;
    }

    public void setNomMachine(NomMachine nom) {
        this.nomMachine = nom;
    }

    public AdresseIP getAdresseIP() {
        return adresseIP;
    }

    public void setAdresseIP(AdresseIP adresseIP) {
        this.adresseIP = adresseIP;
    }

    @Override
    public String toString() {
        return this.nomMachine.toString() +" "+ this.adresseIP.toString();

    }
}
