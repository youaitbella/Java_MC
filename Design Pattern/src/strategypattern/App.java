package strategypattern;
import java.util.Scanner;

public class App {
	public static void main(String[] args) throws Exception{
		Context context = new Context();
		boolean fin = false;
		Scanner scanner = new Scanner(System.in);
		while(!fin) {
			System.out.println("Donnez la strategie:");
			String strategyClassName = scanner.nextLine();
			// je charger la classe de la memoire si elle existe
			// je l instantie
			IStrategy strategy = (IStrategy) Class.forName(strategyClassName).newInstance();
			context.setStrategy(strategy);
			System.out.println("----------------");			
			context.process();
		}
		/*
		System.out.println("----------------");
		context.setStrategy(new StrategyImpl1());
		context.process();
		System.out.println("----------------");
		context.setStrategy(new StrategyImpl2());
		context.process();
		System.out.println("----------------");
		context.setStrategy(new StrategyImpl3());
		context.process();
		*/
	}
}
