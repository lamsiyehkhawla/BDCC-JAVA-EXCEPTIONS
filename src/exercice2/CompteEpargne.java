package exercice2;

public class CompteEpargne extends CompteBancaire {
    private double tauxInteret;

    public CompteEpargne(String numeroCompte, double solde, String nomTitulaire, double tauxInteret) {
        super(numeroCompte, solde, nomTitulaire);
        this.tauxInteret = tauxInteret;
    }

    public void appliquerInteret() {
        double interet = solde * tauxInteret / 100;
        solde += interet;
        System.out.println("Intérêt appliqué. Nouveau solde : " + solde);
    }
}
