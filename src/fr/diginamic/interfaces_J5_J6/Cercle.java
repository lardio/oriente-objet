package fr.diginamic.interfaces_J5_J6;
public class Cercle implements ObjetGeometrique {

    protected double rayon;
    public double surface()  {
        return (rayon * rayon) * 3.14;
    };
    public double perimetre()  {
        return rayon * 2 * 3.14;
    };

}
