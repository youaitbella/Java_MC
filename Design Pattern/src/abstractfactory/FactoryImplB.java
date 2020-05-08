package abstractfactory;

/**
 *
 * @author aitbellayo
 */
public class FactoryImplB implements AbstractFactory {

    @Override
    public AbstractPlugin getInstance() {
        return new PlugInImplB();
    }

}
