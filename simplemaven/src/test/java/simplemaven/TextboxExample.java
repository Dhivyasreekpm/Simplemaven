package simplemaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TextboxExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*System.setProperty("webdriver.chrome.driver", "D:\\Downloaded Files\\otherfiles\\chromedrivers_backup\\driver1\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options= new ChromeOptions();
		options.setBinary("D:\\Downloaded Files\\otherfiles\\chromedrivers_backup\\driver1\\chrome-win64\\chrome-win64\\chrome.exe");*/
	    WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		WebElement FullNametxt = driver.findElement(By.id("userName"));
		FullNametxt.sendKeys("Dhivya");
		System.out.println("Testcase executed successfully");
		Thread.sleep(10000);
		driver.quit();
	}

}
