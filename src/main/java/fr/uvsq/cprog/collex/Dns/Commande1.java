package fr.uvsq.cprog.collex.Dns;
import java.io.*;
import java.util.*;

/**
 * @author :debbah Mehdi sofiane 
 * classe implemante l'interface Commande
 * cette classe vas excuter les commande saisie par les utlisateures
 */
    public class Commande1 {
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

        }
    }

