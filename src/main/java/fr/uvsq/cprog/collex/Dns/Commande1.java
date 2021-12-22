package fr.uvsq.cprog.collex.Dns;
import java.io.*;
import java.util.*;

/**
 * @author :debbah Mehdi sofiane
 * classe implemante l'interface Commande
 * cette classe vas excuter les commande saisie par les utlisateures
 */
    public class Commande1 implements  Commande {
        private String cmd;
        private String arg;

        public Commande1() {
            this.cmd = "";
            this.arg = "";
        }

        public void setCmd(String cmd, String arg) {
            this.cmd = cmd;
            this.arg = arg;
        }

        /**
         * methode qui excute les commande saisie poar les ultisateurs
         * @return
         * @throws IOException
         */
        public String execute() throws IOException {
            Dns dns = new Dns();
            String result = "";

            if (this.arg.equals("AddressIP")) {
                NomMachine machine = dns.NomMachine_after_read(this.cmd);
                result = dns.getItem(machine).getAdresseIP().toString();
                return result;
            }
            if (this.arg.equals("NomMachine")) {
                AdresseIP Ip=dns.IPaddres_after_read(this.cmd);
                result = dns.getItem(Ip).getNomMachine().toString();
                return result;

            }
            // liste machine meme domaine
            if (this.arg.equals("ls")) {
                ArrayList<String> listmachine = dns.getItems(cmd, 'm');
                for(String dom :listmachine) {
                    result = result + dom +"\n";
                }
                return result;
            }
            if (this.arg.equals("ls -a")) {
                ArrayList<String> listmachine = dns.getItems(cmd, 'a');
                for(String dom :listmachine) {
                    result = result + dom +"\n";
                }
                return result;
            } else {
                System.out.println("Erreur :dans l'execution de la commmande ");
                return null;
            }
        }
    }

