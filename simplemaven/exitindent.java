package simplemaven;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class exitindent {

	public static void main(String[] args) throws InterruptedException,NoSuchElementException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.out.println("Testing started");
		 driver.get("https://the-internet.herokuapp.com/");
		 WebElement exitindent = driver.findElement(By.linkText("Exit Intent"));
		 exitindent.click();
		 driver.get("https://the-internet.herokuapp.com/exit_intent");
		 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		 WebElement closebtn = driver.findElement(By.tagName("p"));
		 closebtn.click();
		 Thread.sleep(1000);
		 System.out.println("testcase execution completed");
		 System.out.println("testing completed");
		 driver.quit();
	}

}
