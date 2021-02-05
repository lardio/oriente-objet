package recensement.entities;

import java.util.ArrayList;
import java.util.List;

public abstract class Lieu implements Comparable {

    protected Integer population = 0;
    protected String code;
    protected String nom;
    protected List<Lieu> listeVille = new ArrayList();

    Lieu(String code, String nom) {
        this.code = code;
        this.nom = nom;
    }

    public abstract void populationTostring();

    public abstract void simplepopulationTostring();

    public List<Lieu> getListeVille() {
        return listeVille;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getPopulation() {
        return population;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public int compareTo(Object o) {
        Lieu autreLieu = (Lieu)o;
        return this.population.compareTo(autreLieu.population);
    }
}
