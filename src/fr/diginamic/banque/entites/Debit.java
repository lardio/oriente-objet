package fr.diginamic.banque.entites;

public class Debit extends Operation {

    public Debit(String dateOperation, float montant) {
        super(dateOperation, montant);
    }

    public String afficherType() {
        return this.getClass().getSimpleName();
    }
}
