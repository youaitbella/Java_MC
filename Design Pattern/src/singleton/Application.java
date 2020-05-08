package singleton;


/**
 *
 * @author aitbellayo
 */
public class Application {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            Singleton singleton = Singleton.getInstance();
            singleton.traiter("T" + i);
        }
    }
}
