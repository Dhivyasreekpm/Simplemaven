package simplemaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class jqueryuimenu {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.out.println("Testing started");
		 driver.get("https://the-internet.herokuapp.com/");
		 WebElement JQueryUIMenus = driver.findElement(By.linkText("JQuery UI Menus"));
		 JQueryUIMenus.click();
		 driver.get("https://the-internet.herokuapp.com/jqueryui/menu");
		// Find the parent menu element
	        WebElement parentMenuElement = driver.findElement(By.xpath("//a[contains(text(),'Enabled')]"));

	        // Create an instance of the Actions class
	        Actions actions = new Actions(driver);

	        // Hover over the parent menu element
	        actions.moveToElement(parentMenuElement).perform();
	        
	     // Wait for the child menu elements to be visible
	       // WebDriverWait wait = new WebDriverWait(driver, 10);
	       /* driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	        WebElement childMenuElement1 = driver.findElement(By.cssSelector("div.row:nth-child(2) div.large-12.columns:nth-child(2) div.example:nth-child(9) div.description:nth-child(2) ul.ui-menu.ui-widget.ui-widget-content:nth-child(3) li.ui-menu-item.ui-state-active ul.ui-menu.ui-widget.ui-widget-content.ui-front:nth-child(3) li.ui-menu-item:nth-child(1) > a:nth-child(2)"));
	     // Perform an action on the child menu element (e.g., click on it)
	        actions.moveToElement(childMenuElement1).click().perform();*/
	       /* driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	        WebElement excel = driver.findElement(By.xpath("//a[@href='/downloads/jqueryui/menu/menu.xls']"));
	        
	     // Hover over the child menu element
	        actions.moveToElement(excel).perform();*/
	        //excel.getText();
	        /*WebElement excel=driver.findElement(By.cssSelector("li#ui-id-7>a"));
	        excel.click();*/
	     // Perform an action on the child menu element (e.g., click on it)
	        //actions.moveToElement(excel).click().perform();
	        Thread.sleep(1000);
		 System.out.println("testcase execution completed");
		 System.out.println("testing completed");
		 driver.quit();
	}

}
