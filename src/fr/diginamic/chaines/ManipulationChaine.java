package fr.diginamic.chaines;
import fr.diginamic.entites.Salarie;

public class ManipulationChaine {

    public static void main(String[] args) {
        String chaine = "Durand;Marcel;2 523.5";
        char premierCaractere = chaine.charAt(0);
        System.out.println("Premier caractère: " + premierCaractere);
        System.out.println("Longueur chaie: " + chaine.length());
        System.out.println("Index premier ';' : " + chaine.indexOf(';'));

        String nomFamille = chaine.substring(0, chaine.indexOf(';'));
        System.out.println("Nom famille majuscule : " + nomFamille.toUpperCase());
        System.out.println("Nom famille minuscule : " + nomFamille.toLowerCase());

        String[] tableau = chaine.split(";");
        Salarie salarié = new Salarie(tableau[0], tableau[1], Double.parseDouble(tableau[2].replace(" ", "")) );
    }
}
