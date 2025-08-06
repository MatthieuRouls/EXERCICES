package Exo3;

public class Rectangle {
    private Double longueur;
    private Double largeur;

    public Rectangle(Double longueur, Double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }
    public Double getLongueur() {
        return longueur;
    }
    public void setLongueur(Double longueur) {
        this.longueur = longueur;
    }
    public Double getLargeur() {
        return largeur;
    }
    public void setLargeur(Double largeur) {
        this.largeur = largeur;
    }

    public Double surface() {
        return this.longueur * this.largeur;
    }
    public Double perimetre() {
        return ((this.longueur + this.largeur)*2);
    }
    public void afficher() {
        System.out.println("Surface : " + surface());
        System.out.println("Perimetre : " + perimetre());
    }


}
