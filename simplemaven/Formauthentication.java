package simplemaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver.Timeouts;

public class Formauthentication {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.out.println("Testing started");
		 driver.get("https://the-internet.herokuapp.com/");
		 WebElement FormAuthentication = driver.findElement(By.linkText("Form Authentication"));
		 FormAuthentication.click();
		 driver.get("https://the-internet.herokuapp.com/login");
		 //WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		 //WebElement username = driver.findElement(By.cssSelector("#username"));
		 WebElement username = driver.findElement(By.name("username"));
		 username.sendKeys("tomsmith");
		 Thread.sleep(1000);
		 //WebElement pwd = driver.findElement(By.xpath("//input[@id='password']"));
		 WebElement pwd = driver.findElement(By.name("password"));
		 pwd.sendKeys("SuperSecretPassword!");
		 Thread.sleep(1000);
		 //WebElement login = driver.findElement(By.xpath("//i[contains(text(),'Login')]"));
		 WebElement login = driver.findElement(By.cssSelector("div.row:nth-child(2) div.large-12.columns:nth-child(2) div.example form:nth-child(3) button.radius:nth-child(3) > i.fa.fa-2x.fa-sign-in"));
		 login.click();
		 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		 driver.get("https://the-internet.herokuapp.com/secure");
		 WebElement logout = driver.findElement(By.xpath("//i[contains(text(),'Logout')]"));
		 logout.click();
		 Thread.sleep(1000);
		 System.out.println("testcase execution completed");
		 System.out.println("testing completed");
		 driver.quit();
	}
	}


