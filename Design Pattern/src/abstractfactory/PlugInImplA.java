package abstractfactory;

/**
 *
 * @author aitbellayo
 */
public class PlugInImplA implements AbstractPlugin {

    @Override
    public void traitement() {
        System.out.println("Traitement par le plugin A .....");
    }

}
