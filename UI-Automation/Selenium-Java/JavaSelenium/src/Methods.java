
public class Methods {

	public static void main(String[] args) {
	//This is main block, anything which is declared here will be the part of the execution
	// To access the method of any class, first create the object of that class (for self class too)
		Methods method1 = new Methods();
		method1.getData();
		Methods method2 = new Methods();
		String a =method2.UserName();			// Calling the method UserName here, it will execute the System.out.println()
		System.out.println(a);					// Return type of method UserName is stored in a so 'Prachil Kolhe' is output
		
		
		//Calling another public method of another class
		//Object creation is mandatory
		Methods2 d1 = new Methods2();
		d1.anotherClassMethod();
		
		Methods2 d2 = new Methods2();
		d2.staticMethod();
		
	}
	
	
	
	
	
	//In JAVA, method should be declared outside the main block
	//If method is declared there then JAVA will throw an error
	public void getData() {
		System.out.println("Hello World");
	}
	
	public String UserName() {
		System.out.println("User Name is ");
		return "Prachil Kolhe";
	}

}

