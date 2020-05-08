package abstractfactory;

/**
 *
 * @author aitbellayo
 */
public class PlugInImplB implements AbstractPlugin {

    @Override
    public void traitement() {
        System.out.println("Traitement par le plugin B .....");
    }
}
