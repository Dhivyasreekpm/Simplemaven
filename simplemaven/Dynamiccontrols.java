package simplemaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamiccontrols {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.out.println("Testing started");
		 driver.get("https://the-internet.herokuapp.com/");
		 WebElement dynamiccontroltest = driver.findElement(By.xpath("//a[contains(text(),'Dynamic Controls')]"));
		 dynamiccontroltest.click();
		 driver.get("https://the-internet.herokuapp.com/dynamic_controls");
		 WebElement checkboxtest = driver.findElement(By.xpath("//input[@type='checkbox']"));
		 checkboxtest.click();
		 WebElement Removebtntest = driver.findElement(By.xpath("//button[contains(text(),'Remove')]"));
		 Removebtntest.click();
		 WebElement Enablebtntest = driver.findElement(By.xpath("//button[contains(text(),'Enable')]"));
		 Enablebtntest.click();
		 Thread.sleep(1000);
		 System.out.println("testcase execution completed");
		 System.out.println("testing completed");
		 driver.quit();
	}

}
