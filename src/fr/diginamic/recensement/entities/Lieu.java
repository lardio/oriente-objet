package fr.diginamic.recensement.entities;

import java.util.ArrayList;
import java.util.List;

/** Represente un lieu
 * @author sylvain
 */
public abstract class Lieu implements Comparable {

    protected Integer population = 0;
    protected String code;
    protected String nom;
    protected List<Lieu> listeVille = new ArrayList();


    /**
     * Constructeur d'un Lieu
     * @param code - clé unique d'un lieu
     * @param nom - nom d'un lieu
     */
    Lieu(String code, String nom) {
        this.code = code;
        this.nom = nom;
    }

    /**
     * Affiche les informations d'un lieu dans la console. Son nom et sa population
     */
    public void getInformations() {
        System.out.println(this.nom + " => " +this.population + " habitants.");
    }

    /**
     * @return une liste de Ville
     * @see Ville
     */
    public List<Lieu> getListeVille() { return listeVille; }

    /**
     * @return le code d'un lieu.
     */
    public String getCode() { return code; }


    public String getNom() { return nom; }

    /**
     * Tri des lieux en fonction de leur population
     * @param o
     * @return
     */
    @Override
    public int compareTo(Object o) {
        Lieu autreLieu = (Lieu)o;
        return this.population.compareTo(autreLieu.population);
    }
}
