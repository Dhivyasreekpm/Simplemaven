package simplemaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logintest3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.out.println("Testing started");
		driver.get("https://the-internet.herokuapp.com/");
		//handling popup login
		 WebElement basicauthbtn = driver.findElement(By.xpath("//a[contains(text(),'Basic Auth')]"));
		 basicauthbtn.click();
			
	        //set the username and password
	        String Username = "admin";
	        String Password = "admin";
	        String URL = "https://" +Username +":" +Password +"@"+ "the-internet.herokuapp.com/digest_auth";
			driver.get(URL);
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			String title = driver.getTitle();
			
			System.out.println("The page title is "+title);
			
			String text = driver.findElement(By.tagName("p")).getText();
			
			System.out.println("The test present in page is ==> "+text);
			System.out.println("Testing started");
			
		System.out.println("Testcase executed successfully");
		Thread.sleep(1000);
		driver.quit();
	}

}
