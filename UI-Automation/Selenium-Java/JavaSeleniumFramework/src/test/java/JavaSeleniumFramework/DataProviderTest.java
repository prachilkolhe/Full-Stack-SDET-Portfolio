package JavaSeleniumFramework;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import org.testng.Assert;
import PageObjects.CartPage;
import PageObjects.CheckoutPage;
import PageObjects.ConfirmationPage;
import PageObjects.ProductCatalog;


public class DataProviderTest extends DriverSetup {

	@Test(dataProvider= "getData")
	public void E2EShopping(String Email, String Password, String ProductName) throws IOException, InterruptedException {
		
		LoginObject.LoginApplication(Email, Password);
		ProductCatalog PCObject = new ProductCatalog(driver);
		PCObject.getItemList();
		PCObject.addProductToCart(ProductName);
		CartPage cartPageObject = new CartPage(driver);
		cartPageObject.goToCart();
		CartPage CartObject = new CartPage(driver);
		Boolean match = CartObject.ItemsInCart(ProductName);
		Assert.assertTrue(match);
		CartObject.CheckoutOrder();
		CheckoutPage CheckoutObject = new CheckoutPage(driver);
		CheckoutObject.selectCountry("India");
		CheckoutObject.submitOrder();
		ConfirmationPage ConfirmObject = new ConfirmationPage(driver);
		String message = ConfirmObject.getOrderMessage();
		AssertJUnit.assertTrue(message.equalsIgnoreCase("Thankyou for the order."));

	}
	
	@DataProvider
	public Object[][] getData() {
		return new Object[][] {{"prachil972000@gmail.com", "Password@123", "ADIDAS ORIGINAL"}, {"prachil972000@gmail.com", "Password@123", "ZARA COAT 3"}}; 		// Object[][] Multi dimensional array --> Two data sets with three input parameters for each
	}

}
/* If you encounter any error like ElementClickInterception then run it in debugger with breakpoint at Ln 25 and 31
If we run same file with main() block, then its executes as compared to TestNG so try to run it with debugger
*/