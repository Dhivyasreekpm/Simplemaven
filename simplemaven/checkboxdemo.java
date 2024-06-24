package simplemaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxdemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.out.println("Testing started");
		 driver.get("https://the-internet.herokuapp.com/");
		 System.out.println("Title of the page:"+driver.getTitle());
		 WebElement checkboxbtn = driver.findElement(By.xpath("//a[contains(text(),'Checkboxes')]"));
		 checkboxbtn.click();
		 driver.get("https://the-internet.herokuapp.com/checkboxes");
		 Thread.sleep(1000);
		 WebElement checkbox1btn = driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/form[1]/input[1]"));
		 checkbox1btn.click();
		 Thread.sleep(1000);
		 WebElement checkbox2btn = driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/form[1]/input[2]"));
		 checkbox1btn.click();
		 Thread.sleep(1000);
		 System.out.println("testcase execution completed");
		 System.out.println("testing completed");
		 driver.quit();
	}

}
