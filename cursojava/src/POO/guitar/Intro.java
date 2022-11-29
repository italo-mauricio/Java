package POO.guitar;

/*
 Classe é o molde que você define cada objeto vai ter;

 Obejto é o que vai ser instanciado


 */
public class Intro {
    public static void main(String[] args) {
        Guitar fender = new Guitar();
        fender.chords = 6;
        fender.name = "Fender";

        Guitar ibanez = new Guitar();
        ibanez.chords = 6;
        ibanez.name = "Ibanez";

    }
}
