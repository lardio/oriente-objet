package fr.diginamic.testexceptions;

public class TestReflectionUtils {

    public static void main(String[] args) {
        Ville chauche = new Ville("Chauché", 2300);

        try {
            ReflectionUtils.afficherAttributs(null);
        } catch (IllegalAccessException | IllegalArgumentException | ReflectionException e) {
            System.err.println(e.getMessage());
        }
    }


}
