package simplemaven;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class securefiledownload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.out.println("Testing started");
		 driver.get("https://the-internet.herokuapp.com/");
		 WebElement SecureFileDownload = driver.findElement(By.linkText("Secure File Download"));
		 SecureFileDownload.click();
		//set the username and password
	        String Username = "admin";
	        String Password = "admin";
	        String URL = "https://" +Username +":" +Password +"@"+ "the-internet.herokuapp.com/download_secure";
			driver.get(URL);
			// Execute the JavaScript to trigger the download
			/*JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.open('" + URL + "');");*/
			//driver.switchTo().alert().accept();
			/*WebElement file1= driver.findElement(By.xpath("//a[@href='/download_secure/CGI.jpeg']"));
			file1.click();*/
			//WebDriverWait wait = new WebDriverWait (driver,60);
			//WebElement File1 = driver.findElement(By.linkText("the-internet.herokuapp.com/download_secure"));
			WebElement File1 = driver.findElement(By.xpath("//a[@href=\"download_secure/puppy_and_kitten.jpg\"]")); 
			File1.click();
			
		 //driver.get("https://the-internet.herokuapp.com/download_secure");
		 Thread.sleep(10000);
		 System.out.println("testcase execution completed");
		 System.out.println("testing completed");
		 driver.quit();
	}

}
