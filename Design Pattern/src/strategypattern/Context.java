package strategypattern;

public class Context {
	
	private IStrategy strategy;
	
	
	
	public Context() {
		this.strategy = new DefaultStrategyImpl();
	}

	public void process() {
//		public void process(int type) {
		System.out.println("Etape 1 de l algorithme");
//		System.out.println("Version initiale  ....");
//		if(type==1) {
//			System.out.println("Etape intermediare de l algorithme avec la strategie 1");
//		}
//		else if(type==2) {
//			System.out.println("Etape intermediare de l algorithme avec la strategie 2");
//		}
//		else if(type==3) {
//			System.out.println("Etape intermediare de l algorithme avec la strategie 3");
//		}
//		else {
//			System.out.println("Etape intermediare de l algorithme avec la strategie par default");
//		}
		strategy.applyStrategy();
		System.out.println("Etape finale de l algorithme");
	}

	public void setStrategy(IStrategy strategy) {
		this.strategy = strategy;
	}

}
