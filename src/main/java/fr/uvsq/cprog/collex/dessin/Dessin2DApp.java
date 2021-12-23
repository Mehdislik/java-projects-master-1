package fr.uvsq.cprog.collex.dessin;

public class Dessin2DApp {

        public static void main(String[] args) {


            Dessin2DTUI Dessin2DTUI = new Dessin2DTUI();
            while (true){
                ExAction Action = Dessin2DTUI.Input();
                Action.execute();}
        }
    }

