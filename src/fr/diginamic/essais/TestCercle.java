package fr.diginamic.essais;
import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {
    public static void main(String[] args) {
        //Cercle c = new Cercle(20);
        //Cercle c1 = new Cercle(25);
        Cercle c = CercleFactory.createCercle(20);
        Cercle c1 = CercleFactory.createCercle(25);
        System.out.println("###########################");
        System.out.println("Cercle 1 perimetre => " +c.getPerimetre() );
        System.out.println("Cercle 1 rayon => " + c.getSurface() );
        System.out.println("###########################");
        System.out.println("Cercle 2 perimetre => " + c1.getPerimetre() );
        System.out.println("Cercle 2 rayon => " + c1.getSurface() );
    }
}
