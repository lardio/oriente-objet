package fr.diginamic.entites;

public class TheatrePro {
    protected String nom;
    protected Spectacle[] allShow;

    public void ajouterSpectacle(Spectacle spec) {
        for (int i = 0; i <= allShow.length - 1; i++) {
            if (allShow[i] == null) {
                allShow[i] = spec;
            }
        }
    }

    public void getSpectacle(String nomShow) {
        for (int j = 0; j <= allShow.length - 1; j++) {
            if (allShow[j].nom == "nomShow") {
                System.out.println(allShow[j].nom + "type:" + allShow[j].typeSpectacle + " tarifs : " + allShow[j].tarif
                        + "euros");
            }
        }
    }

    public void inscrire(int nbrClients, String nomShow) {
        boolean showExists= false;
        for (int j = 0; j <= allShow.length - 1; j++) {
            if (allShow[j].nom == "nomShow") {
                showExists = true;
                if(allShow[j].capaciteMax>=nbrClients+allShow[j].nbrInscrits) {
                    allShow[j].nbrInscrits += nbrClients;
                }else {
                    System.out.println("plus de place disponibles !");
                }
            }
        }
        if(showExists==false) {
            System.out.println("Aucun spectacle ne porte ce nom");
        }
    }

    public double getRecetteTotale() {
        double recette =0;
        for (int i = 0 ;i<=allShow.length-1;i++) {
            recette = allShow[i].nbrInscrits*allShow[i].tarif;
        }
        return recette;
    }

    public int getNbTotalClients() {
        int clientsTotal=0;
        for (int i = 0 ;i<=allShow.length-1;i++) {
            clientsTotal+= allShow[i].nbrInscrits;
        }
        return clientsTotal;
    }

}
