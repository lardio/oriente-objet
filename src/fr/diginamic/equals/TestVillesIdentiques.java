package fr.diginamic.equals;

public class TestVillesIdentiques {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Ville chauche = new Ville("Chauche", 2300);
        Ville chauche2 = new Ville("Chauche", 2300);
        Ville dompierre = new Ville("Dompierre", 4000);
        System.out.println(chauche.toString());
        System.out.println(dompierre.toString());
        System.out.println();

        if (chauche.equals(chauche2)) {
            System.out.println("Les 2 villes sont identiques.");
        } else {
            System.out.println("Les 2 villes sont différentes.");
        }
        if (chauche == chauche2) {
            System.out.println("Les 2 villes sont identiques.");
        } else {
            System.out.println("Les 2 villes sont différentes.");
        }
    }

}