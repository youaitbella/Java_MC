package strategypattern;
import  strategypattern.IStrategy;

public class DefaultStrategyImpl implements IStrategy {

	@Override
	public void applyStrategy() {
			System.out.println("Etape intermediare de l algorithme avec la strategie par default");
	}
}
