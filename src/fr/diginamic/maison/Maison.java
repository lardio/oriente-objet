package fr.diginamic.maison;

import java.util.Arrays;

public class Maison {
    private Piece[] pieces = new Piece[0];

    public void ajouterPiece(Piece piece) {
        if(piece == null) {
            throw new IllegalArgumentException("La pièce passée en parametre n'est pas ok.");
        }
        pieces = Arrays.copyOf(pieces, pieces.length +1);
        int index = pieces.length;
        pieces[index -1] = piece;
    }

    public double getSuperficieTotale() {
        int sommeTotalSuperficie = 0;
        for(Piece p : pieces) {
            sommeTotalSuperficie += p.getSuperficie();
        }
        return sommeTotalSuperficie;
    }

    public double getSuperficieTotaleEtage(int etage) {
        if(etage < 0) {
            throw new IllegalArgumentException("L'étage demandé existe pas. Le nombre doit etre positif.");
        }
        int sommeTotalSuperficie = 0;
        for(Piece p : pieces) {
            if(p.getEtage() == etage) {
                sommeTotalSuperficie += p.getSuperficie();
            }
        }
        return sommeTotalSuperficie;
    }
}
