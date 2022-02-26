package ma.education.tp.interfacekeyword;

public class Humain extends Animale implements Carnivore, Herbivore{
    @Override
    public void manger(Vegetal vegetal) {
    }

    @Override
    public void manger(Animale animale) {
    }
}
