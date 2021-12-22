package fr.uvsq.cprog.collex.Dns;

import java.util.ArrayList;

public class Main
{
    public static void main( String[] args )
    {
        AdresseIP a = new AdresseIP(192,168,0,1);
        NomMachine n = new NomMachine("machine2","domaine1","local2");
        Dns dns = new Dns();
         DnsItem itm =dns.getItem(a);//recuper le nom de machine
         DnsItem itm2 =dns.getItem(n);// recuper l'addres ip
         System.out.println(itm.toString());
         System.out.println(itm2.toString());
         ArrayList<String> de= dns.getItems("domaine1",'m');
        System.out.println(de.toString());
        ArrayList<String> dez= dns.getItems("domaine3",'m');
        System.out.println(dez.toString());
        ArrayList<String> ds= dns.getItems("domaine1",'a');
        System.out.println(ds.toString());

        System.out.println( "Hello World!" );
    }

}
