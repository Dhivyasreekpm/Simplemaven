package simplemaven;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//import io.github.bonigarcia.wdm.WebDriverManager;
public class ExtentReport {
  
//creating driver object
 private static WebDriver driver = null;
 //setting expected title from the ebay.com
 static String expectedTitleebay ="Electronics, Cars, Fashion, Collectibles & More | eBay";
  
public static void main(String[] args) throws InterruptedException {
  
//create the htmlReporter object 
  ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extentReport.html");
//create ExtentReports and attach reporter(s)
  ExtentReports extent = new ExtentReports();
  extent.attachReporter(htmlReporter);
  System.out.println("Testing started");
//creates a toggle for the given test, add all log events under it
  ExtentTest test1 = extent.createTest("ebay Search Test", "test to validate search box ");
  
//initializing and starting the browser
  
  driver = new ChromeDriver();
  test1.log(Status.INFO, "Starting test case");
//maximize the window 
  driver.manage().window().maximize();
  test1.pass("maximize has done");
  
//Navigate to Ebay.com
  driver.get("https://www.ebay.com");
  Thread.sleep(1000);
  test1.pass("Navigate to Ebay.com");
  
//compare whether the title id matching
  String actualTitle = driver.getTitle();
  Assert.assertEquals(actualTitle, expectedTitleebay);
  test1.pass("title is correct");
  
//enter in the TextBox
  driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("Mobile");
  test1.pass("Entered thex in the text box");
  
  //hit enter
  /*driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).sendKeys(Keys.RETURN); 
  test1.pass("Press keybopard enter key");*/
  
  driver.quit();
  
  test1.pass("closed the browser");
  test1.info("test completed");
  
  System.out.println("testcase execution completed");
	
	 System.out.println("testing completed");
	 driver.quit();
   
  //write results into the file
  extent.flush();
 }
}