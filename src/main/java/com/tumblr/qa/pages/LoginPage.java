package com.tumblr.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.tumblr.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	
	 
	//Page Factory - OR:
	@FindBy(xpath="//input[@id='signup_determine_email']")
	WebElement email;
	
	@FindBy(xpath="//span[@class='signup_determine_btn active']")
	WebElement Nextbtn;
	
	@FindBy(xpath= "//div[@id='signup_magiclink']//a[@class='forgot_password_link'][contains(text(),'Use password to log in')]")
	WebElement pwdBtn;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement pwdField;
	
	@FindBy(xpath="//span[@class='signup_login_btn active']")
	WebElement LoginBtn;
	
	@FindBy(xpath="//input[@placeholder='Search Tumblr']")
	WebElement Searchfield;
	
	@FindBy(xpath="//span[@class='_1TqU6']//span[@class='J5MwT'][contains(text(),'watches')]")
	WebElement searchresult;
	
	String Actual;
	String Expected;
	WebDriverWait wait = new WebDriverWait(driver, 30);
	
	
	//Initializing the Page Objects:
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateLoginPageTitle(){
		
		return driver.getTitle();
	}
 
	 
	public void login_Tumblr() 
	  {
		  System.out.println("Chrome is launching");
		   driver.get("https://www.tumblr.com/login");
		   Actual = driver.getTitle();
		   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='signup_determine_email']")));
		   email.sendKeys("leoaugust1991@gmail.com");
		   Nextbtn.click();
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   pwdBtn.click();
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   pwdField.sendKeys("Tumblr@7");
		   LoginBtn.click();
		   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Search Tumblr']")));
		  }
	
   
	  public void search_tumblr()
	  {
		 Searchfield.sendKeys("Watches");
		 searchresult.click();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.close(); 
	  }
	
}
