package org.example;



import java.util.ArrayList;
import java.util.List;

public class Citoyen extends Personne {

    public Citoyen(String nom, String prenom, List mylist) {
        super(nom, prenom, mylist);
    }



    public List<String> retourneList(){
        return getMyList();
    }
}
