import ma.education.tp1.introduction.Salle;
public class AccesHorsPackage extends Salle {

    public AccesHorsPackage(String Nom) {
        super(Nom);
    }

    public static void main(String[] args)
    {
        Salle SB=new Salle("salle B",3);
        System.out.println(SB.id);
        System.out.println(SB.nom);
    }
    public void afficher(Salle s)
    { System.out.println(s.id );
        System.out.println(s.nom );
        System.out.println(id );
        System.out.println(nom );
    }
}
