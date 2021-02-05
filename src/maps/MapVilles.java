package maps;

import listes.Ville;

import java.util.*;

public class MapVilles {

    public static void main(String[] args) {
        Ville nice = new Ville("Nice", 343000);
        Ville carcassonne = new Ville("Carcassonne", 47800);
        Ville narbonne = new Ville("Narbonne", 53400);
        Ville lyon = new Ville("Lyon", 484000);
        Ville pau = new Ville("Pau", 77200);
        Ville marseille = new Ville("Marseille", 850700);
        Ville tarbes = new Ville("Tarbes", 40600);


        HashMap<String, Ville> mapVilles = new HashMap<>();
        mapVilles.put(nice.getNom(), nice);
        mapVilles.put(carcassonne.getNom(), carcassonne);
        mapVilles.put(narbonne.getNom(), narbonne);
        mapVilles.put(lyon.getNom(), lyon);
        mapVilles.put(pau.getNom(), pau);
        mapVilles.put(marseille.getNom(), marseille);
        mapVilles.put(tarbes.getNom(), tarbes);

        List<Ville> villeList = new ArrayList<>(mapVilles.values());
        mapVilles.remove(villeList.get(villeList.indexOf(Collections.min(villeList, Comparator.comparing(c -> c.getNbHabitants())))).getNom());

        Iterator<String> iterVille = mapVilles.keySet().iterator();
        while(iterVille.hasNext()) {
            String nomVille = iterVille.next();
            System.out.println(nomVille);
        }
    }
}
