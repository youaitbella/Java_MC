package mt.templatemethod;

public class Client {

	public static void main(String[] args) {
		TemplateClass templateClass = new TemplateImpl1();
		System.out.println(templateClass.templateMethod());
		templateClass = new TemplateImpl2();
		System.out.println(templateClass.templateMethod());
	}
}
