package ma.education.tp1.introduction;

public class Salle {
    //ATTRIBUTS

    //private long id;
    //private String nom;
    //private permet de connetre les attributs selement dans leurs claas
    //protected long id;
    //protected String nom;
    //private permet de connetre les attributs selement dans leurs claas et ses filles
    public static long id;
    public static String nom;

    //constructeurs
   // public  Salle()
   // {}
    public  Salle(String Nom)
    {

        this.nom= Nom;
    }
    public  Salle(String Nom,long Id)
    {
        this(Nom);
        this.id=Id;

    }
    public   static  void affiche(long id,String nom)
    {

        System.out.println("le id "+id+" et le "+nom);
    }

}
