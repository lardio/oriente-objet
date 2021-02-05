package essais;
import entites.Cercle;
import utils.CercleFactory;

public class TestCercle {
    public static void main(String[] args) {
        //Cercle c = new Cercle(20);
        //Cercle c1 = new Cercle(25);
        Cercle c = CercleFactory.createCercle(20);
        Cercle c1 = CercleFactory.createCercle(25);
        System.out.println(c.getPerimetre());
        System.out.println(c.getSurface());
    }
}
