package simplemaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logintest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		WebElement Usernamefld = driver.findElement(By.id("username"));
		Usernamefld.sendKeys("student");
		WebElement passwordfld = driver.findElement(By.id("password"));
		passwordfld.sendKeys("Password123");
		WebElement submitfld = driver.findElement(By.id("submit"));
		submitfld.click();
		WebElement Logoutbtn = driver.findElement(By.xpath("//a[contains(text(),'Log out')]"));
		Logoutbtn.click();
		System.out.println("Testcase executed successfully");
		Thread.sleep(10000);
		driver.quit();
	}

}
