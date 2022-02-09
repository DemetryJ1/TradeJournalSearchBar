package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class SearchBarPages {
	public SearchBarPages() {
	
	PageFactory.initElements(Driver.getDriver(), this);
}

@FindBy (id = "username")
public WebElement userName;

@FindBy (id = "password")
public WebElement password;

@FindBy (xpath = "//button[@class='btn btn-lg btn-primary btn-block']")
public WebElement Btn;

@FindBy (name = "symbol")
public WebElement searchInput;

@FindBy (xpath = "//button[@class='btn btn-outline-success my-2 my-sm-0']")
public WebElement symbolSearch;

@FindBy(name = "date")
public WebElement dateSearch;

@FindBy(xpath = "//td[contains(text(), '$170.33')]")
public WebElement Apple_Jan30Confirm;

@FindBy(xpath = "//td[contains(text(),'AAPL')]")
public WebElement appleSearch;

@FindBy(xpath = "//td[contains(text(), 'TSLAAPPL')]")
public WebElement dualSearch;




}
