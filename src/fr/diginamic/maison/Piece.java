package fr.diginamic.maison;

public abstract class Piece {
    protected double superficie;
    protected int etage;

    Piece(double superficie, int etage) {
        if(etage < 0) {
            throw new IllegalArgumentException("L'étage doit etre un nombre positif");
        }
        this.etage = etage;
        if(superficie < 0) {
            this.superficie = 0;
        } else {
            this.superficie = superficie;
        }

    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(float superficie) {
        this.superficie = superficie;
    }

    public int getEtage() {
        return etage;
    }

    public void setEtage(int etage) {
        this.etage = etage;
    }
}
