package recensement;
import recensement.entities.*;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;

public class Recensement {

    protected Map<String, Ville> listeVille = new HashMap<>();
    protected Map<String, Region> listeRegion = new HashMap<>();
    protected Map<String, Departement> listeDepartement = new HashMap<>();
    protected Pays pays;

    public void rescencerFichier(String cheminFichier) throws IOException {
        pays = new Pays("France");
        Path pathOrigine = Paths.get(cheminFichier); //fichier a copier
        List<String> lignesFichier = Files.readAllLines(pathOrigine, StandardCharsets.UTF_8);

        for(String ligne : lignesFichier) {
            String[] colonne = ligne.split(";");

            if(colonne[0].matches("-?\\d+")) { // evite les en-tetes
                int populationTotale = Integer.parseInt(colonne[9].replaceAll("\\s+",""));
                String codeRegion = colonne[0];
                String codeDepartement = colonne[2];
                String codeVille = colonne[5];

                if(!listeRegion.containsKey(codeRegion)) {
                    Region region = new Region(codeRegion, colonne[1], pays);
                    listeRegion.put(codeRegion, region);
                }

                if(!listeDepartement.containsKey(codeDepartement)) {
                    Departement departement = new Departement(listeRegion.get(codeRegion), codeDepartement, pays);
                    listeDepartement.put(codeDepartement, departement);
                }

                Ville ville = new Ville(colonne[6], listeDepartement.get(codeDepartement), listeRegion.get(codeRegion), codeVille, populationTotale, pays);
                listeVille.put(colonne[6], ville);
            }
        }
    }

    public Pays getPays() {
        return this.pays;
    }

}
