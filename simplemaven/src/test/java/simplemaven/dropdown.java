package simplemaven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class dropdown {
	public static void main(String[] args) throws InterruptedException {
		String baseURL = "https://demo.guru99.com/test/newtours/register.php";
		WebDriver driver = new ChromeDriver();
		driver.get(baseURL);
		//Select drpCountry = new Select(driver.findElement(By.name("country")));
		//drpCountry.selectByVisibleText("ANTARCTICA");
		WebElement dropdown = driver.findElement(By.name("country"));
		dropdown.click();
		List<WebElement> options = dropdown.findElements(By.tagName("option"));

		//Iterate through the options and select an option
		for(WebElement option : options) {
		    if(option.getText().equals("ANTARCTICA")) {
		        option.click();
		        System.out.println("option selected");
		        break;
		    }
		}
        Thread.sleep(1000);
        System.out.println("Testcase1 executed successfully");
		//Selecting Items in a Multiple SELECT elements
		driver.get("http://jsbin.com/osebed/2");
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		fruits.selectByVisibleText("Banana");
		fruits.selectByIndex(3);
		System.out.println("options selected");
		Thread.sleep(1000);
		System.out.println("Testcase2 executed  successfully");
		driver.quit();
		
		
	}
	  
}
