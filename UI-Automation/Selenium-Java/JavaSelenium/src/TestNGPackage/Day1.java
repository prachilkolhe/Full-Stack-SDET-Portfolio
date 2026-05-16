package TestNGPackage;

import org.testng.annotations.Test;

public class Day1 {
	
	@Test
	public void CarLoan() {
		System.out.println("Car Loan Method");
	}
	
	@Test
	public void BikeLoan() {
		System.out.println("Bike Loan Method");
	}
	
	@Test(groups= {"Smoke"})
	public void MobileLoan() {
		System.out.println("Mobile Loan Method");
	}

}

/*
Using groups functionality of TestNG, we will be able to run some of testcases which we want to run
For example, from all these test method I want to run few methods as part of smoke testing then
For those each method I will put tag (group {name="Smoke"}) in @Test annotation and configure in .xml file like above
It will only those which has this tag
*/