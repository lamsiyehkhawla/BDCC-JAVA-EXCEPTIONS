package exercice1;

public class NombreNegatifException extends Exception {
    private final int valEro;
    public NombreNegatifException(String message,int valEro) {
        super(message);
        this.valEro=valEro;
    }

    public int getValEro() {
        return valEro;
    }
}
