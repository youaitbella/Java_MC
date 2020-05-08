package decorator.decorators;

import decorator.boisson.Boisson;

public class Caramel extends AbstactDecorator{

	public Caramel(Boisson boisson) {
		super(boisson);
	}

	@Override
	public double cout() {
		return 0.7 + boisson.cout();
	}

	@Override
	public String getDescription() {
		
		return boisson.getDescription() + " au Caramel";
	}

}
