package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ApplictnPages.HomePage;
import Factory.BrowserFactory;
import Factory.DataProviderFactory;

public class VerifyHomePage {
	WebDriver driver;
	@BeforeMethod
	public void setUp(){
		driver =BrowserFactory.getApplication("Firefox");
		driver.get(DataProviderFactory.getConfig().getApplicationUrl());
	}
	
	@Test
	public void testHomePage(){
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		String title= home.getApplicationTitle();
		Assert.assertTrue(title.contains("Avactis Demo Store"));
	}
	
	@AfterMethod
	public void quitsBrowser(){
		BrowserFactory.closeBrowser(driver);
		
	}
	}
	


