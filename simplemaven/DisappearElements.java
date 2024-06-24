package simplemaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisappearElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.out.println("Testing started");
		 driver.get("https://the-internet.herokuapp.com/");
		 WebElement disappearbtntest = driver.findElement(By.xpath("//a[contains(text(),'Disappearing Elements')]"));
		 disappearbtntest.click();
		 driver.get("https://the-internet.herokuapp.com/disappearing_elements");
		 Thread.sleep(1000);
		 WebElement homebtntest = driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
		 homebtntest.click();
		 Thread.sleep(1000);
		 System.out.println("testcase execution completed");
		 System.out.println("testing completed");
		 driver.quit();
	}

}
