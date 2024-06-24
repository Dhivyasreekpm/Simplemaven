package simplemaven;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JSAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.out.println("Testing started");
		 driver.get("https://the-internet.herokuapp.com/");
		 WebElement JavaScriptAlerts = driver.findElement(By.linkText("JavaScript Alerts"));
		 JavaScriptAlerts.click();
		 driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		 /*WebElement clickforjsalert = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]"));
		 clickforjsalert.click();*/
		 /*WebElement clickforjsconfirm = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]"));
		 clickforjsconfirm.click();
		 //driver.switchTo().alert().accept();
		 driver.switchTo().alert().dismiss();*/
		 WebElement clickforjsprompt = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]"));
		 clickforjsprompt.click();
		 driver.switchTo().alert().sendKeys("sample prompt");
		 Thread.sleep(1000);
		 System.out.println("testcase execution completed");
		 System.out.println("testing completed");
		 driver.quit();
	}

}

		