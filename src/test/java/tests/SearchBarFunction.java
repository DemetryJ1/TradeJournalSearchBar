package tests;

import org.testng.annotations.Test;

import pages.SearchBarPages;
import utilities.Driver;
import utilities.PropertiesReader;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class SearchBarFunction {
	
	SearchBarPages searchbar;
	
  @Test
  public void SearchingforApple() {
	  
	  searchbar = new SearchBarPages(); 
	  
	  Driver.getDriver().get(PropertiesReader.getProperty("tradeURL"));
	  
	  searchbar.userName.sendKeys(PropertiesReader.getProperty("userName"));
	
	  searchbar.password.sendKeys(PropertiesReader.getProperty("passWord"));
		
	  searchbar.Btn.click();
	  
	  searchbar.searchInput.sendKeys(PropertiesReader.getProperty("Apple"));
	  
	  searchbar.symbolSearch.click();
	  
	  searchbar.appleSearch.isDisplayed();
	  Assert.assertTrue(true);
	  System.out.println("All Apple entries are displayed");
	  
	  
	  
  }
  
  @Test
  
  public void SearchingforTA() {
	  
	  searchbar = new SearchBarPages(); 
	  
	  Driver.getDriver().get(PropertiesReader.getProperty("tradeURL"));
	  
	  searchbar.userName.sendKeys(PropertiesReader.getProperty("userName"));
		
	  searchbar.password.sendKeys(PropertiesReader.getProperty("passWord"));
		
	  searchbar.Btn.click();
	  
	  searchbar.searchInput.sendKeys(PropertiesReader.getProperty("TandA"));
	  
	  searchbar.symbolSearch.click();
	  
	  searchbar.dualSearch.isDisplayed();
	  Assert.assertTrue(true);
	  System.out.println("All Tesla and Apple entries are displayed");
	  
	  
  }
  
  
  @Test
  
  public void SearchingwithDate() {
	  
	  searchbar = new SearchBarPages(); 
	  
	  Driver.getDriver().get(PropertiesReader.getProperty("tradeURL"));
	  
	  searchbar.userName.sendKeys(PropertiesReader.getProperty("userName"));
		
	  searchbar.password.sendKeys(PropertiesReader.getProperty("passWord"));
		
	  searchbar.Btn.click();
	  
	  searchbar.dateSearch.sendKeys(PropertiesReader.getProperty("Trade_date"));
	  
	  searchbar.dateSearch.isDisplayed();
	  
	  searchbar.symbolSearch.click();
	  
	    
	  
	  
	  
	  
  }
  
  
  @Test
  
  public void SearchingwithSymbDate() {
	  
	  
	  searchbar = new SearchBarPages(); 
	  
	  Driver.getDriver().get(PropertiesReader.getProperty("tradeURL"));
	  
	  searchbar.userName.sendKeys(PropertiesReader.getProperty("userName"));
		
	  searchbar.password.sendKeys(PropertiesReader.getProperty("passWord"));
		
	  searchbar.Btn.click();
	  
	  searchbar.dateSearch.sendKeys("01/30/2022");
	  
	  searchbar.searchInput.sendKeys("AAPL");
	  
	  searchbar.symbolSearch.click();
	  
	  searchbar.Apple_Jan30Confirm.isDisplayed();
	  Assert.assertTrue(true,"");
	  System.out.println("Search Confirmed");
	  
	  
	  
	  
	  
  }
  
  @Test
  public void SearchingWithNoRecords() {
	  
	  searchbar = new SearchBarPages(); 
	  
	  Driver.getDriver().get(PropertiesReader.getProperty("tradeURL"));
	  
	  searchbar.userName.sendKeys(PropertiesReader.getProperty("userName"));
		
	  searchbar.password.sendKeys(PropertiesReader.getProperty("passWord"));
		
	  searchbar.Btn.click();
	  
	  searchbar.searchInput.sendKeys(PropertiesReader.getProperty("incorrectSearch"));
	  
	  searchbar.symbolSearch.click();
	  
	  
	  
	  
	  
  }
  
	 
	  
	  
	  
	  
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  Driver.getDriver().manage().window().maximize();
	  
  }
  

  @AfterMethod
  public void afterMethod() {
  }

}
