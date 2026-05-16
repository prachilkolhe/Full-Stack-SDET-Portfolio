package JavaSeleniumFramework;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.HashMap;

import org.testng.Assert;
import PageObjects.CartPage;
import PageObjects.CheckoutPage;
import PageObjects.ConfirmationPage;
import PageObjects.ProductCatalog;


public class DataProviderHashMapTest extends DriverSetup {

	@Test(dataProvider= "getHashMapData")
	public void E2EShopping(HashMap<String, String> HashInput) throws IOException, InterruptedException {
		
		LoginObject.LoginApplication(HashInput.get("Email"), HashInput.get("Password"));		//To retrieve the values from hash map using key --> use .get method
		ProductCatalog PCObject = new ProductCatalog(driver);
		PCObject.getItemList();
		PCObject.addProductToCart(HashInput.get("ProductName"));
		CartPage cartPageObject = new CartPage(driver);
		cartPageObject.goToCart();
		CartPage CartObject = new CartPage(driver);
		Boolean match = CartObject.ItemsInCart(HashInput.get("ProductName"));
		Assert.assertTrue(match);
		CartObject.CheckoutOrder();
		CheckoutPage CheckoutObject = new CheckoutPage(driver);
		CheckoutObject.selectCountry("India");
		CheckoutObject.submitOrder();
		ConfirmationPage ConfirmObject = new ConfirmationPage(driver);
		String message = ConfirmObject.getOrderMessage();
		AssertJUnit.assertTrue(message.equalsIgnoreCase("Thankyou for the order."));

	}
	
	// HashMap stores the data in Key Value format
	// Need to mentioned the data types of key value in object creation
	@DataProvider
	public Object[][] getHashMapData() {
		HashMap<String, String> map = new HashMap<String, String>();
		// To store the data in hash map use .put method
		// To retrieve the data from hash map use .get method wherever we are calling it in method
		map.put("Email", "prachil972000@gmail.com");
		map.put("Password", "Password@123");
		map.put("ProductName", "ADIDAS ORIGINAL");
		
		// To send multiple data sets --> need to create multiple hash map objects
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("Email", "prachil972000@gmail.com");
		map1.put("Password", "Password@123");
		map1.put("ProductName", "ZARA COAT 3");
		return new Object[][] {{map},{map1}};
		
	}
}
/* If you encounter any error like ElementClickInterception then run it in debugger with breakpoint at Ln 26 and 32
If we run same file with main() block, then its executes as compared to TestNG so try to run it with debugger
*/