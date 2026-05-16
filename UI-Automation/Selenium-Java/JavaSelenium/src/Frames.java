import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		// Switching to frame using WebElement
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		// Switching to frame using index
//		System.out.println(driver.findElements(By.tagName("iframe")).size());
//		driver.switchTo().frame(0);		
		
		// Drag and Drop Action
		Actions a = new Actions(driver);
		WebElement sourceFrame1 = driver.findElement(By.id("draggable"));
		WebElement targetFrame = driver.findElement(By.id("droppable"));
		a.dragAndDrop(sourceFrame1, targetFrame).build().perform();
		
		// To Go Back to the Main Page
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Accept")).click();

	}

}


/*
There are three ways to switch the driver to frame =>
1. By frame id :-
   driver.switchTo().frame("frameNameOrId");
   driver.switchTo().frame("myFrame");
  
2. By WebElement :-
   driver.switchTo().frame(frameElement);
   driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.responsive-iframe")));

3. By index :-
   driver.switchTo().frame(index);
   driver.switchTo().frame(0);


To Go Back to the Main Page
driver.switchTo().defaultContent();
 */
