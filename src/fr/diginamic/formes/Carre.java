package fr.diginamic.formes;

public class Carre extends Rectangle {

    private double longueur;

    public double calculerSurface()  {
        return longueur * 4;
    };

    public double calculerPerimetre()  {
        return longueur * longueur;
    };

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getLongueur() {
        return longueur;
    }

}
