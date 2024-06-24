package simplemaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Entryad {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.out.println("Testing started");
		 driver.get("https://the-internet.herokuapp.com/");
		 //WebElement entryadtest = driver.findElement(By.xpath("//a[contains(text(),'Entry Ad')]"));
		 WebElement entryadtest = driver.findElement(By.linkText("Entry Ad"));
		 entryadtest.click();
		 driver.get("//the-internet.herokuapp.com/entry_ad");
		 WebElement closebtn = driver.findElement(By.tagName("p"));
		 closebtn.click();
		 driver.switchTo().defaultContent();
		 //driver.switchTo().frame(0);
		 //WebElement closebtn = driver.findElement(By.xpath("//*[@id=\"modal\"]/div[2]/div[3]/p"));
		 //closebtn.click();
		 Thread.sleep(1000);
		 System.out.println("testcase execution completed");
		 System.out.println("testing completed");
		 driver.quit();
	}

}
