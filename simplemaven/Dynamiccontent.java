package simplemaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamiccontent {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.out.println("Testing started");
		 driver.get("https://the-internet.herokuapp.com/");
		 WebElement dynamiccontenttest = driver.findElement(By.xpath("//a[contains(text(),'Dynamic Content')]"));
		 dynamiccontenttest.click();
		 driver.get("https://the-internet.herokuapp.com/dynamic_content");
		 WebElement clickheretest = driver.findElement(By.xpath("//a[contains(text(),'click here')]"));
		 clickheretest.click();
		 Thread.sleep(1000);
		 System.out.println("testcase execution completed");
		 System.out.println("testing completed");
		 driver.quit();
	}

}
