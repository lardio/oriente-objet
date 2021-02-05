package recensement.services;
import recensement.Recensement;
import recensement.entities.Lieu;

import java.util.List;
import java.util.Scanner;

public class RecherchePopulation extends MenuServices {

    public RecherchePopulation(int choixMenu, String typeRecherche) {
        this.choixMenu = choixMenu;
        this.typeRecherche = typeRecherche;
    }

    public void traiter(Scanner scanner, Recensement recensement) {
        System.out.println("Merci de choisir un(e) " + typeRecherche);
        choix = scanner.nextLine();
        List<Lieu> choixListe;
        if(choixMenu == 3) {
            choixListe = recensement.getPays().getListeRegion();
        }
        else if(choixMenu == 2) {
            choixListe = recensement.getPays().getListeDepartement();
        }
        else {
            choixListe = recensement.getPays().getListeVille();
        }

        choix = verifSiEntreeExiste(choixListe, choix, scanner);
        if(choix == "back") {
            return;
        } else {
            for(Lieu lieu : choixListe) {
                if( choix.equals(lieu.getCode()) ) {
                    lieu.populationTostring();
                }
            }
        }

        System.out.println("\n########## Pour continuer taper sur une touche. ##########");
        scanner.nextLine();
        return;
    }

}
