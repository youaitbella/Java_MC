package abstractfactory;

/**
 *
 * @author aitbellayo
 */
public class FactoryImplA implements AbstractFactory {

    @Override
    public AbstractPlugin getInstance() {
        return new PlugInImplA();
    }

}
