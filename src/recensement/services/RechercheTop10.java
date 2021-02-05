package recensement.services;

import recensement.Recensement;
import recensement.entities.Lieu;

import java.util.List;
import java.util.Scanner;

public class RechercheTop10 extends MenuServices {

    public RechercheTop10(int choixMenu, String typeRecherche) {
        this.choixMenu = choixMenu;
        this.typeRecherche = typeRecherche;
    }

    public void traiter(Scanner scanner, Recensement recensement) {
        List<Lieu> choixListe  = recensement.getPays().getListeVille();

        //SI ON RECHERCHE UN TOP 10 DE FRANCE
        if( this.choixMenu == 4 || this.choixMenu == 5 || this.choixMenu == 8 ) {
            if ( this.choixMenu== 4 ) {
                choixListe = recensement.getPays().getListeRegion();
            } else if ( this.choixMenu== 5 ) {
                choixListe = recensement.getPays().getListeDepartement();
            } else {
                choixListe = recensement.getPays().getListeVille();
            }
            System.out.println("#### Top 10 des " +this.typeRecherche +" de France =>");

        //SI ON RECHERCHE UN TOP 10 DANS UNE REGION OU UN DEPARTEMENT
        } else {
            List<Lieu> choixAdditionel;

            if( this.choixMenu == 6 ) {
                System.out.println("Merci de choisir le département.");
                choixAdditionel = recensement.getPays().getListeDepartement();
                this.choix = scanner.nextLine();

            } else {
                System.out.println("Merci de choisir la région.");
                choixAdditionel = recensement.getPays().getListeRegion();
                this.choix = scanner.nextLine();
            }

            choix = verifSiEntreeExiste(choixAdditionel, choix, scanner);
            if(choix == "back") {
                return;
            } else {
                for(Lieu lieu : choixAdditionel) {
                    if( this.choix.equals(lieu.getCode()) ) {
                        choixListe = lieu.getListeVille();
                        System.out.println("#### Top 10 des villes pour le/la " +this.typeRecherche +" " +lieu.getNom() +" =>");
                    }
                }
            }
        }

        this.displayTop10(choixListe);
        System.out.println("\nPour continuer taper sur une touche.");
        scanner.nextLine();
        return;
    }
}
