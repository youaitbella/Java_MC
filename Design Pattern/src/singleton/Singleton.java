package singleton;

/**
 *
 * @author aitbellayo
 */
public class Singleton {

    private static final Singleton instance;
    private int compteur;

    static {
        instance = new Singleton();
    }

    private Singleton() {
        System.out.println("Instanciation");
    }

    public static Singleton getInstance() {
        return instance;
    }

    public void traiter(String tache) {
        System.out.println("---------- Tâche " + tache + "----------");
        for (int i = 1; i <= 5; i++) {
            ++compteur;
            System.out.print("." + compteur);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
        System.out.println("Compteur=" + compteur);
    }
}
