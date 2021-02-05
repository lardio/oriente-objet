package essais;
import formes.Forme;

public class AffichageForme {

    public static void afficher(Forme forme) {
        System.out.println("Permietre : " +forme.calculerPerimetre() +". Surface : " +forme.calculerSurface() +".");
    }
}
