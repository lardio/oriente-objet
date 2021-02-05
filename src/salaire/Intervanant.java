package salaire;
import java.lang.reflect.Field;

public abstract class Intervanant {
    protected String nom;
    protected String prenom;

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public abstract double getSalaire();

    public void afficherDonnees() {
        System.out.println("\n#############ATTRIBUTS###########");

        try {
            System.out.println("Contrat : " +this.getClass().getSimpleName());
            Field[] fields = this.getClass().getSuperclass().getDeclaredFields();
            Field[] fields2 = this.getClass().getDeclaredFields();
            for(int i = 0; i < fields.length; i++) {
                String[] lastReturn = fields[i].toString().split("\\.");
                String keyClass = lastReturn[lastReturn.length -1];
                Object value = fields[i].get(this);
                System.out.println(keyClass + " => " + value);
            }

            for(int i = 0; i < fields2.length; i++) {
                String[] lastReturn = fields2[i].toString().split("\\.");
                String keyClass = lastReturn[lastReturn.length -1];
                Object value = fields2[i].get(this);
                System.out.println(keyClass + " => " + value);
            }

        } catch(Exception e) {
            System.out.println(e);
        }

    }
}
