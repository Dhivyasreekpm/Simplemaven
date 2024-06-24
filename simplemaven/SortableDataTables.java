package simplemaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SortableDataTables {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.out.println("Testing started");
		 driver.get("https://the-internet.herokuapp.com/");
		 WebElement SortableDataTables = driver.findElement(By.linkText("Sortable Data Tables"));
		 SortableDataTables .click();
		 driver.get("https://the-internet.herokuapp.com/tables");
		WebElement tableedit1=driver.findElement(By.xpath("//a[@href=\"#edit\"]"));
		tableedit1.click();
		 Thread.sleep(1000);
		 System.out.println("testcase execution completed");
		 System.out.println("testing completed");
		 driver.quit();
	}

}
