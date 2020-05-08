package mt.templatemethod;

public abstract class TemplateClass {
	public double templateMethod() {
		int n = operation1();
		double somme = 0.0;
		for (int i = 0; i < n; i++) {
			somme += operation2(i);
		}
		return somme;
	}

	protected abstract double operation2(int i);

	protected abstract int operation1();

}
