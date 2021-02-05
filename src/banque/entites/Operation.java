package banque.entites;

public abstract class Operation {

    protected String operation;
    protected float montant;

    public Operation(String dateOperation, float montant) {
        this.operation = dateOperation;
        this.montant = montant;
    }

    public abstract String afficherType();

}