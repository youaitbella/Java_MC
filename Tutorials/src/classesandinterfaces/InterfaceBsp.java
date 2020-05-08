package classesandinterfaces;

public class InterfaceBsp {

    public static void main(String[] args) {
//        Fahrrad f = new Fahrrad();
        Drivable f = new Fahrrad();
        //System.out.println("Tempo des Fahrrads: " + f.tempo);
        f.beschleunigen(10);
        //System.out.println("Tempo des Fahrrads: " + f.tempo);
        f.verzoegern(8);
        //System.out.println("Tempo des Fahrrads: " + f.tempo);

//        MotoGuzzi m = new MotoGuzzi();
//        System.out.println("Tempo des Motorrads: " + m.tempo);
//        m.beschleunigen(50);
//        System.out.println("Tempo des Motorrads: " + m.tempo);
//        m.verzoegern(36);
//        System.out.println("Tempo des Motorrads: " + m.tempo);
    }
}
