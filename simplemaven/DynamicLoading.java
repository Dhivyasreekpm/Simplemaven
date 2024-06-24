package simplemaven;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicLoading {

	public static void main(String[] args) throws InterruptedException,NoSuchElementException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.out.println("Testing started");
		 driver.get("https://the-internet.herokuapp.com/");
		 WebElement dynamicloadingtest = driver.findElement(By.xpath("//a[contains(text(),'Dynamic Loading')]"));
		 dynamicloadingtest.click();
		 driver.get("https://the-internet.herokuapp.com/dynamic_loading");
		/* WebElement Element1link = driver.findElement(By.xpath("//a[contains(text(),'Example 1: Element on page that is hidden')]"));
		 Element1link.click();
		 driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		 WebElement startbtn = driver.findElement(By.xpath("//div[@id='start']"));
		 startbtn.click();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 System.out.println(startbtn.getText());*/
		 WebElement Element2link = driver.findElement(By.xpath("//a[contains(text(),'Example 2: Element rendered after the fact')]"));
		 Element2link.click();
		 driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		 WebElement startbtn = driver.findElement(By.xpath("//button[contains(text(),'Start')]"));
		 //WebElement startbtn = driver.findElement(By.xpath("//div[@id='start']"));
		 startbtn.click();
		 String title = driver.getTitle();
			
			System.out.println("The page title is "+title);
			
			String text = driver.findElement(By.tagName("h4")).getText();
			
			System.out.println("The test present in page is ==> "+text);
		 /*String text = driver.findElement(By.xpath("//h4[contains(text(),'Hello World!')]"));
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 System.out.println(startbtn.getText());*/
		 Thread.sleep(1000);
		 System.out.println("testcase execution completed");
		 System.out.println("testing completed");
		 driver.quit();
		 
	}

}
