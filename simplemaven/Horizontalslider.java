package simplemaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Horizontalslider {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.out.println("Testing started");
		 driver.get("https://the-internet.herokuapp.com/");
		 WebElement Horizontalslider = driver.findElement(By.linkText("Horizontal Slider"));
		 Horizontalslider.click();
		 driver.get("https://the-internet.herokuapp.com/horizontal_slider");
		// Locate the source and target elements
	        WebElement draganddrop = driver.findElement(By.cssSelector("div.row:nth-child(2) div.large-12.columns:nth-child(2) div.example:nth-child(1) div.sliderContainer:nth-child(3) > input:nth-child(1)"));
	        //WebElement target = driver.findElement(By.id("droppable"));
	 
	        // Create an object of the Actions class
	        Actions actions = new Actions(driver);
	 
	        // Dragging to an offset
	        actions.dragAndDropBy(draganddrop, 2, 0).perform();
		 Thread.sleep(1000);
		 System.out.println("testcase execution completed");
		 System.out.println("testing completed");
		 driver.quit();
	}

}
