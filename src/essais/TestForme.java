package essais;

import formes.Carre;

public class TestForme {

    public static void main(String[] args) {
        Carre carre = new Carre();
        carre.setLongueur(40);
        AffichageForme.afficher(carre);
    }
}
