package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class Tradepages {
	
	public Tradepages () {
		
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (id = "username")
	public WebElement userName;
	
	@FindBy (id = "password")
	public WebElement password;
	
	@FindBy (xpath = "//button[@class='btn btn-lg btn-primary btn-block']")
	public WebElement Btn;
	
	
	
	

}
