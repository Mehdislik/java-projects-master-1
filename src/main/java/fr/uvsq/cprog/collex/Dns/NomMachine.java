package fr.uvsq.cprog.collex.Dns;
/** @author : debbah Mehdi sofiane
 * classe qui represente un nom de machine
 * */

public class NomMachine {

    private String machine;
    private String domaine;
    private String local;

    public NomMachine(String machine, String domaine, String local) {
        this.machine = machine;
        this.domaine = domaine;
        this.local = local;
    }

    public String getMachine() {
        return machine;
    }

    public void setMachine(String machine) {
        this.machine = machine;
    }

    public String getDomaine() {
        return domaine;
    }

    public void setDomaine(String domaine) {
        this.domaine = domaine;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public String toString() {
        return machine + "." + domaine + "." + local  ;
    }


}