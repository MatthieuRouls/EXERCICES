package Exo;

public class Compte {
    private double solde;

    public Compte() {
        this.solde = 0.0;
    }
    public double getSolde() {
        return this.solde;
    }
    public void setSolde(double nouveauSolde) {
        if  (nouveauSolde < 0) {
            System.out.println("Erreur");
            return;
        }
        this.solde = nouveauSolde;
    }

    public boolean deposer(double montantDepot) {
        if (montantDepot <= 0) {
            System.out.println("Le montant doit être positif");
            return false;
        }
        this.setSolde(this.getSolde() + montantDepot);
        System.out.println("Votre dépot de " + montantDepot + "€ a été effectué.");
        System.out.println("Nouveau solde: " + this.solde);
        return true;
    }

    public boolean retirer(double montantRetrait) {
        if (montantRetrait <= 0) {
            System.out.println("Le montant doit être positif");
            return false;
        }
        if (this.getSolde() < montantRetrait) {
            System.out.println("Solde insuffisant");
            return false;
        }
        this.setSolde(this.getSolde() - montantRetrait);
        System.out.println("Votre retrait de " + montantRetrait + " a bien été effectué");
        System.out.println("Nouveau solde: " + this.solde);
        return true;
    }


    public void afficher() {
        System.out.println("Votre solde: " + this.getSolde() + "€.");
    }


}

