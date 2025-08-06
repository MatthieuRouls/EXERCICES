package Exo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entier {
    private static Scanner sc = new Scanner(System.in);

    public static int saisirEntier (String message) {
        while (true) {
            try {
                System.out.print(message);
                int valeur = sc.nextInt();
                sc.nextLine();
                return valeur;
            } catch (InputMismatchException e) {
                System.out.println("Veuillez entrer une valeur valide.");
                sc.nextLine();
            }
        }
    }
}
