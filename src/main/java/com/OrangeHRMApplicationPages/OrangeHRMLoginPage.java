package com.OrangeHRMApplicationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeHRMApplicationBaseTest.BaseTest;
import com.Utility.Log;

public class OrangeHRMLoginPage extends BaseTest {


	public void OrangeHRMLogInPage() // its a constructor
	{
		PageFactory.initElements(driver, this);
	}

	// Should be written with Identification of Elements of the Webpage
	// Should be written with Business Logics(User Defined methods) - to perform operation
	// on the Elements

	// Object Repository Class

	// WebElement orangeHRMLogo=driver.findElementBy(xpath="//*[@id=\"divLogo\"]/img");

	/* @FindBy(xpath="//*[@id=\"divLogo\"]/img")
	 WebElement orangeHRMLogo;

	 @FindBy(id="logInPanelHeading")
	 WebElement orangeHRMLogInPageText;
	 
	 @FindBy(id="txtUsername")
	 WebElement userName;
	 
	 @FindBy(id="txtPassword")
	 WebElement password;
	 
	 @FindBy(id= "btnLogin")
	 WebElement logInButton;
  */
	 
	 public void logInPageLogoValidation()
	 {
		 By orangeHRMLogoL=By.xpath("//*[@id=\"divLogo\"]/img");
		 WebElement orangeHRMLogo=driver.findElement(orangeHRMLogoL);
		 boolean flag=orangeHRMLogo.isDisplayed();
		 
		 if(flag)
		 {
		 Log.info("OrangeHRM Application logo found on OrangeHRM Application LogIn Page - PASS ");
		 }
		 else
		 {
		 Log.info("OrangeHRM Application logo NOT found on OrangeHRM Application LogIn Page - FAIL ");
		 }
	 
	 }
	 
	 public void logInPageTextValidation()
	 {
		 By logInPanelHeadingL=By.id("logInPanelHeading");
		 WebElement orangeHRMLogInPageText=driver.findElement(logInPanelHeadingL);
		 
		 String expected_OrangeHRLApplicationLogInPageText="LOGIN Panel";
		 Log.info("The expected LogIN Page Text is :- "+expected_OrangeHRLApplicationLogInPageText);
		 
		 String actual_OrangeHRLApplicationLogInPageText=orangeHRMLogInPageText.getText();
		 Log.info("The actual LogIn Page Text is :- "+actual_OrangeHRLApplicationLogInPageText);
		 
		 if(actual_OrangeHRLApplicationLogInPageText.equals(expected_OrangeHRLApplicationLogInPageText))
		 {
		 Log.info("Successfully navigated to OrangeHRM Application LogIN page - PASS");
		 }
		 else
		 {
		 Log.info("Failed to navigat to OrangeHRM Application LogIn Page - FAIL");
		 }
	   
	 
	 }
	 
	 
	 public void logInPageLogInFuncationality(String userNameTestData, String passwordTestData)
	 {
		 

		 
		 
		 By usernameL=By.id("txtUsername");
		 WebElement userName=driver.findElement(usernameL);
		 
		 By passwordL=By.id("txtPassword");
		 WebElement password=driver.findElement(passwordL);
		 
		 By loginL=By.id("btnLogin");
		 WebElement logInButton=driver.findElement(loginL);
		 
		 
		 userName.sendKeys(userNameTestData);
		 password.sendKeys(passwordTestData);
		 logInButton.click();
	 
	 }
}
