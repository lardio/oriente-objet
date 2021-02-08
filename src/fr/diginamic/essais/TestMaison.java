package fr.diginamic.essais;

import fr.diginamic.maison.*;

public class TestMaison {
    public static void main(String[] args) {

        Piece wc = new WC(23, 1);
        Piece salon = new Salon(23, 1);
        Piece bain = new SalleDeBain(23, 2);

        Maison maison = new Maison();
        maison.ajouterPiece(wc);
        maison.ajouterPiece(salon);
        maison.ajouterPiece(bain);
        //maison.ajouterPiece(null);
        //System.out.println("ok");
        System.out.println("Superficie de la maison : " +maison.getSuperficieTotale());
        System.out.println("Superficie de la maison au 1er etage : " +maison.getSuperficieTotaleEtage(1));
    }
}
