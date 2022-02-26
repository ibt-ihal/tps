package ma.education.tp.abstarctkeyword;

public abstract class FormeGeoTypeA extends FormeGeometrique {
    double surface;
    // Méthode abstraite sans corps
    public abstract double calculerSurface();
    // Méthode concrète avec un corps
    public void afficherSurface() {
        System.out.println(this.surface);
    }
}
