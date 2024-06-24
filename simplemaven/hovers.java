package simplemaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class hovers {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.out.println("Testing started");
		 driver.get("https://the-internet.herokuapp.com/");
		 WebElement Hovers = driver.findElement(By.linkText("Hovers"));
		 Hovers.click();
		 driver.get("https://the-internet.herokuapp.com/hovers");
		 driver.manage().window().maximize();
			
			//Mouseover on submit button
			Actions action = new Actions(driver);
			//WebElement user1 = driver.findElement(By.xpath("//h5[contains(text(),'name: user1')]"));
			//WebElement user1 = driver.findElement(By.cssSelector("div.row:nth-child(2) div.large-12.columns:nth-child(2) div.example:nth-child(2) div.figure:nth-child(3) div.figcaption:nth-child(2) > h5:nth-child(1)"));
			//action.moveToElement(user1).perform();
		 Thread.sleep(5000);
		 System.out.println("testcase execution completed");
		 System.out.println("testing completed");
		 driver.quit();
	}

}
