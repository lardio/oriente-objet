package fr.diginamic.recensement;
import fr.diginamic.recensement.entities.Departement;
import fr.diginamic.recensement.entities.Pays;
import fr.diginamic.recensement.entities.Region;
import fr.diginamic.recensement.entities.Ville;
import fr.diginamic.recensement.entities.*;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;


/**
 * Classe Recensement.
 * Parcours un fichier via la méthode rescencerFichier
 * L'ensemble des données seront accessible via la propriété pays qui contiendra un ensemble de liste organisé et hiérarchisé de Lieu.
 *
 * @see Lieu
 * @author Sylvain
 */
public class Recensement {

    protected Map<String, Ville> listeVille = new HashMap<>();
    protected Map<String, Region> listeRegion = new HashMap<>();
    protected Map<String, Departement> listeDepartement = new HashMap<>();
    protected Pays pays;

    /**
     * Parcours un fichier.
     * Pour chaque ville présente, création d'un objet Ville.
     * Pour chaque département présent, création d'un objet département.
     * Pour chaque région présente, création d'un objet région.
     *
     * Pour chaque ligne lue, on vérifie si la Region correspondante est déjà créée, si non on la créée, sinon on continue.
     * @see Region
     * On vérifie ensuite si le Departement correspondant est déjà créé, si non on le créé, sinon on continue.
     * @see Departement
     * Chaque ligne contenant une ville unique, on créé une nouvelle Ville à chaque itération.
     * @see Ville
     *
     * A chaque création d'un objet Ville, celui ci sera ajouté à l'objet Departement, Region et Pays lui correspondant.
     * L'ensemble des villes, regions et départements seront accessibles à partir du Lieu le plus "haut" dans la hiérarchie, à savoir ici dans l'objet pays.
     *
     * @param cheminFichier - String - chemin du fichier a itérer
     * @throws IOException
     *
     * @author Sylvain
     *
     */
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

    /**
     * Objet Pays qui contient l'ensemble des Lieu présents dans le fichier, et de facon organisé et hiérarchisé.
     * @see Pays
     * @return Pays
     */
    public Pays getPays() {
        return this.pays;
    }

}
