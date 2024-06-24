package simplemaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.out.println("Testing started");
		 driver.get("https://the-internet.herokuapp.com/");
		 WebElement Fileupload = driver.findElement(By.linkText("File Upload"));
		 Fileupload.click();
		 driver.get("https://the-internet.herokuapp.com/upload");
		 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS); //for page load
		  //for Implicit wait
		 
		   JavascriptExecutor js = (JavascriptExecutor)driver; //Scrolling using JavascriptExecutor
		   js.executeScript("window.scrollBy(0,380)");//Scroll Down to file upload button (+ve)
		   Thread.sleep(3000);
		 
		   // FILE UPLOADING USING SENDKEYS ....
		 
		   WebElement choosefile = driver.findElement(By.xpath("//input[@id='file-upload']"));
		   //click on ‘Choose file’ to upload the desired file
		   //choosefile.sendKeys("C:\\Users\\Dhivy\\OneDrive\\Pictures\\Saved Pictures\\me.jpg"); //Uploading the file using sendKeys
		   choosefile.sendKeys("D:\\Downloaded Files\\otherfiles\\notepad++ files\\new 1.txt");
		   
		   //WebElement dragdropupload = driver.findElement(By.xpath("//div[@id='drag-drop-upload']"));
		  /* WebElement dragdropupload = driver.findElement(By.cssSelector("#drag-drop-upload"));
		   dragdropupload.sendKeys("C:\\Users\\Dhivy\\OneDrive\\Pictures\\Saved Pictures\\me.jpg");*/
		   System.out.println("File is Uploaded Successfully");
		 
		 Thread.sleep(1000);
		 System.out.println("testcase execution completed");
		 System.out.println("testing completed");
		 driver.quit();
	}

}
