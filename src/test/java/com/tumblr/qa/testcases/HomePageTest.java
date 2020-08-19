package com.tumblr.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tumblr.qa.base.TestBase;
import com.tumblr.qa.pages.HomePage;
import com.tumblr.qa.pages.LoginPage;
import com.tumblr.qa.util.TestUtil;

public class HomePageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	 

	public HomePageTest() {
		super();
	}
 
	@BeforeMethod
	public void setUp() {
		initialization();
		//testUtil = new TestUtil();
		//loginPage = new LoginPage();
	}
	
	
	 @Test
	public void verifyHomePageTitleTest(){
		homePage.verifyHomePageTitle();
		 	
	}
	 
	 @Test
	public void verifyEmailmessage()	{
	
	homePage.emailmessage();
	
	}
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	

}
