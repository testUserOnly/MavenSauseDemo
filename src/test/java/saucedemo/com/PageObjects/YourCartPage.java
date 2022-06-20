package saucedemo.com.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourCartPage extends BasePage {
	
	
	//page factory
	@FindBy (css=".shopping_cart_badge")	
	private WebElement cartBtn;
	
	@FindBy (css=".btn.btn_action.btn_medium.checkout_button")	
	private WebElement checkoutBtn;
	
	

	public YourCartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	public void OpenCartPage() throws InterruptedException {
	

		
		click(cartBtn); // click and open cart
		click(checkoutBtn); // click and open checkOutpage
		
		
		Thread.sleep(2000);

	
	}

}