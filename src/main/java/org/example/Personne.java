package org.example;

import java.util.ArrayList;
import java.util.List;

public class Personne {

        // rendre les champs privés et finaux
    // ne pas fournir des méthodes qui modifient l'état ==> pas de setters
    // les methodes qui rendent des ref  sur les objets interne (par exemple les getters)rendent des copies
    private final String nom;
    private final String prenom;

    protected final List<String> myList;

    public  final List getMyList() {
        List list = new ArrayList<>(myList);
        return list;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Personne(String nom, String prenom,List mylist) {
        this.nom = nom;
        this.prenom = prenom;
        this.myList=mylist;
    }
}
