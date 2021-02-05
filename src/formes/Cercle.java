package formes;

public class Cercle extends Forme {

    protected double rayon;

    public double calculerSurface()  {
        return (rayon * rayon) * 3.14;
    };

    public double calculerPerimetre()  {
        return rayon * 2 * 3.14;
    };

}
