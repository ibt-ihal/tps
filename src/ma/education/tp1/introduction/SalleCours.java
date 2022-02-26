package ma.education.tp1.introduction;

public class SalleCours extends Salle{
    byte nombre_places;
    public SalleCours(long id, String nom, byte nbPlaces) {
        super(nom,id);
        this.nombre_places = nbPlaces;
    }


}
