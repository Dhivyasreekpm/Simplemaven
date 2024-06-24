package simplemaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class redirectlink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.out.println("Testing started");
		 driver.get("https://the-internet.herokuapp.com/");
		 WebElement RedirectLink = driver.findElement(By.linkText("Redirect Link"));
		 RedirectLink.click();
		 driver.get("https://the-internet.herokuapp.com/redirector");
		 WebElement here1 = driver.findElement(By.xpath("//a[@id='redirect']"));
		 here1.click();
		 WebElement status1 = driver.findElement(By.xpath("//a[contains(text(),'200')]"));
		 status1.click();
		 WebElement here2 = driver.findElement(By.xpath("//a[contains(text(),'here')]"));
		 here2.click();	 
		 Thread.sleep(1000);
		 System.out.println("testcase execution completed");
		 System.out.println("testing completed");
		 driver.quit();
	}

}
