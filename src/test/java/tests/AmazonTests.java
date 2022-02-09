package tests;

import org.testng.annotations.Test;

import utilities.Driver;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class AmazonTests {
  @Test
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() {
	  Driver.getDriver()
  }

  @AfterMethod
  public void afterMethod() {
  }

}
