package ma.education.tp1.introduction;

public class Salle {
     public long id;
     public String nom;
     public  int nbr;
     public String mat;
   //Un constructeur sans paramètres
       public Salle(){}
    //Un constructeur pour le nom de la salle
    public Salle(String nom){
        this.nom = nom;
    }
    //Un constructeur pour le nom et id de la salle
    public Salle(long id, String nom) {
        this(nom);
        this.id = id;
    }
   public   static  void affiche(long id,String nom)
    {
        System.out.println(id+" "+nom);
    }


}
