package TestNGPackage;

public class integerInheritance extends integerInheritance2{
	int a=2;
	
	// This is the constructor which we created for ChildMethod3()
	// We passed the variable (i.e. parameter) which we are using in ChildMethod3() i.e b instead of using this class global variable a
	// We also passed the value of b to a, to work like 'a' for this class using this. keyword
	// int a --> Global Variable
	// int b --> Instance Variable
	public integerInheritance(int b) {
		
		// super keyword should be write at first line of child class constructor
		super(b);						// This will invoke the parent class constructor --> This line says, "Call the parent class's constructor and pass it the value that was given to my b parameter."
										// super keyword is useful in inheritance only
		this.a=b;  						// this.current_class_varibale = instance_variable
	}

	
	// Even though you have declare the global variable a=2 here, but where its being called up it will use the parameter which defined in that class object
	public int Increment() {
		a=a+1;
		return a;
	}
	
	public int Decrement() {
		a=a-1;
		return a;
	}
}
