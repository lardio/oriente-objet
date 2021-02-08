package fr.diginamic.chaines;

public class TestStringBuilder {

    public static void main(String[] args) {

        long depart = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder();
        for (int i = 0 ; i< 100_000; i++) {
            builder.append(i);
        }

        long fin = System.currentTimeMillis();
        System.out.println("Temps écoulé en millisecondes : " + (fin - depart));

        long depart2 = System.currentTimeMillis();
        String string = "";
        for (int i = 0 ; i< 100_000; i++) {
            string += i;
        }
        long fin2 = System.currentTimeMillis();
        System.out.println("Temps écoulé en millisecondes : " + (fin2 - depart2));
    }
}
