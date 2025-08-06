package Exo2;

public class Voiture {

    private String marque;
    private double prix;

    public Voiture() {
        this.marque = "";
        this.prix = 0.0;
    }
    public String getMarque() {
        return marque;
    }
    public double getPrix() {
        return prix;
    }
    public void setMarque(String marque) {
        this.marque = marque;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void afficher() {
        System.out.println("Informations de la voiture");
        System.out.println("Marque : " + marque);
        System.out.println("Prix : " + prix);
    }
}
