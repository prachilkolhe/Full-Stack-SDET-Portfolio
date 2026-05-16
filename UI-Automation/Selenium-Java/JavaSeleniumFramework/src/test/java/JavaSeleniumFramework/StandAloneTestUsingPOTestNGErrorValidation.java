package JavaSeleniumFramework;

import org.testng.annotations.Test;
import org.testng.Assert;
import java.io.IOException;

public class StandAloneTestUsingPOTestNGErrorValidation extends DriverSetup {

	@Test
	public void E2EShopping() throws IOException, InterruptedException {
		LoginObject.LoginApplication("WHOprachil972000@gmail.com", "WrongPassword@123");
		Assert.assertEquals("Incorrect email or password.", LoginObject.getErrorMessage());

	}
	
	
	@Test
	public void E2EShopping2() throws IOException, InterruptedException {
		LoginObject.LoginApplication("WHOAMI@gmail.com", "WrongPassword@123");
		Assert.assertEquals("Incorrect em ail or password.", LoginObject.getErrorMessage());

	}

}