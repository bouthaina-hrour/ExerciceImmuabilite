package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Personne personne = new Personne("Bouthaina","hrour", new ArrayList());



        List list = personne.getMyList();
        list.add("tata");

        //System.out.println(personne.getMyList().get(0));
        System.out.println(list.get(0));

        String toto = "toto";
        toto.concat("titi");

        //System.out.println(toto);


        String nom = personne.getNom();
        nom.concat("titi");
        System.out.println(nom);

        System.out.println(personne.getNom().concat("titi"));
        personne = new Personne("","",new ArrayList());

        // à la compilation le type utilisé est le type déclaré donc Personne à l'execution c'est le type réel qui est utilisé
        Personne citoyen = new Citoyen("","",new ArrayList<>());
        citoyen.getMyList().add("element");

        Integer myInt = 5;  // Crée un objet Integer avec la valeur 5
        System.out.println("Adresse mémoire : " + System.identityHashCode(myInt));
        System.out.println("Avant l'opération : " + myInt);  // Affiche 5

// Tentative de modification de la valeur (ceci crée une nouvelle instance)
        myInt = myInt + 1;  // Cette opération crée une nouvelle instance avec la valeur 6, mais ne modifie pas l'objet initial

        System.out.println("Après l'opération : " + myInt);  // Affiche 6

// Vérification de la référence
        System.out.println("Adresse mémoire : " + System.identityHashCode(myInt));

    }
}