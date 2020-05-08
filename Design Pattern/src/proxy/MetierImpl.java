package proxy;
//@Service
public class MetierImpl implements IMetier{

	@Override
//	@Transactional
//	@Cachable
	public void process() {
		System.out.println("Traitement");
	}

}
