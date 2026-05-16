package TestNGPackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InheritanceParent {

	public static void main(String[] args) {
		
			System.out.println("This is main block method of parent class");
		}

	public void ParentClassMethod() {
		System.out.println("This is parent class method");
	}
	
	@BeforeTest
	public void BeforeParentMethod() {
		System.out.println("Parent Class Before method");
	}
	
	@Test
	public void ParentATestMethod() {
		System.out.println("Parent Class Test method");
	}
	
	@AfterTest
	public void AfterParentMethod( ) {
		System.out.println("Parent Class After method");
	}

}
