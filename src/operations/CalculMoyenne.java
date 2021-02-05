package operations;
import java.util.Arrays;

public class CalculMoyenne {
    protected double[] tableau = new double[0];
    private double somme;

    public void ajout(double chiffre) {
        tableau = Arrays.copyOf(tableau, tableau.length +1);
        somme+=chiffre;
        int index = tableau.length;
        tableau[index -1] = chiffre;
    }

    public double calcul() {
        return somme/tableau.length;
    }

}
