package recensement.entities;

import java.util.ArrayList;
import java.util.List;

public class Region extends Lieu {

    protected Pays pays;
    protected List<Departement> listeDepartement = new ArrayList();

    public Region(String code, String nom, Pays pays) {
        super(code, nom);
        this.pays = pays;
        this.pays.addRegion(this);
    }

    public void populationTostring(){
        System.out.println("La population de la région " +this.nom +" est de => " +this.population + " habitants.");
    }

    public void simplepopulationTostring(){
        System.out.println(this.nom +" => " +this.population + " habitants.");
    }

    public void addVille(Ville ville) {
        this.listeVille.add(ville);
        this.population += ville.population;
        //Collections.sort(this.listeVille, Collections.reverseOrder());
        this.pays.addVille(ville);
    }

    public void addDepartement(Departement departement) {
        this.listeDepartement.add(departement);
        //Collections.sort(this.listeDepartement, Collections.reverseOrder());
        this.pays.addDepartement(departement);
    }

    public List<Departement> getListeDepartement() {
        return listeDepartement;
    }

    public List<Lieu> getListeVille() {
        return listeVille;
    }

}
