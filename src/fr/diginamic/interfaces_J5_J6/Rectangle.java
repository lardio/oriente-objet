package fr.diginamic.interfaces_J5_J6;
public class Rectangle implements ObjetGeometrique {

    protected double longueur;
    protected double largeur;

    public double surface()  {
        return longueur * 2 + largeur *2;
    };
    public double perimetre()  {
        return longueur * largeur;
    };
}