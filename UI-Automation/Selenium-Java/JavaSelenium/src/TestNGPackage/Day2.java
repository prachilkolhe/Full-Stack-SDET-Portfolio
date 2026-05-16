package TestNGPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {
	
	@Test(groups= {"Smoke"})
	public void HomeLoan1() {
		System.out.println("Home Loan Sanction Method");
	}
	
	
	@Test(groups= {"Smoke"})
	public void HomeLoan2() {
		System.out.println("Document Method");
	}
	
	
	// Test case method which have @AfterTest annotation, it will execute at the last, after executing that test case folder completely
	@AfterTest
	public void PostRequisites() {
		System.out.println("Post Execution is executed successfully");
	}
	
	
	// Test case method which have @BeforeSuite annotation, it will execute at the first, before executing that test suite
	@BeforeSuite
	public void SuitePreRequisite() {
		System.out.println("Suite's Pre-requisite are executed successfully");
	}
	
	
	// Test case method which have @AfterSuite annotation, it will execute at the last, after executing that test suite completely
	@AfterSuite
	public void SuitePostRequisite() {
		System.out.println("Suite's Post-requisite are executed successfully");
	}
	
	
	@Test
	public void HomeLoan3() {
		System.out.println("Disbursement Method");
	}
	
	
	// To see the impact of @BeforeTest try to run it first with @Test annotation and later with @BeforeTest annotation
	// Check the sequence of O/P with @Test and @BeforeTest
	// Test case method which have @BeforeTest annotation, it will execute first before execute that test case folder execution
	@BeforeTest
	public void PreRequisites() {
		System.out.println("Executed the pre-requisites before test case execution. @BeforeTest annotation, it will execute first before execute that test case folder execution");
	}
	
	
	// Test case method which have @BeforeMethod annotation, it will execute at first, before executing each method of that test folder
	@BeforeMethod
	public void BeforeEachMethod() {
		System.out.println("BeforeMethod annotation is executed before executing each test method of the test folder");
	}
	
	
	// Test case method which have @AfterMethod annotation, it will execute after executing each method of that test folder
	@AfterMethod
	public void AfterEachMethod() {
		System.out.println("AfterMethod annotation is executed after executing each test method of the test folder");
	}
	
	
	// Test case method which have @BeforeClass annotation, it will execute before executing test cases present in that class i.e. before executing the class
	@BeforeClass
	public void BeforeEachClass() {
		System.out.println("BeforeClass annotation is executed before executing each class. Before execution of test case present in that class");
	}
	
	
	// Test case method which have @AfterClass annotation, it will execute after all test cases present in that class are executed i.e. after executing the class completely
	@AfterClass
	public void AfterEachClass() {
		System.out.println("AfterClass annotation is executed after executing each class. After execution of test case present in that class are executed successfully");
	}

}

/*
@BeforeClass, @AfterClass, @BeforeMethod and @AfterMethod --> are class level annotation
@BeforeTest and @AfterTest --> are test folder scope annotation
@BeforeSuite and @AfterSuite --> are Suite folder scope annotation
*/
