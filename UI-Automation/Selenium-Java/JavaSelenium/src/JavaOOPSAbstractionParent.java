
public abstract class JavaOOPSAbstractionParent {
	
	public void parentMethod1() {
		System.out.println("Method 1 of Parent Abstraction Class");
	}
	
	// Concrete Method --> Method which have block of execution
	public void parentMethod2() {
		System.out.println("Method 2 of Parent Abstraction Class");
	}
	
	// Non-Concrete Method --> Method which does not have block of execution
	public abstract void parentAbstractMethod1();
	
	public abstract void parentAbstractMethod2();

}


/*
 * Methods which are declared with 'abstract' keyword are Abstracted methods which does not have any block of execution
 * If any class that has abstracted methods, then that class should have abstract keyword
 * Other own method of class which are not abstracted methods, that should have block of execution
 */