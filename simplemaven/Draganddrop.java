package simplemaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.out.println("Testing started");
		 driver.get("https://the-internet.herokuapp.com/");
		 WebElement draganddroptest = driver.findElement(By.xpath("//a[contains(text(),'Drag and Drop')]"));
		 draganddroptest.click();
		 driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		 WebElement Aframe = driver.findElement(By.xpath("//div[@id='column-a']"));
		 WebElement Bframe = driver.findElement(By.xpath("//div[@id='column-b']"));
		 Actions actions = new Actions(driver);
	     actions.dragAndDrop(Aframe, Bframe).perform();	       
		 Thread.sleep(1000);
		 System.out.println("testcase execution completed");
		 System.out.println("testing completed");
		 driver.quit();
	}

}
