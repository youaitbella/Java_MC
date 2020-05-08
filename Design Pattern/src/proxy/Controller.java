package proxy;

public class Controller {
	//@Autowired
	private IMetier metier;
	
	public String index() {
		metier.process();
		return "index";
	}

}
