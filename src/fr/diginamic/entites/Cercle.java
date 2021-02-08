package fr.diginamic.entites;

public class Cercle {

    protected double rayon;

    public Cercle (double rayon) {
        this.rayon = rayon;
    }

    //rayon x 2 x π
    public double getPerimetre() {
        return rayon * 2 * 3.14;
    }

    public double getSurface() {
        return (rayon * rayon) * 3.14;
    }
}
