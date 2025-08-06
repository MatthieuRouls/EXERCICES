package Exo;

import java.util.Scanner;

import static Exo.Menu.afficherMenu;
import static Exo.Entier.saisirEntier;
import static Exo.Double.saisirDouble;

public class TestCompte {
    private static Scanner sc = new Scanner(System.in);

    public static void test() {

        Compte monCompte = new Compte();
        boolean continuer = true;

        while (continuer) {
            afficherMenu();
            int choix = saisirEntier("Votre choix: ");

            switch (choix) {
                case 1:
                    System.out.println("\n=== Montant du dépot:  ===");
                    double montantDepot = saisirDouble("Montant: ");
                    monCompte.deposer(montantDepot);
                    break;

                case 2:
                    System.out.println("\n=== Montant du retrait: ===");
                    double montantRetirer = saisirDouble("Montant: ");
                    monCompte.retirer(montantRetirer);
                    break;

                case 3:
                    System.out.println("\n=== Solde: ===");
                    monCompte.afficher();
                    break;

                case 0:
                    continuer = false;
                break;

                default:
                    System.out.println("Le choix n'est pas un valeur valide.");
                    break;
            }
            if (continuer) {
                System.out.println("\n" + "=".repeat(50));
                System.out.print("Appuyez sur Entree pour revenir au menu.");
                sc.nextLine();
                sc.nextLine();
            }

        }
    }
}
