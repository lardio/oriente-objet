package fr.diginamic.recensement.entities;

public class Ville extends Lieu {

    protected Region region;
    protected Departement departement;
    protected Pays pays;

    /** Represente une Ville.
     * A chaque creation d'une Ville, les autres Lieu passés en parametres du constructeur recoivent cette Ville en propriétés dans listeVilles.
     * La population de cette ville s'ajoute a chaque Lieu passés en constructeur.
     *
     * @author Sylvain
     */
    public Ville(String nom, Departement departement, Region region, String code, int population, Pays pays) {
        super(nom, nom);
        this.listeVille.add(this);
        this.population = population;
        this.departement = departement;
        this.region = region;
        this.pays = pays;
        this.departement.addVille(this);
        this.region.addVille(this);
        this.pays.addVille(this);
    }

    public Region getRegion() {
        return region;
    }

    public Departement getDepartement() {
        return departement;
    }

}
