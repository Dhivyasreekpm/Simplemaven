package simplemaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class notificationmessages {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.out.println("Testing started");
		 driver.get("https://the-internet.herokuapp.com/");
		 WebElement NotificationMessages = driver.findElement(By.linkText("Notification Messages"));
		 NotificationMessages.click();
		 driver.get("https://the-internet.herokuapp.com/notification_message_rendered");
		 WebElement clickhere1 = driver.findElement(By.xpath("//a[contains(text(),'Click here')]"));
		 clickhere1.click();
		 Thread.sleep(1000);
		 System.out.println("testcase execution completed");
		 System.out.println("testing completed");
		 driver.quit();
	}

}
