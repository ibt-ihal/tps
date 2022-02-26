package ma.education.tp2.statickeyword;

public class Etudiant {
    public Etudiant(long id, String nom, int nbEtud) {
        this.id = id;
        this.nom = nom;
        nbEtud++;
    }

    public long id;
    public String nom;
    public int nbEtud;

    public static void main(String[] args) {
        Etudiant e1 = new Etudiant(1, "ibtihal", 22);
        Etudiant e2 = new Etudiant(2, "chergu", 10);
        System.out.println("le id :" + e1.id + "le nom: " + e1.nom + " num etudiant :" + e1.nbEtud);
    }
}
