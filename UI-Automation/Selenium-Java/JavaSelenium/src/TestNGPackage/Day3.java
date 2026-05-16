package TestNGPackage;

import org.testng.annotations.Test;

import org.testng.annotations.Parameters;;

public class Day3 {
	
	@Test
	public void Dassault() {
		System.out.println("Dassault Systemes Method");
	}
	
	// By alphabetical order, Medidata() method will be executed before RTSM() method
	// When any other method wants execute before a method we use dependsOnMethods= {""} functionality
	// So before executing Medidata() method, RTSM method will be executed
	@Test(dependsOnMethods= {"RTSM", "Phoenix"})
	public void Medidata() {
		System.out.println("Medidata Method");
	}
	
	
	// To inject the parameters which is declared in testParameterization.xml file --> create variable in method and values of the parameter will be stored in that variable
	@Parameters({"TestParameter1", "TestParameter2"})
	@Test(groups= {"Smoke"})
	public void StudyConduct(String useTestParameter, String useTestParameter2) {
		System.out.println("Study Conduct Method");
		System.out.println(useTestParameter);
		System.out.println(useTestParameter2);
	}
	
	
	// To inject the parameters which is declared in testParameterization.xml file --> create variable in method and values of the parameter will be stored in that variable
	@Parameters({"SuiteParameter1"})
	@Test
	public void RTSM(String useSuiteParameter) {
		System.out.println("RTSM Method");
		System.out.println(useSuiteParameter);
	}
	
	
	// If any test method takes huge time to execute, so to avoid timeout error we provide an attribute timeOut=milliseconds to its won't get timeout until that timeout
	@Test(timeOut=4000)
	public void Phoenix() {
		System.out.println("Phoenix method");
	}
	
	
	// When you want to not execute any test method, then we use enabled flag with false --> It will excluded from the execution
	@Test(enabled=false)
	public void QA() {
		System.out.println("QA method");
	}

}
