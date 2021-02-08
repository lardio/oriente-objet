package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {

    public static void main(String[] args) {

        Salarie salarie = new Salarie();
        salarie.setSalaireMensuelNet(3000.00);
        salarie.setNom("Sylvain");
        salarie.setPrenom("Lardiere");

        Pigiste pigiste = new Pigiste();
        pigiste.setMontantJournalier(300);
        pigiste.setNbJours(20);
        pigiste.setNom("Sylvain");
        pigiste.setPrenom("Lardiere");

        System.out.println("Salaire du salarie est de : " +salarie.getSalaire());
        System.out.println("Salaire du pigiste est de : " + pigiste.getSalaire());

        pigiste.afficherDonnees();

        salarie.afficherDonnees();
    }
}
