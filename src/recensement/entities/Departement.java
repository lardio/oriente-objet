package recensement.entities;

public class Departement extends Lieu {

    protected Region region;
    protected Pays pays;

    public Departement(Region region, String code, Pays pays) {
        super(code, code);
        this.pays = pays;
        this.region = region;
        this.region.addDepartement(this);
    }

    public Departement(String code, String code2) {
        super(code, code);
    }

    public void addVille(Ville ville) {
        this.listeVille.add(ville);
        this.population += ville.population;
        //Collections.sort(this.listeVille, Collections.reverseOrder());

        //maj aussi pr la region
        this.region.addVille(ville);
    }

    public void populationTostring(){
        System.out.println("La population du département " +this.nom +" est de => " +this.population + " habitants.");
    }

    public void simplepopulationTostring(){
        System.out.println(this.nom +" => " +this.population + " habitants.");
    }

    public Lieu getRegion() {
        return region;
    }

}
