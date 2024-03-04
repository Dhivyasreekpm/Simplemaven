package simplemaven;

import org.openqa.*;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


@Test
public class SeleniumTest1 {
	public static void main(String[] args) throws InterruptedException {
		/*System.setProperty("webdriver.chrome.driver", "D:\\Downloaded Files\\otherfiles\\chromedrivers_backup\\driver1\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options= new ChromeOptions();
		options.setBinary("D:\\Downloaded Files\\otherfiles\\chromedrivers_backup\\driver2\\chrome-win64\\chrome-win64\\chrome.exe");*/
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.switchTo();
		driver.get("https://automationstepbystep.com/");
		System.out.println("Testcase executed successfully");
		Thread.sleep(10000);
		driver.quit();

	}

}
