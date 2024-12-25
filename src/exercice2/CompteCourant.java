package exercice2;

public class CompteCourant extends CompteBancaire {
    private double decouvertAutorise;

    public CompteCourant(String numeroCompte, double solde, String nomTitulaire, double decouvertAutorise) {
        super(numeroCompte, solde, nomTitulaire);
        this.decouvertAutorise = decouvertAutorise;
    }

    @Override
    public void retrait(double montant) throws FondsInsuffisantsException {
        if (solde + decouvertAutorise >= montant) {
            solde -= montant;
            System.out.println("Retrait effectué avec découvert. Nouveau solde : " + solde);
        } else {
            throw new FondsInsuffisantsException("Fonds insuffisants même avec découvert autorisé.");
        }
    }
}
