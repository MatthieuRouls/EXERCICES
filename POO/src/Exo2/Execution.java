package Exo2;
import Exo2.Voiture;

public class Execution {
    public static void execute () {
        System.out.println("Démonstration classe voiture");

        Voiture voiture1 = new Voiture();
        System.out.println("Voiture créée avec le constructeur par défaut");
        voiture1.afficher();

        voiture1.setMarque("Peugeot 206");
        voiture1.setPrix(2000.25);

        System.out.println("Après modification");
        voiture1.afficher();


        Voiture voiture2 = new Voiture();
        voiture2.setMarque("Ferrari Enzo");
        voiture2.setPrix(200000);

        System.out.println("Deuxième voiture avec modification directe");
        voiture2.afficher();

        System.out.println("Utilisation des getters");
        System.out.println("Marque de la première voiture " + voiture1.getMarque());
        System.out.println("Prix de la première voiture " + voiture1.getPrix() + "€");
    }
}
