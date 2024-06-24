package simplemaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.out.println("Testing started");
		driver.get("https://www.google.com");
		WebElement textbox = driver.findElement(By.name("q"));
		textbox.sendKeys("narendramodi");
		Thread.sleep(1000);
		WebElement Search = driver.findElement(By.xpath("//input[@type='submit']"));
		Search.click();
		Thread.sleep(1000);
		System.out.println("Testcase executed successfully");
		System.out.println("Testing completed");
		driver.quit();
	}

}
