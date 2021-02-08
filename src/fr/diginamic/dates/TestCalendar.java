package fr.diginamic.dates;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

    public static void main(String[] args) throws IOException {

        Calendar calen1 = Calendar.getInstance();
        calen1.set(2016, 4, 19, 23, 59, 30); //asignation de la date
        Date date1 = calen1.getTime();
        SimpleDateFormat dateFormatc = new SimpleDateFormat("dd/MM/yyy");
        System.out.println(dateFormatc.format(date1));

        //date du jour
        Calendar calen2 = Calendar.getInstance();
        Date date2c = calen2.getTime();

        System.out.println("\n###### DATE ACTUELLE EN PLUSIEURS LANGUES =>");
        SimpleDateFormat dateFormat2c = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
        System.out.println(dateFormat2c.format(date2c)); //format pour convertir date en String
        SimpleDateFormat dateFormatFr = new SimpleDateFormat("EEEE dd MMMM yyyy", Locale.FRANCE);
        System.out.println(dateFormatFr.format(date2c));
        SimpleDateFormat dateFormatRu = new SimpleDateFormat("EEEE dd MMMM yyyy", new Locale("ru", "RU"));
        System.out.println(dateFormatRu.format(date2c));
        SimpleDateFormat dateFormatCh = new SimpleDateFormat("EEEE dd MMMM yyyy", Locale.CHINA);
        System.out.println(dateFormatCh.format(date2c));
        SimpleDateFormat dateFormatAl = new SimpleDateFormat("EEEE dd MMMM yyyy", Locale.GERMAN);
        System.out.println(dateFormatAl.format(date2c));
    }
}