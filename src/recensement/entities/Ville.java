package recensement.entities;

public class Ville extends Lieu {

    protected Region region;
    protected Departement departement;
    protected Pays pays;

    public Ville(String nom, Departement departement, Region region, String code, int population, Pays pays) {
        super(nom, nom);
        this.listeVille.add(this);
        this.population = population;
        this.region  = region;
        this.departement = departement;
        this.departement.addVille(this);
    }

    public void populationTostring(){
        System.out.println("La population de la ville " +this.nom +" est de => " +this.population + " habitants.");
    }

    public void simplepopulationTostring(){
        System.out.println(this.nom +" => " +this.population + " habitants.");
    }

    public Region getRegion() {
        return region;
    }

    public Departement getDepartement() {
        return departement;
    }

}
