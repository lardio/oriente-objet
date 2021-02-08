package fr.diginamic.equals;

public class Ville {

    protected Integer population = 0;
    protected String nom;

    /** Represente une Ville.
     * A chaque creation d'une Ville, les autres Lieu passés en parametres du constructeur recoivent cette Ville en propriétés dans listeVilles.
     * La population de cette ville s'ajoute a chaque Lieu passés en constructeur.
     *
     * @author Sylvain
     */
    public Ville(String nom, int population) {
        this.population = population;
        this.nom = nom;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Ville)) {
            return false;
        } else {
            Ville ville = (Ville) obj;
            System.out.println(nom);
            System.out.println(ville.getNom());
            System.out.println(population);
            System.out.println(ville.getPopulation());
            if ( nom.equals(ville.getNom()) && population.equals(ville.getPopulation()) ) {
                return true;
            } else {
                return false;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Ville => ");
        builder.append(nom);
        builder.append(". Population => ");
        builder.append(population);
        builder.append(" habitants.");
        return builder.toString();
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}