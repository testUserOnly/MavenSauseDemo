package saucedemo.com.RunTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTestSetup {
	
	
	

	
	
	
	
	
	public WebDriver driver;


	@BeforeClass //<--- annotation calling TestNG + import org.testng.annotations.BeforeClass;
	public void setup () throws InterruptedException {

		// step 1 - Created setting-up the driver and get page address :

		System.setProperty("webdriver.chrome.driver", "C:\\automation\\drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		 
		driver.get("https://www.saucedemo.com/");
		
		Thread.sleep(1000);
	}

	
	
	 @AfterClass //<--- annotation calling TestNG  + import org.testng.annotations.AfterClass;
	 public void tearDown() { 
		 driver.quit(); // call driver.quit(); in each method.
	 }
	
	
	
}