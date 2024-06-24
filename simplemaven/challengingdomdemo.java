package simplemaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class challengingdomdemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.out.println("Testing started");
		 driver.get("https://the-internet.herokuapp.com/");
		 WebElement dombtn = driver.findElement(By.xpath("//a[contains(text(),'Challenging DOM')]"));
		 dombtn.click();
		 driver.get("https://the-internet.herokuapp.com/challenging_dom");
		 Thread.sleep(1000);
		 WebElement editbtn = driver.findElement(By.xpath("//a[contains(text(),'edit')]"));
		 editbtn.click();
		 Thread.sleep(1000);
		 /*WebElement bazbtn = driver.findElement(By.xpath("//a[@id='d1692a90-daeb-013c-df75-7225ea65172e']"));
		 bazbtn.click();
		 Thread.sleep(1000);*/
		 System.out.println("testcase execution completed");
		 System.out.println("testing completed");
		 driver.quit();
	}

}
