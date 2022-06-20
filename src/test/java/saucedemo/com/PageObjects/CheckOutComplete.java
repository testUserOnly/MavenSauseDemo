package saucedemo.com.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutComplete extends BasePage  {

	
	//Pagefactory

	@FindBy (css="#first-name")	
	private WebElement firstnameField;
	@FindBy (css="#last-name")	
	private WebElement lastnameField;
	@FindBy (css="#postal-code")	
	private WebElement postalcodeField;

	@FindBy (css="#continue")	
	private WebElement continueBtn;


	@FindBy (css=".btn.btn_action.btn_medium.cart_button")	
	private WebElement CheckOutFinishBtn;



	public CheckOutComplete(WebDriver driver) {
		super(driver);

	}





	public void CheckOutDetails(String firstname ,String lastname , String zip) throws InterruptedException {


		fillText(firstnameField , firstname);
		Thread.sleep(2000);

		fillText(lastnameField, lastname);
		Thread.sleep(2000);

		fillText(postalcodeField, zip);
		Thread.sleep(2000);

		click(continueBtn);
		Thread.sleep(2000);


	}

	public void CheckOutFinish() throws InterruptedException {

	click(CheckOutFinishBtn); // click on finish button



	}

}
