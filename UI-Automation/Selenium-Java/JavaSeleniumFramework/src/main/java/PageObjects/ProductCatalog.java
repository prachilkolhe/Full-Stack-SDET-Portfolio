package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductCatalog extends Common{
	
	WebDriver driver;
	
	public ProductCatalog(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Element which are driver.findElement --> Use @FindBy
	// Element which are By.id() --> Use By
	@FindBy(css=".mb-3")
	List<WebElement> AllItems;
	
	@FindBy(css=".ng-animating")
	WebElement BannerMessage;
	
	@FindBy(id= "toast-container")
	WebElement flash;
	
	By productsBy = By.cssSelector(".mb-3");
	By addToCart = By.cssSelector(".card-body button:last-child");
	By FlashMessage = By.id("toast-container");

	
	public List<WebElement> getItemList() {
		WaitUntilElementToAppear(productsBy);
		return AllItems;
	}
	
	public WebElement getProductByName(String ProductName) {
		
		WebElement requiredItem = AllItems.stream().filter(item -> item.findElement(By.cssSelector("b")).getText().equals(ProductName)).findFirst().orElse(null);
		return requiredItem;	
	}
	
	public void addProductToCart(String ProductName) {
		WebElement product = getProductByName(ProductName);
		WaitUntilElementToBeClickable(addToCart);
		product.findElement(addToCart).click();
		WaitUntilWebElementVisible(flash);
		WaitUntilElementToDisappear(BannerMessage);
	}

}
