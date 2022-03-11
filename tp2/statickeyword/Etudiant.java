package ma.education.tp2.statickeyword;

public class Etudeint {
    public Etudeint(long id, String nom,int nbEtudiants) {
        this.id = id;
        this.nom = nom;
        nbEtudiants++;
    }

    public long id;
    public String nom;
    public  int nbEtudiants;

    public static void main(String[] args) {
        Etudeint e1= new Etudeint(1, "otman", 20);
        Etudeint e2= new Etudeint(2, "karim", 30);
        System.out.println(e1.id+" "+e1.nom+" "+e1.nbEtudiants);

        }
}
