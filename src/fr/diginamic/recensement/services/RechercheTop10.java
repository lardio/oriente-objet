package fr.diginamic.recensement.services;

import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.entities.Lieu;

import java.util.List;
import java.util.Scanner;

/**
 * Classe gérant l'affichage de 10 Lieux les plus peuplés à partir d'un Lieu ayant une hiérarchie plus haute.
 * Affiche les 10 Lieu les plus peuplés d'un Lieu.
 *
 * @author Sylvain
 *
 */
public class RechercheTop10 extends MenuServices {

    /**
     * Constructeur de RecherchePopulation
     * @param choixMenu, int qui permet d'identifier le type de Lieu recherché.
     * @param typeRecherche, String qui précise le type de Lieu recherché, utilisé pour afficher le type de Lieu recherché à l'utilisateur.
     */
    public RechercheTop10(int choixMenu, String typeRecherche) {
        this.choixMenu = choixMenu;
        this.typeRecherche = typeRecherche;
    }

    /**
     * Retourne les les 10 Lieu les plus peuplés d'un Lieu.
     * Les lieu recherchés sont filtrés par le choix utilisateur identifié par la propriété choixMenu.
     * Controle si le lieu parent au 10 autres lieu existe.
     * L'affichage des 10 Lieu est géré par la propriété displayTop10 de la classe parente MenuServices.
     * @see MenuServices
     *
     * @param scanner
     * @param recensement
     */
    public void traiter(Scanner scanner, Recensement recensement) {
        List<Lieu> choixListe  = recensement.getPays().getListeVille();

        if( this.choixMenu == 4 || this.choixMenu == 5 || this.choixMenu == 8 ) {
            if ( this.choixMenu== 4 ) {
                choixListe = recensement.getPays().getListeRegion();
            } else if ( this.choixMenu== 5 ) {
                choixListe = recensement.getPays().getListeDepartement();
            } else {
                choixListe = recensement.getPays().getListeVille();
            }
            System.out.println("#### Top 10 des " +this.typeRecherche +" de France =>");

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
            }

            for(Lieu lieu : choixAdditionel) {
                if( this.choix.equals(lieu.getCode()) ) {
                    choixListe = lieu.getListeVille();
                    System.out.println("#### Top 10 des villes pour le/la " +this.typeRecherche +" " +lieu.getNom() +" =>");
                }
            }

        }

        this.displayTop10(choixListe);
        System.out.println("\nPour continuer taper sur une touche.");
        scanner.nextLine();
        return;
    }
}
