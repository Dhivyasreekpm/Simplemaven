package simplemaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Floatingmenu {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.out.println("Testing started");
		 driver.get("https://the-internet.herokuapp.com/");
		 WebElement Floatingmenu = driver.findElement(By.linkText("Floating Menu"));
		 Floatingmenu.click();
		 driver.get("https://the-internet.herokuapp.com/floating_menu");
		// WebElement Homebtn = driver.findElement(By.xpath("//a[contains(text(),'Home')]"));--> for floating menus css selector is the best option
		 WebElement Homebtn = driver.findElement(By.cssSelector("div.row:nth-child(2) div.large-12.columns:nth-child(2) div.example:nth-child(2) div:nth-child(2) ul:nth-child(1) li:nth-child(1) > a:nth-child(1)"));
		 Homebtn.click();
		 driver.get("https://the-internet.herokuapp.com/floating_menu#home");
		 //WebElement Menubtn = driver.findElement(By.xpath("//a[contains(text(),'Menu')]"));
		 /*WebElement Menubtn = driver.findElement(By.cssSelector("div.row:nth-child(2) div.large-12.columns:nth-child(2) div.example:nth-child(2) div:nth-child(2) ul:nth-child(1) li:nth-child(2) > a:nth-child(1)"));
		 //WebElement Menubtn = driver.findElement(By.linkText("Menu"));
		 Menubtn.click();
		 driver.get("https://the-internet.herokuapp.com/floating_menu#menu");*/
		/* WebElement Contactbtn = driver.findElement(By.xpath("//a[contains(text(),'Contact')]"));
		 Contactbtn.click();
		 driver.get("https://the-internet.herokuapp.com/floating_menu#contact");
		 WebElement Aboutbtn = driver.findElement(By.xpath("//a[contains(text(),'About')]"));
		 Aboutbtn.click();
		 driver.get("https://the-internet.herokuapp.com/floating_menu#about");*/
		 Thread.sleep(1000);
		 System.out.println("testcase execution completed");
		 System.out.println("testing completed");
		 driver.quit();
	}

}
