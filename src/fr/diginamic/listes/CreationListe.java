package fr.diginamic.listes;

import java.util.ArrayList;

public class CreationListe {
    public static void main(String[] args) {
        ArrayList<Integer> liste = new ArrayList<Integer>();
        for (int i = 1; i <=100; i++) {
            liste.add(i);
            System.out.println(liste.get(i-1));
        }
    }
}
