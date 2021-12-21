package fr.uvsq.cprog.collex.Dns;

import java.util.Objects;

/** @author : debbah Mehdi sofiane
 * classe qui represente un nom de machine
 * */

public class NomMachine implements java.lang.Comparable<NomMachine>{

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


    @Override
    public boolean equals(Object autre) {
        if (this == autre) return true;
        if (autre == null || getClass() != autre.getClass()) return false;
        NomMachine that = (NomMachine) autre;
        // deux nom de machine sont egaux meme si il sont en majuscule ou miniscule
        String machinelower=this.machine.toLowerCase();
        String domainelower=this.domaine.toLowerCase();
        String locallower = this.local.toLowerCase();
        String machineOtherlower=that.machine.toLowerCase();
        String domaineOtherlower=that.domaine.toLowerCase();
        String localOtherlower = that.local.toLowerCase();
        return  (machinelower.equals(machineOtherlower) && domainelower.equals(domaineOtherlower) && locallower.equals(localOtherlower));}


    @Override
    public int hashCode() {
        // mettre les nom de machine en miniscule
        // pour avoir avoir le meme hascode si l'un est en majuscule et l'autre en minscule
        String machinelower=this.machine.toLowerCase();
        String domainelower=this.domaine.toLowerCase();
        String locallower = this.local.toLowerCase();
        return Objects.hash(machinelower, domainelower,locallower);
    }

    @Override
    public int compareTo(NomMachine    autre) {

        String nm1= this.machine+"."+this.domaine+"."+this.local;
        String nm2= autre.machine+"."+autre.domaine+"."+autre.local;

        int compare= nm1.compareTo(nm2);

        if (compare >0){
            return 1;
        }else if (compare<0){
            return  -1 ;
        }
        return 0;

    }
}