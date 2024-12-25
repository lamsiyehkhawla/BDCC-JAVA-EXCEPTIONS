package exercice2;

import java.util.ArrayList;

public class main_Compte_bancaire {
    public static void main(String[] args) {
        ArrayList<CompteBancaire> comptes = new ArrayList();
        CompteCourant cc1 = new CompteCourant("123456", 1000, "Mme.A", 200);
        CompteEpargne ce1 = new CompteEpargne("654321", 5000, "M.B", 5);
        comptes.add(cc1);
        comptes.add(ce1);

        try {
            cc1.depot(200);
            cc1.retrait(500);
            cc1.transfer(ce1, 300);
            ce1.appliquerInteret();
            cc1.afficherSolde();
            ce1.afficherSolde();
        } catch (FondsInsuffisantsException | CompteInexistantException e) {
            System.out.println(e.getMessage());
        }
        // Supprimer un compte
        comptes.remove(cc1);
    }
}
