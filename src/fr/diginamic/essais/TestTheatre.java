package fr.diginamic.essais;
import fr.diginamic.entites.Theatre;

public class TestTheatre {
    public static void main(String[] args) {

        Theatre theatre = new Theatre();
        theatre.setMax(100);
        theatre.inscrire(20, 3);
        theatre.inscrire(30, 3);
        theatre.inscrire(90, 3);
        theatre.inscrire(90, 3);
        System.out.println("Recette totale => " +theatre.getRecette() +". Nombre inscrits => " +theatre.getClientsInscrits());
    }
}
