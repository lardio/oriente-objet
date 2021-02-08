package fr.diginamic.listes_J5_J6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestListeInt {
    public static void main(String args[]) {

        ArrayList<Integer> nombres = new ArrayList<Integer>(Arrays.asList(-1, 5, 7, 3, -2, 4, 8, 5));
        System.out.println("#### CONTENU DE LA LISTE ####");
        System.out.println(nombres);
        System.out.println("#### TAILLE DE LA LISTE ####");
        System.out.println(nombres.size());
        System.out.println("#### PLUS GRAND NOMBRE DE LA LISTE ####");
        System.out.println(Collections.max(nombres));
        System.out.println("#### PLUS GRAND NOMBRE DE LA LISTE ####");
        System.out.println(Collections.max(nombres));
        System.out.println("#### PLUS PETIT NOMBRE DE LA LISTE ####");
        int minIndex = nombres.indexOf(Collections.min(nombres));
        int min = Collections.min(nombres);
        System.out.println("index : " +minIndex +". Valeur : " +min);
        nombres.remove(minIndex);
        System.out.println("#### LISTE SANS PLUS PETIT NOMBRE ####");
        System.out.println(nombres);
        System.out.println("#### LISTE SANS NOMBRES NEGATIFS ####");
        for (Integer integer : nombres) {
            if (integer < 0) {
                nombres.set(nombres.indexOf(integer), integer * integer);
            }
        }
        System.out.println(nombres);



    }
}