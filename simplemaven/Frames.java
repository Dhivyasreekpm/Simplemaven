package simplemaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.out.println("Testing started");
		 driver.get("https://the-internet.herokuapp.com/");
		 WebElement Frames = driver.findElement(By.linkText("Frames"));
		 Frames.click();
		 driver.get("https://the-internet.herokuapp.com/frames");
		 /*WebElement nestedframes = driver.findElement(By.xpath("//a[contains(text(),'Nested Frames')]"));
		 nestedframes.click();
		 driver.get("https://the-internet.herokuapp.com/nested_frames");*/
		 WebElement iframe = driver.findElement(By.xpath("//a[contains(text(),'iFrame')]"));
		 iframe.click();
		 driver.get("https://the-internet.herokuapp.com/iframes");
		 /*WebElement closebtn = driver.findElement(By.xpath("//link[@id='mce-u0']"));
		  WebElement closebtn = driver.findElement(By.cssSelector("//link[@id='mce-u0']"));
		 closebtn.click();	*/
		 Thread.sleep(1000);
		 System.out.println("testcase execution completed");
		 System.out.println("testing completed");
		 driver.quit();
	}

}
