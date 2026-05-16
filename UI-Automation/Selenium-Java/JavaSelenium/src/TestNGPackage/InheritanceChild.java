package TestNGPackage;

import org.testng.annotations.Test;

// Using extends keyword we inherits the one class into another
// Instead of using inheritance we can create a object for that class and using using object we can access all the methods of that class
// When we inherit the class into another class, firstly it loads parent class in child class and execute all the methods as declared in parent class
public class InheritanceChild extends InheritanceParent {
	
	@Test
	public void ChildMethod() {
		ParentClassMethod();
		
	// Here, I'm only calling the ParentClassMethod() from parent class but it won't only execute ParentClassMethod()
	// but will execute all the methods declared in the parent class and then this method (in alphabetical order)
	
		
	// Workaround for Inheritance --> Instead of using extends keyword we can inherit the one class in another class by creating object of parent class
		Day1 Day1MethodObject = new Day1();
		Day1MethodObject.BikeLoan();

	}
	
	@Test
	public void ChildMethod2() {
		Day1 Day1MethodObject = new Day1();
		Day1MethodObject.CarLoan();
	}
	
	@Test
	public void ChildMethod3() {
					
		integerInheritance obj = new integerInheritance(5);			// When declaring the parameter in class object then we need to declare the constructor --> Parameterize Constructor --> Can be use Eclipse intelligence to create it											
		System.out.println(obj.Increment());						// Increment method will use variable a=5, instead of its file's global variable a=2
		System.out.println(obj.Decrement());						// Decrement method will use variable generating after Increment method, instead of its file's global variable a=2
		
		
		/*
		integerInheritance2 obj2 = new integerInheritance2(10);
		int n=10;
		System.out.println(obj2.Multiply());
		// Instead of creating another object for another class --> We can inherit the class integerInheritance2 to integerInheritance using extends keyword so no need to create repetitive object
		// When we create object class way --> we need to initiate parameter using constructor class
		// But using extends inheritance way --> We need pass that parameter using super keyword --> super(a);
		// Using that same object we can call the method of parent class
		*/
		
		System.out.println(obj.Multiply());				// obj is object which we created for integerInheritance using this object we are calling Multiply() method of another class integerInheritance2 using super keyword in constructor method of integerInheritance class 
														// Multiply method will use variable a=5, instead of its file's global variable m=3
	}
	
}

// In TestNG, test method execution work as per alphabetical order of method name