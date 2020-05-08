package composite;

public class Test {

	public static void main(String[] args) {
		
		Folder root = new Folder("Root");
		
		Folder f1 = new Folder("Structure");
		Folder f2 = new Folder("Comportement");
		Folder f3 = new Folder("Creation");
		
		root.addComponent(f1);
		root.addComponent(f2);
		root.addComponent(f3);
		
		f1.addComponent(new File("Composite"));
		f1.addComponent(new File("Decorator"));
		
		f2.addComponent(new File("Strategy"));
		
		f3.addComponent(new File("Singleton"));
		f3.addComponent(new File("Builder"));
		
//		Folder fSt1 =(Folder)f1.addComponent(new Folder("St1"));
		f1.addComponent(new Folder("St1"));
		Folder fSt1 = (Folder) f1.getComponent("St1");
		fSt1.addComponent(new File("Composite Version 2"));
		//root.addComponent(fSt1);
		
		root.view();
	}
}
