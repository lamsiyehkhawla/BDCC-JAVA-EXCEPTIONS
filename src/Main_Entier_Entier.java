//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main_Entier_Entier {
    public static void main(String[] args) {
        try {
            // Création d'un objet EntierNaturel avec une valeur valide
            EntierNaturel entier = new EntierNaturel(5);
            System.out.println("Valeur initiale : " + entier.getVal());

            // Test de la méthode setVal avec une valeur valide
            entier.setVal(3);
            System.out.println("Valeur après modification : " + entier.getVal());

            // Test de la méthode decrementer
            entier.decrement();
            System.out.println("Valeur après décrémentation : " + entier.getVal());

            // Test de l'exception avec une valeur négative pour setVal
            entier.setVal(-1);
        } catch (NombreNegatifException e) {
            // Affichage de l'exception et de la valeur erronée
            System.out.println(e.getMessage());
            System.out.println("Valeur erronée : " + e.getValEro());
        }

        try {
            // Test de l'exception avec une valeur négative pour le constructeur
            EntierNaturel entierNegatif = new EntierNaturel(-5);
        } catch (NombreNegatifException e) {
            // Affichage de l'exception et de la valeur erronée
            System.out.println(e.getMessage());
            System.out.println("Valeur erronée : " + e.getValEro());
        }

        try {
            // Test de la méthode decrementer avec une valeur déjà à 0
            EntierNaturel entierZero = new EntierNaturel(0);
            entierZero.decrement();
        } catch (NombreNegatifException e) {
            // Affichage de l'exception et de la valeur erronée
            System.out.println(e.getMessage());
            System.out.println("Valeur erronée : " + e.getValEro());
        }
    }
    }
