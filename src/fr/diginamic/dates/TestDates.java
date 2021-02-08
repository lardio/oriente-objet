package fr.diginamic.dates;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

    public static void main(String[] args) throws IOException {

        // date du jour
        Date dateDuJour = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyy");
        System.out.println(dateFormat.format(dateDuJour));

        Date date2 = new Date(116, 4, 19, 23, 59, 30);
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
        System.out.println(dateFormat2.format(date2));

        // Creer et afficher la date/heure système
        Date date3 = new Date();
        System.out.println("\n###### date Systeme =>");
        System.out.println(dateFormat2.format(date3));
    }
}