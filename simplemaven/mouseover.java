package simplemaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.out.println("Testing started");
		//Launching sample website
		driver.get("https://artoftesting.com/samplesiteforselenium");
		driver.manage().window().maximize();
		
		//Mouseover on submit button
		Actions action = new Actions(driver);
		WebElement btn = driver.findElement(By.id("idOfButton"));
		action.moveToElement(btn).perform();
		
		//Thread.sleep just for user to notice the event
		Thread.sleep(5000);
		 System.out.println("testcase execution completed");
		 System.out.println("testing completed");
	
		
		//Closing the driver instance
		driver.quit();
	}

}
