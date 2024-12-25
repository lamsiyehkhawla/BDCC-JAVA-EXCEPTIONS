public abstract class CompteBancaire {
    protected String numeroCompte;
    protected String nom;
    protected double solde;

    public CompteBancaire(String numeroCompte, double solde,String nom) {
        this.numeroCompte = numeroCompte;
        this.nom = nom;
        this.solde = solde;
    }

    public void depot(double solde) {
        if(solde>0){
            solde += solde;
            System.out.println("Deposit done. New solde: " + solde);
        }else{
            System.out.println("Solde invalid");
        }

    }

    public void retrait(double retrait) throws FondsInsuffisantsException {
      if (retrait<=solde){
          solde-=retrait;
          System.out.println("Retrait done. New solde: " + solde);
      }else {
          throw new FondsInsuffisantsException("Fonds insuffisant");
      }
    }

    public void afficherSolde() {
        System.out.println("Solde: " + solde);
    }
    public void transfer(CompteBancaire destinataire,double soldeTrans) throws FondsInsuffisantsException ,CompteInexistantException {
        if (destinataire==null){
             throw new CompteInexistantException("Compte inexistant");
        }
        if (soldeTrans<=solde){
            this.retrait(soldeTrans);
            destinataire.depot(soldeTrans);
            System.out.println("Transfer done. New solde: " + solde+", to destinataire: " + destinataire);
        }else {
            throw new FondsInsuffisantsException("Fonds insuffisant pour le transfert");
        }
    }
}
