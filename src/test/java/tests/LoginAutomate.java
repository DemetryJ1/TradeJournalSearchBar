package tests;

import org.testng.annotations.Test;

import pages.Tradepages;
import utilities.Driver;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class LoginAutomate {
	
	Tradepages loginpage; 
	
  @Test
  public void tradeLogin() {
	  
	  loginpage = new Tradepages();
	  
	  Driver.getDriver().get("http://ec2-3-145-116-184.us-east-2.compute.amazonaws.com:8080/login?logout");
	  
	  loginpage.userName.sendKeys("Demetry");
		
	  loginpage.password.sendKeys("SuperDemetry123!");
		
	  loginpage.Btn.click();
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  Driver.getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  System.out.println("Before Test");
  }

  @AfterMethod
  public void afterMethod() {
	  Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  Driver.quitDriver();
	  System.out.println("Test is Complete");
  }
	  

}
