package banque.entites;

public class Credit extends Operation {

    public Credit(String dateOperation, float montant) {
        super(dateOperation, montant);
    }

    public String afficherType() {
        return this.getClass().getSimpleName();
    }
}
