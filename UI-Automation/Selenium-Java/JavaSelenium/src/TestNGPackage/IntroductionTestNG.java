package TestNGPackage;
import org.testng.annotations.Test;

public class IntroductionTestNG {

	@Test
	public void IntroMethod() {
		System.out.println("Printing Hello using @Test");
	}
	
	
	// Multiple test cases using same class
	// In regular JAVA, to run different tests we have to create two class of single main method public static void main. (because single class can have only one main method)
	@Test
	public void testMethod2() {
		System.out.println("Second method");
	}
	
	@Test(groups= {"Smoke"})
	public void testMethod3() {
		System.out.println("Third Method");
	}
	
	@Test
	public void testMethod4() {
		System.out.println("Fourth Method");
	}

}

/*
To run any JAVA program its mandatory to have 'public static void main(String[] args) {}' method, to run it in Java Application compiler (Check by clicking Run As option)
But in TestNG, its not mandatory to have 'public static void main(String[] args) {}' method to run the test cases
To have @Test tag, we need to import TestNG library and suggested packages
If there is tag @Test to any method other than 'public static void main', that will run using TestNG Test compiler (Check by clicking Run As option)
Method with @Test tag, is also run using Java Application compiler but its in backend, no need to create main method to run


Creation of TestNG.xml :-
In TestNG, @tags are also called as Annotations

The total test cases .java files which we created in TestNGPackage, to run all of those test cases in single click --> we create a .xml file 
To create it, Right click on the project --> TestNG --> Convert to TestNG --> Continue --> Finish --> A testng.xml file will be created

All the test cases .java files which we created will be added under <classes> tag with each <class> tag
These classes will be added under Test folder <test> and this test folder will be added under test suite <suite>

To run this testng.xml file, Right click on testng.xml file --> Run As -->  TestNG Suite

If you want exclude any test case method --> add <method> tag and inside that add name of method you want to skip under <exclude> tag <exclude name = method_name/> and close </method> tag
We can use <include> tag like above
If you want exclude or include the large no. of test cases method --> so instead of mentioned all method names in exclude or include tag --> Give the methods name like all methods starts with common name  --. so tag will be like <exclude name="commonName.*"/>
<exclude name="commonName.*"/> --> Its will exclude the methods which starts with commonName

We can run whole test package using <packages><package name=""/></packages>  --> Kind of regression test run

In TestNG, the order of execution of test method is in alphabetical order based on the name of test method
*/