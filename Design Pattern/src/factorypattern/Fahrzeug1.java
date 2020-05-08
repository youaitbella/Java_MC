package factorypattern;

import java.awt.Color;
import java.awt.Rectangle;

public class Fahrzeug1 {

    private Fahrzeug1(String type, Color color, int achsen,
            Rectangle ladeFlaeche, Kran ladeKran, Dach dach) {
        // ...
    }

    public static Fahrzeug1 createPKW(Color color) {
        return createPKW(color, null);
    }

    public static Fahrzeug1 createPKW(Color color, Dach dach) {
        return new Fahrzeug1("PKW", color, 2, null, null, dach);
    }

    public static Fahrzeug1 createLKW(Color color, int achsen) {
        return createLKW(color, achsen, null);
    }

    public static Fahrzeug1 createLKW(Color color, int achsen,
            Rectangle ladeFlaeche) {
        return createLKW(color, achsen, ladeFlaeche, null, null);
    }

    public static Fahrzeug1 createLKW(Color color, int achsen, Rectangle ladeFlaeche, Kran ladeKran, Dach dach) {
        return new Fahrzeug1("LKW", color, achsen, ladeFlaeche, ladeKran,
                null);
    }
}
