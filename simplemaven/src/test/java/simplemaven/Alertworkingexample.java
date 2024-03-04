package simplemaven;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertworkingexample {
    public static void main(String[] args) throws NoAlertPresentException,InterruptedException {
        // Setting the path of chrome driver
        //System.setProperty(“webdriver.chrome.driver”, “Example Path”);

        // Creating an instance of chrome webdriver
        WebDriver driver = new ChromeDriver();

     // Alert Message handling
		
        driver.get("https://demo.guru99.com/test/delete_customer.php");			
                            		
     	      	
        driver.findElement(By.name("cusid")).sendKeys("53921");					
        driver.findElement(By.name("submit")).submit();			
        		
        // Switching to Alert        
        Alert alert = driver.switchTo().alert();		
        		
        // Capturing alert message.    
        String alertMessage= driver.switchTo().alert().getText();		
        		
        // Displaying alert message		
        System.out.println(alertMessage);	
        System.out.println("Testcase executed successfully");
        Thread.sleep(5000);
        		
        // Accepting alert		
        alert.accept();		
        
        driver.quit();
    }
}
