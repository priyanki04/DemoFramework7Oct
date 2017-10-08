package Testcases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ApplictnPages.HomePage;
import ApplictnPages.LoginPage;
import Factory.BrowserFactory;
import Factory.DataProviderFactory;

public class VerifyLoginPage {
	
	  
	WebDriver driver;
	
	@BeforeMethod
	public void setUp(){
		
        driver = BrowserFactory.getApplication("Firefox");
		
		driver.get(DataProviderFactory.getConfig().getApplicationUrl());
	}
	
	@Test
	public void testLoginPage(){
		
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		
		String title = home.getApplicationTitle();
		
		Assert.assertTrue(title.contains("Avactis Demo Store"));
		
		home.clickLogin();
		
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		
		login.loginApplication(DataProviderFactory.getExcel().getData(0, 1, 0),DataProviderFactory.getExcel().getData(0, 1, 1));
		
		login.verifyDashboardTitle();
	}
	
	
	@AfterMethod
	public void tearDown(){
		
		BrowserFactory.closeBrowser(driver);
	}
	

}
