package CucumberFramework.StepDefinations;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import JavaSeleniumFramework.DriverSetup;
import PageObjects.CartPage;
import PageObjects.CheckoutPage;
import PageObjects.ConfirmationPage;
import PageObjects.LoginPage;
import PageObjects.ProductCatalog;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CucumberStepDefination extends DriverSetup {
	public WebDriver driver;
	public DriverSetup driverSetup;
	public LoginPage login;
	public ProductCatalog PCObject;
	public CartPage cart;
	public CheckoutPage CheckoutObject;
	public ConfirmationPage ConfirmObject;
	
	public CucumberStepDefination() throws IOException {
		this.driver = driverSetup.DriverInitialize();
		this.login = new LoginPage(driver);
		
	}
	
	@Given("I navigate to the ECommerce website")
	public void I_navigate_to_the_ECommerce_website() {				// Usually method name is based on the step
		login.driverURL();
	}
	
	// (.+) regular expression matches any type of string
	// When we are using regular expression in definition then it should start with ^ and end with $
	// When not using reg ex, then no need to start with ^ and end with $ as above definition
	@Given("^I log in to website using Username (.+) and Password (.+)$")
	public void login_username_password(String username, String password) {
		login.LoginApplication(username, password);
	}
	
	@And("^I add the product (.+) to the cart$")
	public void add_product_to_cart(String productName) {
		PCObject.getItemList();
		PCObject.addProductToCart(productName);
		
	}
	
	
	@And("^I checkout and submit the order$")
	public void Checkout_and_submit(String productName) {
		cart.goToCart();
		Boolean match = cart.ItemsInCart(productName);
		Assert.assertTrue(match);
		cart.CheckoutOrder();
		CheckoutObject.selectCountry("India");
		CheckoutObject.submitOrder();
		
	}
	
	// When any value is directly place in the step, instead of coming from the user input parameter --> we don't use ^$
	@Then("I verify {string} message on Purchase Order page")
	public void verify_message(String string) {
		String message = ConfirmObject.getOrderMessage();
		Assert.assertTrue(message.equalsIgnoreCase("Thankyou for the order."));
		
	}
	
	@Then("I should the error message {string}")
	public void verify_error_message(String string) {
		String actual_error = login.getErrorMessage();
		Assert.assertEquals(string, actual_error);
	}
	

}
