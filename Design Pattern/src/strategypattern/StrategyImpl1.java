package strategypattern;

public class StrategyImpl1 implements IStrategy {

	@Override
	public void applyStrategy() {
			System.out.println("Etape intermediare de l algorithme avec la strategie 1");
	}

}
