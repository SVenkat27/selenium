package com.OrangeHRMApplicationBaseTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.Utility.Log;

public class BaseTest {

	
	public static WebDriver driver;
	
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	
	@BeforeMethod
	public void setUp()
	{
	System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
	driver = new ChromeDriver();
	
	Log.info(" Chorme Browser Launched Successfully ");	
	driver.manage().deleteAllCookies();
	driver.get(applicationUrlAddress);
	Log.info(" Successfully Naviagated to OrangeHRM Application ");
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	}
	
	@AfterMethod
	public void tearDown()
	{
	driver.quit();

	Log.info(" OrangeHRM Application Closed successfully ");
	}
}
