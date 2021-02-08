package fr.diginamic.fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ManipulationFichier {

    public static void main(String[] args) throws IOException {
        //04;La Réunion;974;4;14;423;Les Trois-Bassins;7 111;96;7 207;
        Path fichier = Paths.get("/Users/sylvain/Desktop/recensement.csv"); //fichier a copier
        List<String> lines = Files.readAllLines(fichier, StandardCharsets.UTF_8);
        List<String> recuperation = new ArrayList<>();

        System.out.println(lines.get(lines.size()-1));

        for(String ligne : lines) {
            String[] division = ligne.split(";");
            String population = division[9].replaceAll("\\s+","");
            if(population.matches("-?\\d+")) {
                Integer populationInt = Integer.parseInt(division[9].replaceAll("\\s+",""));
                if(populationInt > 25000) {
                    recuperation.add(division[1] +";"+division[2]+";"+division[9]);
                }
            }
        }

        System.out.println(recuperation.get(recuperation.size()-1));
        Path fileToWrite = Paths.get("/Users/sylvain/Desktop/recensementNew.csv");
        Files.write(fileToWrite, recuperation);

    }
}