package fr.diginamic.recensement.entities;

/** Represente un Departement.
 *
 * @author Sylvain
 */
public class Departement extends Lieu {

    protected Region region;
    protected Pays pays;

    public Departement(Region region, String code, Pays pays) {
        super(code, code);
        this.pays = pays;
        this.region = region;
        this.region.addDepartement(this);
        this.pays.addDepartement(this);
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

    public Lieu getRegion() {
        return region;
    }

}
