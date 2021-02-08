package fr.diginamic.recensement.entities;

import java.util.ArrayList;
import java.util.List;

/** Represente un Pays. Lieu le plus haut dans la hiérarchie.
 * Contient des listes completes de chaque type de Lieu.
 * Chaque liste contient des listes de Lieu inférieur dans la hiérarchie.
 *
 * @author Sylvain
 */
public class Pays extends Lieu {

    protected List<Lieu> listeDepartement = new ArrayList();
    protected List<Lieu> listeRegion = new ArrayList();

    public Pays(String code) {
        super(code, "France");
        this.nom = code;
    }

    /**
     * Ajoute un objet Ville a la propriété listeVille.
     * Incrémente la propriété polutation avec la population de la Ville
     * @see Ville
     * @param ville
     */
    public void addVille(Ville ville) {
        this.listeVille.add(ville);
        this.population += ville.population;
    }

    /**
     * Ajoute un objet Departement a la propriété listeDepartement.
     * @see Ville
     * @param departement
     */
    public void addDepartement(Departement departement) {
        this.listeDepartement.add(departement);
    }

    /**
     * Ajoute un objet Region a la propriété listeRegion.
     * @see Ville
     * @param region
     */
    public void addRegion(Region region) {
        this.listeRegion.add(region);
    }

    public List<Lieu> getListeDepartement() {
        return listeDepartement;
    }

    public List<Lieu> getListeRegion() {
        return listeRegion;
    }

    public String getNom() {
        return nom;
    }
}
