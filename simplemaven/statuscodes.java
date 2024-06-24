package simplemaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class statuscodes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.out.println("Testing started");
		 driver.get("https://the-internet.herokuapp.com/");
		 WebElement StatusCodes = driver.findElement(By.linkText("Status Codes"));
		 StatusCodes .click();
		 driver.get("https://the-internet.herokuapp.com/status_codes");
		 WebElement status200 = driver.findElement(By.xpath("//a[contains(text(),'200')]"));
		 status200.click();
		 Thread.sleep(1000);
		 System.out.println("testcase execution completed");
		 System.out.println("testing completed");
		 driver.quit();
	}

}
