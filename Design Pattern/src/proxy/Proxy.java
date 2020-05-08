package proxy;
import java.util.Random;

public class Proxy implements Standard{
	
	private StandardImpl1 target;

	@Override
	public void process() {
		System.out.println("Verification du context de securite");
		boolean b = new Random().nextBoolean();
		if(b) {
			System.out.println("Avant l'appel");
			target = new StandardImpl1(); 
			target.process();
			System.out.println("Après l'appel");
			
		}
		else {
			throw new RuntimeException("Forbidden 403");
		}
	}

}
