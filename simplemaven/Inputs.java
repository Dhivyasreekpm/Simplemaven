package simplemaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inputs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.out.println("Testing started");
		 driver.get("https://the-internet.herokuapp.com/");
		 WebElement Inputs = driver.findElement(By.linkText("Inputs"));
		 Inputs.click();
		 driver.get("https://the-internet.herokuapp.com/inputs");
		WebElement inputtextbox=driver.findElement(By.xpath("//input[@type='number']"));
		inputtextbox.sendKeys("12345");
		 Thread.sleep(1000);
		 System.out.println("testcase execution completed");
		 System.out.println("testing completed");
		 driver.quit();
	}

}
