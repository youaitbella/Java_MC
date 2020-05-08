package abstractfactory;

/**
 *
 * @author aitbellayo
 */
public class Application {

    public static void main(String[] args) throws Exception {
        // Instanciation statique de la fabrique
        AbstractFactory factory = new FactoryImplA();
        AbstractPlugin plugin = factory.getInstance();
        plugin.traitement();
        // Instanciation dynamique de la fabrique
        factory = (AbstractFactory) Class.forName("org.inek.youssfi.designpattern.FactoryImplB").newInstance();
        plugin = factory.getInstance();
        plugin.traitement();
    }

}
