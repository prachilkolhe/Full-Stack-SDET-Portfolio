
public class JavaOOPSConstructors {
	
	// Normal Constructor without parameters (Arguments)
	public JavaOOPSConstructors() {
		System.out.println("I am the constructor");
	}
	
	
	// Parameterized Constructor (with Arguments)
	public JavaOOPSConstructors(int a, int b) {
		System.out.println("I am Parameterized Constructor as you provided the parameters");
	}

	
	public static void main(String[] args) {
		JavaOOPSConstructors construct = new JavaOOPSConstructors();
		JavaOOPSConstructors ParaConstruct = new JavaOOPSConstructors(5,10);
		

	}

}
/*
Constructor :-
	--> Its block of code which executes first when we create the object for the class
	--> Constructor is nothing but the method which does not return any value and should have same name as of class name
	--> If you don't create constructor method for the class, then while executing it will take implicit constructor provided by Java
	--> But if you have constructor for the class then while executing it will execute that constructor only i.e, explicit constructor
	--> Types of Constructors :-
		--> Parameterized Constructor => When any constructor is defined with parameters then it is parameterized constructor
									  => While creating object for that class new to pass arguments so that constructor will executed if not then normal constructor will execute
*/