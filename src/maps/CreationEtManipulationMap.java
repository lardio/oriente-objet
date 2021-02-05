package maps;

import java.util.HashMap;
import java.util.Iterator;

public class CreationEtManipulationMap {

    public static void main(String args[]) {
        HashMap<Integer, String> mapVilles = new HashMap<>();
        mapVilles.put(13, "Marseille");
        mapVilles.put(34, "Montpellier");
        mapVilles.put(44, "Nantes");
        mapVilles.put(75, "Paris");
        mapVilles.put(31, "Toulouse");
        mapVilles.put(33, "Bordeaux");
        mapVilles.put(59, "Lille");
        mapVilles.put(69, "Lyon");

        Iterator<Integer> iterDep = mapVilles.keySet().iterator();
        Iterator<String> iterVille = mapVilles.values().iterator();
        while(iterDep.hasNext()) {
            Integer departement = iterDep.next();
            System.out.println(departement +" - " +mapVilles.get(departement));
        }
        System.out.println("Taille de la map => " +mapVilles.size());
    }

}
