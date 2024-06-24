package simplemaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class shiftingcontent {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.out.println("Testing started");
		 driver.get("https://the-internet.herokuapp.com/");
		 WebElement ShiftingContent = driver.findElement(By.linkText("Shifting Content"));
		 ShiftingContent.click();
		 driver.get("https://the-internet.herokuapp.com/shifting_content");
		 WebElement menuelement = driver.findElement(By.xpath("//a[contains(text(),'Example 1: Menu Element')]"));
		 menuelement.click();
		 /*WebElement image = driver.findElement(By.xpath("//a[contains(text(),'Example 2: An image')]"));
		 menuelement.click();
		 WebElement list = driver.findElement(By.xpath("//a[contains(text(),'Example 3: List')]"));
		 menuelement.click();*/
		 Thread.sleep(1000);
		 System.out.println("testcase execution completed");
		 System.out.println("testing completed");
		 driver.quit();
	}

}
