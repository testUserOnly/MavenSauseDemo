package saucedemo.com.RunTests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import saucedemo.com.RunTests.BaseTestSetup;
import saucedemo.com.PageObjects.LoginPage;
import saucedemo.com.PageObjects.ProductsPage;

import org.testng.annotations.Test;  // <---------------------important LINE!!!  1

						///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
						//																													 //
						//   add TESTng  by Buildpath liblary ->  configure buildpath  , to project  and make sure you restarted eclipse .   //
						//																													 //
						///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



public class LoginTestNG extends BaseTestSetup {


	
	

	@Test   // <---------------------important LINE!!!  3
	public void tc_01_login() throws InterruptedException {
		
//		setup();

		LoginPage lp = new LoginPage(driver);
		lp.login("standard_user", "secret_sauceooooooo");
		
		String expeted = "Epic sadface: Username and password do not match any user in this service";
		String actual = lp.getFinishMsg();
		Assert.assertEquals(actual, expeted);

       
		
		Thread.sleep(2000);
       

	}
     
	
	@Test
	public void tc_02_login() throws InterruptedException {
		
	//	setup();

		LoginPage lp = new LoginPage(driver);
		lp.login("problem_user", "secret_saucexxxxx");
		
		String expeted = "Epic sadface: Username and password do not match any user in this service";
		String actual = lp.getFinishMsg();
		Assert.assertEquals(actual, expeted);


		Thread.sleep(2000);
		
	}

	@Test
	public void tc_03_login() throws InterruptedException {
		
	

		LoginPage lp = new LoginPage(driver);
		lp.login("standard_user", "");
		
	//	String expeted = "Epic sadface: Password is required";
		String expeted = "Epic sadface: Password is incorrect";
		String actual = lp.getFinishMsg();
		Assert.assertEquals(actual, expeted);

		
		Thread.sleep(2000);
	}


	@Test
	public void tc_04_login() throws InterruptedException {
		
	//	setup();

		LoginPage lp = new LoginPage(driver);
		lp.login("standard_user", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
		
		String expeted = "Epic sadface: Username and password do not match any user in this service";
		String actual = lp.getFinishMsg();
		Assert.assertEquals(actual, expeted);

		Thread.sleep(2000);
		
	}
       

}
