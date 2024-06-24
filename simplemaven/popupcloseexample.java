package simplemaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popupcloseexample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.out.println("Testing started");
		driver.get("https://www.angara.com/");
		Thread.sleep(5000);

		for (String winhandle: driver.getWindowHandles()) {
		    driver.switchTo().window(winhandle);
		    System.out.println("Window Switch");        
		    Thread.sleep(2000);

		    driver.findElement(By.xpath("(//button[span[contains(text(),'Close')]])[1]")).click();
		}
		Thread.sleep(1000);
		 System.out.println("testcase execution completed");
		 System.out.println("testing completed");
		 driver.quit();
	}

}
