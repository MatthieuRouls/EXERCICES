package Exo3;
import Exo3.Rectangle;


public class TestRectangle {
    public static void resultats() {
        System.out.println("TEST DE LA CLASSE RECTANGLE\n");

        System.out.println("Rectangle normal");
        Rectangle rectangle1 = new Rectangle(10.5, 7.3);
        rectangle1.afficher();

        System.out.println("Surface calculée séparément : " + rectangle1.surface());
        System.out.println("Périmètre calculé séparément : " + rectangle1.perimetre());


        System.out.println("\nModification avec setters");
        Rectangle rectangle3 = new Rectangle(1.0, 1.0);
        System.out.println("Rectangle initial :");
        rectangle3.afficher();

        rectangle3.setLongueur(15.0);
        rectangle3.setLargeur(9.5);
        System.out.println("Après modification :");
        rectangle3.afficher();
    }
}