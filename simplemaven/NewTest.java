package simplemaven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
	WebDriver driver ;
  @Test
  public void f() {
	  String baseUrl = "https://www.google.com/";
	  System.out.println("Launching Google Chrome browser"); 
      driver = new ChromeDriver();
      driver.get(baseUrl);
      driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		String title = driver.getTitle();
		
		System.out.println("The page title is "+title);
		
		/*String text = driver.findElement(By.tagName("p")).getText();
		System.out.println("The test present in page is ==> "+text);*/
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Starting Test On Chrome Browser");
  }

  @AfterMethod
  public void afterMethod() {
	  	driver.close();
		System.out.println("Finished Test On Chrome Browser");
		
  }

}
