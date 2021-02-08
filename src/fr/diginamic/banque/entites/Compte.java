package fr.diginamic.banque.entites;

public class Compte {

    private int numeroCompte;
    private float soldeCompte;

    public int getNumeroCompte() {
        return numeroCompte;
    }

    public float getSolde() {
        return soldeCompte;
    }

    public void setNumeroCompte(int num) {
        numeroCompte = num;
    }

    public void setSolde(float solde) {
        soldeCompte = solde;
    }

    public Compte (int numero, float solde) {
        numeroCompte = numero;
        soldeCompte = solde;
    }

    @Override
    public String toString() {
        return "Votre numero de compte est le " + numeroCompte + ". Votre solde est de : " +soldeCompte;
    }

}
