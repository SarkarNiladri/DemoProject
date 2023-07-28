package demoPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest {
public static WebDriver driver;
  @Test
  public void amazon() throws InterruptedException {
	  
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");  
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.quit();
	
	  
	  
  }
}
