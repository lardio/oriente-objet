package fr.diginamic.listes_J5_J6;

import java.util.*;

public class TestListeString {
    public static void main(String args[]) {
        ArrayList<String> strings = new ArrayList<String>(Arrays.asList("Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes"));
        int indexMaxString = strings.indexOf(Collections.max(strings, Comparator.comparing(String::length)));
        System.out.println("La ville qui a le plus long nom est : " +strings.get(indexMaxString));
        for (String ville : strings) {
            strings.set(strings.indexOf(ville), ville.toUpperCase());
        }
        System.out.println("#### NOM EN MAJUSCULE ####");
        System.out.println(strings);

        Iterator<String> iteratorVilles = strings.iterator();
        while(iteratorVilles.hasNext()) {
            String actuelleVille = iteratorVilles.next();
            char premiereLettre = actuelleVille.charAt(0);
            if(premiereLettre == 'N') {
                iteratorVilles.remove();
            }
        }

        System.out.println("#### LISTE APRES SUPRESSION VILLE COMMENCANT PAR N ####");
        System.out.println(strings);
    }
}
