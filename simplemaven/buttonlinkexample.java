package simplemaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class buttonlinkexample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.out.println("Testing started");
		 driver.get("https://the-internet.herokuapp.com/");
		 WebElement ABtestingbtn = driver.findElement(By.xpath("//a[contains(text(),'A/B Testing')]"));
		 ABtestingbtn.click();
		 Thread.sleep(1000);
		 driver.get("https://the-internet.herokuapp.com/abtest");
		 Thread.sleep(1000);
		 System.out.println("testcase execution completed");
		 System.out.println("testing completed");
		 driver.quit();
		 
		 
	}

}
