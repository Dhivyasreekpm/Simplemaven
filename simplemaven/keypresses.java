package simplemaven;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class keypresses {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.out.println("Testing started");
		 driver.get("https://the-internet.herokuapp.com/");
		 WebElement KeyPresses = driver.findElement(By.linkText("Key Presses"));
		 KeyPresses.click();
		 driver.get("https://the-internet.herokuapp.com/key_presses");
		 WebElement inputbox = driver.findElement(By.xpath("//input[@id='target']"));
		 //inputbox.sendKeys(Keys.TAB);
		 //inputbox.sendKeys(Keys.ALT);
		 //inputbox.sendKeys(Keys.ENTER);
		 //inputbox.sendKeys(Keys.INSERT);
		 inputbox.sendKeys(Keys.ESCAPE);
		 Thread.sleep(1000);
		 System.out.println("testcase execution completed");
		 System.out.println("testing completed");
		 driver.quit();
	}

}
