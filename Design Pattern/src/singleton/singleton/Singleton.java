package singleton.singleton;

public class Singleton {

    private static final Singleton OBJ = new Singleton();

    private Singleton() {
        System.out.println("Objekt gebildet...");
    }

    public static Singleton getInstance() {
        return OBJ;
    }
}
