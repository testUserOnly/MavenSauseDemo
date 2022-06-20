package saucedemo.com.RunTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import saucedemo.com.PageObjects.CheckOutComplete;
import saucedemo.com.PageObjects.LoginPage;
import saucedemo.com.PageObjects.ProductsPage;
import saucedemo.com.PageObjects.YourCartPage;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		

		driver.get("https://saucedemo.com");


		Thread.sleep(1000);
		
		LoginPage lp = new LoginPage(driver);
		lp.login("standard_user", "secret_sauce");
		
		
		ProductsPage products = new ProductsPage(driver);
		products.SelectProduct("Sauce Labs Onesie");	
		
		Thread.sleep(2000);
		
	    products = new ProductsPage(driver);
	    products.SelectProduct("Sauce Labs Fleece Jacket");	
		
		Thread.sleep(2000);
		

		YourCartPage cart = new YourCartPage(driver);
		cart.OpenCartPage();
		
		
		CheckOutComplete  CheckOut = new CheckOutComplete(driver);
		CheckOut.CheckOutDetails("me", "mini" , "nozip");
		
		CheckOut.CheckOutFinish();
	}

}
