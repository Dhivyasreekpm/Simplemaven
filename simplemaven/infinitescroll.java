package simplemaven;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class infinitescroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.out.println("Testing started");
		 driver.get("https://the-internet.herokuapp.com/");
		 WebElement InfiniteScroll = driver.findElement(By.linkText("Infinite Scroll"));
		 InfiniteScroll.click();
		 driver.get("https://the-internet.herokuapp.com/infinite_scroll");
		 JavascriptExecutor js = (JavascriptExecutor) driver;

         //get the height of the webpage and scroll to the end
         js.executeScript("window.scrollTo(0, 2000)");

		 Thread.sleep(1000);
		 System.out.println("testcase execution completed");
		 System.out.println("testing completed");
		 driver.quit();
	}

}
