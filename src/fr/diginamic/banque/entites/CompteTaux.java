package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {

    private float tauxRemuneration;

    public CompteTaux(int numeroCompte, float soldeCompte, float taux) {
        super(numeroCompte, soldeCompte);
        tauxRemuneration = taux;
    }

    public float getTaux() {
        return tauxRemuneration;
    }

    public void setTaux(float taux) {
        tauxRemuneration = taux;
    }

    @Override
    public String toString() {
        return  super.toString() + ". Votre taux est de " +tauxRemuneration;
    }

}
