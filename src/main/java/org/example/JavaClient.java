package org.example;

import client.BanqueService;
import client.BnqueWS;
import client.Compte;

import java.util.List;

public class JavaClient {
    public static void main(String[] args) {


        BanqueService proxy= new BnqueWS().getBanqueServicePort();
        System.out.println(proxy.convertEuroToDH(200));
        System.out.println();
        Compte cp=proxy.getCompte(1);
        System.out.println(cp.getCode());
        System.out.println(cp.getSolde());
        System.out.println(cp.getDateCreation());
        System.out.println();

        List<Compte> cpList=proxy.getAll();
        cpList.forEach(compte ->{
            System.out.println(cp.getCode());
            System.out.println(cp.getSolde());
            System.out.println(cp.getDateCreation());
        });

    }
}