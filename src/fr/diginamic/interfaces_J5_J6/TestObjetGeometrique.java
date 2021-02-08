package fr.diginamic.interfaces_J5_J6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestObjetGeometrique {

    public static void main(String[] args) {
        List<String> maColletion = new ArrayList<>();
        maColletion.add("TEST");
        maColletion.add("TEST2");
        maColletion.add("TEST3");

        Iterator<String> iterator = maColletion.iterator();
        while (iterator.hasNext()) {
            String test = iterator.next();
            System.out.println(test); // TEST TEST2 TEST3
        }
    }
}
