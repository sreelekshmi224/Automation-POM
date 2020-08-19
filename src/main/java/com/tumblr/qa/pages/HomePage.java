package com.tumblr.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import com.tumblr.qa.base.TestBase;

public class HomePage extends TestBase {

	WebDriverWait wait = new WebDriverWait(driver, 10);
	
	@FindBy(xpath="//a[@class='_6Vden _1oV36']")
	 WebElement  emailmessageLink ;
	 
	 String titile;

	// Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	 
	public void verifyHomePageTitle(){
		titile = driver.getTitle();
		System.out.println(titile);
		Assert.assertEquals(titile, "Tumblr","Home page title not matched");
	}
	
	
	
	 
	public boolean emailmessage() {
		
		return emailmessageLink.isDisplayed();
		
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='_6Vden _1oV36']")));
		
//		if(emailmessageLink){
//			System.out.println("Element is visible");
//		} else {
//			System.out.println("Element is hidden");
//		}
		
		
	}
	
	
	
		
	}
	
	
	
	
	
	
	


