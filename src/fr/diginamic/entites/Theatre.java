package fr.diginamic.entites;

public class Theatre {

    String nom;
    int maxPersonne;
    int clientsInscrits;
    double recette;

    public void inscrire(int nbClient, float prix) {
        if(clientsInscrits + nbClient <= maxPersonne) {
            this.recette += nbClient * prix;
            this.clientsInscrits += nbClient;
            System.out.println("Inscriptions de " +nbClient +" clients.");
            System.out.println("Il reste " +(maxPersonne -  clientsInscrits) +" places.");
        } else if (clientsInscrits < maxPersonne) {
            int nbClientOK = maxPersonne - clientsInscrits;
            this.clientsInscrits += nbClientOK;
            this.recette += nbClientOK * prix;
            System.out.println("Inscriptions de " +nbClientOK +" clients sur " +nbClient +" demandes. Capacité max atteinte.");
        } else {
            System.out.println("Plus de place dans le théatre, la capacité max est déjà atteinte.");
        }
    }

    public void setMax(int max) {
        this.maxPersonne = max;
    }

    public double getRecette() {
        return recette;
    }

    public int getClientsInscrits() {
        return clientsInscrits;
    }
}
