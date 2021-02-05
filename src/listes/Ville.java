package listes;

import java.util.*;

public class Ville {
    protected String nom;
    protected int nbHabitants;

    public Ville(String nom, int hab) {
        this.nom = nom;
        this.nbHabitants = hab;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbHabitants() {
        return nbHabitants;
    }

    public void setNbHabitants(int nbHabitants) {
        this.nbHabitants = nbHabitants;
    }

    public static void main(String args[]) {
        ArrayList<Ville> strings = new ArrayList<Ville>(Arrays.asList(new Ville("Nice", 343000), new Ville("Carcassonne,", 47800), new Ville("Narbonne,", 53400), new Ville("Lyon,", 484000), new Ville("Foix,", 9700), new Ville("Pau,", 77200), new Ville("Marseille,", 850700), new Ville("Tarbes,", 40600)));
        Ville maxHab = Collections.max(strings, Comparator.comparing(c -> c.getNbHabitants()));
        System.out.println("#### VILLE LA PLUS PEUPLÉE ####");
        System.out.println(maxHab.getNom() +" - " +maxHab.getNbHabitants());

        //supression ville moins peuplée
        int moinPeuplée = strings.indexOf(Collections.min(strings, Comparator.comparing(c -> c.getNbHabitants())));
        strings.remove(moinPeuplée);

        //ajout nom en MAJ pr ville plus peuplée
        Iterator<Ville> iteratorVilles = strings.iterator();
        while(iteratorVilles.hasNext()) {
            Ville actuelleVille = iteratorVilles.next();
            if(actuelleVille.getNbHabitants() > 100000) {
                actuelleVille.setNom(actuelleVille.getNom().toUpperCase());
            }
        }

        System.out.println("\n#### RESULTAT FINAL ####");
        for (Ville ville : strings) {
            System.out.println(ville.getNom() + " - " +ville.getNbHabitants());
        }
    }
}