package PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CartPage extends Common {
	
	WebDriver driver;
	
	public CartPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(css= "[routerlink*='cart']")
	WebElement cartIcon;
	
	@FindBy(xpath= "//div[@class='cartSection']/h3")
	List<WebElement> addedItems;
	
	@FindBy(xpath= "//li[@class='totalRow']/ button")
	WebElement checkoutButton;
	
	
	public void goToCart() {
		cartIcon.click();
		
	}

	public Boolean ItemsInCart(String ProductName) {
		Boolean match = addedItems.stream().anyMatch(item -> item.getText().equalsIgnoreCase(ProductName));
		return match;
	}
	
	public void CheckoutOrder() {
		checkoutButton.click();
	}

}
