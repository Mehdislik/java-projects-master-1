package fr.uvsq.cprog.collex.Dns;

import java.io.IOException;
import java.util.Scanner;

public class DnsApp
{
    private DnsTUI ui ;

    public DnsApp(){
        this.ui = new DnsTUI();
    }

    public void run() throws  IOException {

        Scanner scanner = new Scanner(System.in);
        String commande = null;

        if (scanner.hasNextLine()) {
            commande = scanner.nextLine();
            this.ui.nextCommand(commande);
        }


}
    
}
