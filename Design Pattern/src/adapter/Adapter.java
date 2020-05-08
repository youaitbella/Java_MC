package adapter;
/* Composition
public class Adapter implements Standard {

	private AncienneImpl ancienne = new AncienneImpl();
	
	@Override
	public void operation(int nb1, int nb2) {
		double res = ancienne.calcul((double)nb1, (double)nb2);
		ancienne.print(res);
	}

}
*/
/*Heritage*/
public class Adapter extends AncienneImpl implements Standard {
	
	//private AncienneImpl ancienne = new AncienneImpl();
	
	@Override
	public void operation(int nb1, int nb2) {
		double res = super.calcul((double)nb1, (double)nb2);
		super.print(res);
	}
	
}
