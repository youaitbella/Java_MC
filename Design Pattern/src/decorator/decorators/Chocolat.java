package decorator.decorators;

import decorator.boisson.Boisson;

public class Chocolat extends AbstactDecorator{

	public Chocolat(Boisson boisson) {
		super(boisson);
	}

	@Override
	public double cout() {
		return 0.9 + boisson.cout();
	}

	@Override
	public String getDescription() {
		
		return boisson.getDescription() + " au Chocolat";
	}

}
