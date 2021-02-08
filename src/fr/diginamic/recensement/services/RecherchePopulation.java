package fr.diginamic.recensement.services;
import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.entities.Lieu;

import java.util.List;
import java.util.Scanner;

/**
 * Classe gérant la recherche d'un Lieu.
 * Affiche les informations de n'importe quel Lieu (son nom et sa population).
 *
 * @author Sylvain
 *
 */
public class RecherchePopulation extends MenuServices {

    /**
     * Constructeur de RecherchePopulation
     * @param choixMenu, int qui permet d'identifier le type de Lieu recherché.
     * @param typeRecherche, String qui précise le type de Lieu recherché, utilisé pour afficher le type de Lieu recherché à l'utilisateur.
     */
    public RecherchePopulation(int choixMenu, String typeRecherche) {
        this.choixMenu = choixMenu;
        this.typeRecherche = typeRecherche;
    }

    /**
     * Retourne les informations concernants n'importe quel type de Lieu.
     * Le lieu recherché est filtré par le choix utilisateur identifié par la propriété choixMenu.
     * Controle si le lieu recherché existe, via la methode verifSiEntreeOk de MenuServices.
     * @see MenuServices
     *
     * @param scanner
     * @param recensement
     */
    public void traiter(Scanner scanner, Recensement recensement) {
        System.out.println("Merci de choisir un(e) " + typeRecherche);
        choix = scanner.nextLine();
        List<Lieu> choixListe;

        if(choixMenu == 3) {
            choixListe = recensement.getPays().getListeRegion();
        } else if(choixMenu == 2) {
            choixListe = recensement.getPays().getListeDepartement();
        } else {
            choixListe = recensement.getPays().getListeVille();
        }

        choix = verifSiEntreeExiste(choixListe, choix, scanner);
        if(choix == "back") {
            return;
        }

        for(Lieu lieu : choixListe) {
            if( choix.equals(lieu.getCode()) ) {
                lieu.getInformations();
            }
        }

        System.out.println("\n########## Pour continuer taper sur une touche. ##########");
        scanner.nextLine();
        return;
    }

}
