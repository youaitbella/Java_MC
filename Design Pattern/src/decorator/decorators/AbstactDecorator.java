package decorator.decorators;

import decorator.boisson.Boisson;

public abstract class AbstactDecorator extends Boisson {
	protected Boisson boisson;

	public AbstactDecorator(Boisson boisson) {
		super();
		this.boisson = boisson;
	}
	
	public abstract String getDescription();
}
