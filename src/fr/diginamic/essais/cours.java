package fr.diginamic.essais;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class cours {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("C:/Temp/test.csv");
        System.out.println(path.getRoot()); // C:/
        System.out.println(path.getParent()); // C:/Temp/
        System.out.println(path.getFileName()); // test.csv

        boolean estFichier = Files.isRegularFile(path);
        boolean estLisible = Files.isReadable(path);

        // COPIE FICHIER
        Path pathOrigine = Paths.get("C:/Temp/test.csv"); //fichier a copier
        Path pathDestination = Paths.get("C:/Temp/test2.csv"); //si fichier existe pas il va le créer
        Files.copy(pathOrigine, pathDestination);
        Files.copy(pathOrigine, pathDestination, StandardCopyOption.REPLACE_EXISTING); //va ecraser le fichier de destination si il existe

        // DEPLACER FICHIER
        // idem avec dossier, mais le dossier de destination doit etre vide
        Files.move(pathOrigine, pathDestination, StandardCopyOption.REPLACE_EXISTING);

        // LIRE FICHIER
        Path file = Paths.get("C:/Temp/test.csv");
        List<String> lines = Files.readAllLines(file, StandardCharsets.UTF_8);

        // ECRIRE DANS UN FICHIER
        List<String> linesToWrite = new ArrayList<>();
        lines.add("Bonjour");
        lines.add("GOODBYE");
        Path fileToWrite = Paths.get("C:/Temp/test.txt");
        Files.write(fileToWrite, linesToWrite);
        Files.write(fileToWrite, linesToWrite, StandardOpenOption.APPEND); //pour ajouter a la fin fichier existant


    }

    }
