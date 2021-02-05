package recensement.entities;

import java.util.ArrayList;
import java.util.List;

public class Pays extends Lieu {

    protected List<Lieu> listeDepartement = new ArrayList();
    protected List<Lieu> listeRegion = new ArrayList();

    public Pays(String code) {
        super(code, "France");
        this.nom = code;
    }

    public void populationTostring(){
        System.out.println("La population du Pays " +this.nom +" est de => " +this.population + " habitants.");
    }

    public void simplepopulationTostring(){
        System.out.println(this.nom +" => " +this.population + " habitants.");
    }

    public void addVille(Ville ville) {
        this.listeVille.add(ville);
        this.population += ville.population;
        //Collections.sort(this.listeVille, Collections.reverseOrder());
    }

    public void addDepartement(Departement departement) {
        this.listeDepartement.add(departement);
        //Collections.sort(this.listeDepartement, Collections.reverseOrder());
    }

    public void addRegion(Region region) {
        this.listeRegion.add(region);
        //Collections.sort(this.listeRegion, Collections.reverseOrder());
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
