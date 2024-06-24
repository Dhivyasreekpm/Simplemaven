package simplemaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Forgotpassword {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.out.println("Testing started");
		 driver.get("https://the-internet.herokuapp.com/");
		 WebElement ForgotPassword = driver.findElement(By.linkText("Forgot Password"));
		 ForgotPassword.click();
		 driver.get("https://the-internet.herokuapp.com/forgot_password");
		 WebElement Emailtextbox = driver.findElement(By.xpath("//input[@id='email']"));
		 Emailtextbox.sendKeys("dhivyasreekpmselvaraj@gmail.com");
		 WebElement Retrievepwdbtn = driver.findElement(By.xpath("//button[@id='form_submit']"));
		 Retrievepwdbtn.click();
		 Thread.sleep(1000);
		 System.out.println("testcase execution completed");
		 System.out.println("testing completed");
		 driver.quit();
	}

}
