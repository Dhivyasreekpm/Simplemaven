package simplemaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addremoveexample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.out.println("Testing started");
		 driver.get("https://the-internet.herokuapp.com/");
		 WebElement addremovebtn = driver.findElement(By.xpath("//a[contains(text(),'Add/Remove Elements')]"));
		 addremovebtn.click();
		 Thread.sleep(1000);
		 driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
		 Thread.sleep(1000);
		 WebElement addelementbtn = driver.findElement(By.xpath("//button[contains(text(),'Add Element')]"));
		 addelementbtn.click();
		 Thread.sleep(1000);
		 WebElement deletebtn=driver.findElement(By.xpath("//button[contains(text(),'Delete')]"));
		 deletebtn.click();
		 Thread.sleep(1000);
		 System.out.println("testcase execution completed");
		 System.out.println("testing completed");
		 driver.quit();
	}

}
