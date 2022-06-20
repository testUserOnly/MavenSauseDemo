package saucedemo.com.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v100.webaudio.WebAudio;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage{

	
	// Pagefactory
	@FindBy (css = ".inventory_item")
	private List<WebElement> list;
	
	public ProductsPage(WebDriver driver) {
		super(driver);
		
	}

	// NEW WAY TO FIND ITEM By SPESIAL ZONE
	public void SelectProduct (String name ) {
	
    // List <WebElement> list = driver.findElements(By.cssSelector(".inventory_item"));  //  anotation moved to PageFactory 
		
     for (WebElement el:list) {
    	 WebElement titleEL = el.findElement(By.cssSelector(".inventory_item_name"));
    	 if (getText(titleEL).equalsIgnoreCase(name)){
    		 WebElement addBtn = el.findElement(By.cssSelector(".btn_inventory"));
    		 click(addBtn);
    		 break;
    	 }
    	 
     }
	}
}
