package fr.diginamic.operations;

import fr.diginamic.entites.Theatre;

public class TestOperations {
    public static void main(String[] args) {
        System.out.println("Operation avec 2 et 3 : " + Operations.calcul(2, 3, '+'));
        System.out.println("Soustraction avec 2 et 3 : " + Operations.calcul(2, 3, '-'));
        System.out.println("Multiplication avec 2 et 3 : " + Operations.calcul(2, 3, '*'));
        System.out.println("Divison avec 2 et 3 : " + Operations.calcul(2, 3, '/'));

        CalculMoyenne moyenne = new CalculMoyenne();
        moyenne.ajout(2.3);
        moyenne.ajout(2.7);
        System.out.println("La moyenne de 2.3 et 2.7 est => " +moyenne.calcul());

        Theatre theatre = new Theatre();
        theatre.setMax(100);
        theatre.inscrire(20, 3);
        theatre.inscrire(30, 3);
        theatre.inscrire(90, 3);
        theatre.inscrire(90, 3);

    }
}
