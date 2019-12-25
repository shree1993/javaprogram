package Dummy;

interface Default {
  
	public abstract void abstarctMethod(int x);

	//interface can have multiple default methods
	default void function() {
		System.out.println("Default Method");
	}

	default void function2() {
		System.out.println("Default Method2");
	}
}

interface Default1 {

	default void function() {
		System.out.println("Default Method");
	}
}

class ImplementAbstract implements Default, Default1 {

	public void abstarctMethod(int x) {

	}
    // will give compilation error  if v dont implement function interface
	/**
	 * public void function() { System.out.println("inside ImplementAbstarct"); }
	 **/
    // can override default method
	public void function() {
		Default.super.function();
	}
}

public class DefaultMethod {

	public static void main(String args[]) {
		ImplementAbstract implementAbstract = new ImplementAbstract();
		implementAbstract.function();
		
		Default defaults = (x) -> System.out.println("x" + x);
		defaults.abstarctMethod(5);
	}

}
