package banque.entites;

public class TestBanque {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Compte c = new Compte(202, 2.98f);

        CompteTaux c2 = new CompteTaux(202, 2.98f, 22);
        Compte[] c3 = {c, c2};
        for(int i = 0; i < c3.length; i++) {
            System.out.println(c3[i]);
        }

        System.out.println("####################################################");
        System.out.println("####################################################");

        Debit d = new Debit("ojd", 22);
        Debit d2 = new Debit("hier", 89);
        Credit cr = new Credit("demain", 220);
        Credit cr2 = new Credit("dans deux jours", 290);
        Operation[] listeOperations =  {d, cr, d2, cr2};
        for(int i = 0; i < listeOperations.length; i++) {
            System.out.println(listeOperations[i].afficherType() + ". Montant : " + listeOperations[i].montant + ". Date : " +listeOperations[i].operation);
            if (listeOperations[i].afficherType().equals("Debit")) {
                c2.setSolde(c2.getSolde() - listeOperations[i].montant);
            } else {
                c2.setSolde(c2.getSolde() + listeOperations[i].montant);
            }
            System.out.println("Montant du compte : " +c2.getSolde() +"\n");
        }
    }
}
