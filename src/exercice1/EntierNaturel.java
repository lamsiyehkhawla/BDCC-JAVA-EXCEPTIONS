package exercice1;

public class EntierNaturel {
    int val;
        // // Constructeur pour initialiser val avec un entier
    public EntierNaturel(int val) throws NombreNegatifException {
        if (val < 0){ throw new NombreNegatifException("Nombre negatif",val);}
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) throws NombreNegatifException {
        if (val < 0){ throw new NombreNegatifException("Nombre negatif",val);}
        this.val = val;
    }

    public void decrement() throws NombreNegatifException {
        if (val - 1 < 0) {
            throw new NombreNegatifException("Impossible de décrémenter, la valeur deviendrait négative.",val);}
        val--;
    }
}
