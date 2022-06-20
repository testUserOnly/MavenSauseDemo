package saucedemo.com.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{
	
	// page factory
	
	@FindBy (css="#user-name")	
	private WebElement userField;
	@FindBy (css="#password")	
	private WebElement passwrodField;
	@FindBy (css=".submit-button.btn_action")	
	private WebElement loginBtn;

	
	@FindBy (css=".error-message-container.error")	
	private WebElement errorLabel;
	
	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	
	public void login (String user, String password) {
		fillText(userField, user);
		fillText(passwrodField,password);
		click(loginBtn);
		
		
	}
	
	// validation method 
	
	public String getFinishMsg() {
		return getText(errorLabel);
	}


}
