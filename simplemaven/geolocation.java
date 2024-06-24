package simplemaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class geolocation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.out.println("Testing started");
		 driver.get("https://the-internet.herokuapp.com/");
		 WebElement Geolocation = driver.findElement(By.linkText("Geolocation"));
		 Geolocation.click();
		 driver.get("https://the-internet.herokuapp.com/geolocation");
		 WebElement whereami = driver.findElement(By.xpath("//button[contains(text(),'Where am I?')]"));
		 whereami.click();
		 //WebElement seeitongoogle = driver.findElement(By.xpath("//a[contains(text(),'See it on Google')]"));
		 //WebElement seeitongoogle = driver.findElement(By.xpath("div.row:nth-child(2) div.large-12.columns:nth-child(2) div.example p:nth-child(2) div:nth-child(5) > a:nth-child(1)"));
		 //seeitongoogle.click();
		 WebElement whereami2 = driver.findElement(By.xpath("//button[contains(text(),'Where am I?')]"));
		 whereami2.click();
		 Thread.sleep(1000);
		 System.out.println("testcase execution completed");
		 System.out.println("testing completed");
		 driver.quit();
	}

}
