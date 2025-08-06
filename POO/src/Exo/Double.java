package Exo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Double {
    private static Scanner sc = new Scanner(System.in);

    public static double saisirDouble(String message) {
        while (true) {
            try {
                System.out.print(message);
                double valeur = sc.nextDouble();
                sc.nextLine();
                return valeur;
            } catch (InputMismatchException e) {
                System.out.println("Veuillez entrer un nombre valide");
                sc.next();
            }
        }
    }
}
