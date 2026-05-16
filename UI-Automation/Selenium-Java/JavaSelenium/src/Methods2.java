
public class Methods2 {
	
	public static void main(String[] args) {
		// For the class Methods2, I have declared the static method staticMethod(), which will not required object of the class to call it, directly call by method name
		staticMethod();
		
	}

	public String anotherClassMethod() {
		System.out.println("Dassault Systemes");
		return "Hinjewadi Pune";
	}


	// When method has 'public' or 'private' keyword:-
	// public- That method can be call in another class as well
	// private- That method will only work for that particular class only
	private static void privateMethod() {
		System.out.println("Private method is only available for Methods2 class only");
	}
	
	
	// When method has a 'static' keyword:-
	// No need to create a object for that class
	
	public static String staticMethod() {
		System.out.println("No need to create the object of the class for the static method");
		return "This is static method";
	}
	
	// When method has 'void' keyword:-
	// It indicates that the methods does not return any value
	// Once the main method finishes, the program simply exits
	// 'void' can replaced by the different data types (int, double, char, boolean, byte, short, long, float), which indicates the return type of the method
	// eg. for sum method -- int or float
	
}