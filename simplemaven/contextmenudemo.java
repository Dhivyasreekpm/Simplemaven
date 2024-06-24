package simplemaven;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class contextmenudemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.out.println("Testing started");
		 driver.get("https://the-internet.herokuapp.com/");
		 WebElement contextmenubtn = driver.findElement(By.xpath("//a[contains(text(),'Context Menu')]"));
		 contextmenubtn.click();
		 Thread.sleep(1000);
		 WebElement rightclickcontextbtn = driver.findElement(By.xpath("//*[@id=\"content\"]/div/p[1]"));
		 rightclickcontextbtn.click();
		
		 System.out.println("testcase execution completed");
		
		 System.out.println("testing completed");
		 driver.quit();
	}

}
