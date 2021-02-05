package formes;

public class Rectangle extends Forme {

    protected double longueur;
    protected double largeur;

    public double calculerSurface()  {
        return longueur * 2 + largeur *2;
    };
    public double calculerPerimetre()  {
        return longueur * largeur;
    };
}
