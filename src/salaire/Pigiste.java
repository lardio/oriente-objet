package salaire;

public class Pigiste extends Intervanant {
    protected int nbJours;
    protected double montantJournalier;

    public double getSalaire() {
        return montantJournalier * nbJours;
    };

    public void setNbJours(int jours) {
        this.nbJours = jours;
    }

    public void setMontantJournalier(double montant) {
        this.montantJournalier = montant;
    }
}
