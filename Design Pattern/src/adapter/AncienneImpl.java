package adapter;

public class AncienneImpl {
	public double calcul(double nb1, double nb2) {
		return 2*nb1 + nb2;
	}
	public void print(double nb) {
		System.out.println("---------------------------");
		System.out.println("Ancienne Implementation");
		System.out.println(nb);
		System.out.println("---------------------------");
	}
}