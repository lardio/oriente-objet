package fr.diginamic.recensement.entities;

import java.util.ArrayList;
import java.util.List;

/** Represente une Region.
 *
 * @author Sylvain
 */
public class Region extends Lieu {

    protected Pays pays;
    protected List<Departement> listeDepartement = new ArrayList();

    public Region(String code, String nom, Pays pays) {
        super(code, nom);
        this.pays = pays;
        this.pays.addRegion(this);
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

    public List<Departement> getListeDepartement() {
        return listeDepartement;
    }
}
