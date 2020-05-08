package factorypattern;

import java.awt.Color;
import java.awt.Rectangle;

public class Fahrzeug {

    public Fahrzeug(String type, Color color) {
        this(type, color, 2);
    }

    public Fahrzeug(String type, Color color, Dach dach) {
        this(type, color, 2, null, null, dach);
    }

    public Fahrzeug(String type, Color color, int achsen) {
        this(type, color, achsen, null);
    }

    public Fahrzeug(String type, Color color, int achsen,
            Rectangle ladeflaeche) {
        this(type, color, achsen, ladeflaeche, null, null);
    }

    public Fahrzeug(String type, Color color, int achsen, Rectangle ladeflaeche,
            Kran ladeKran, Dach dach) {
        System.out.println("Fahrzeug vom Typ " + type + " erzeugt");
    }
}

class Dach {
    // ...
}

class Kran {
    // ...
}
