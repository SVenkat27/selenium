package OrangeHRMApplicationTestCases;

import org.testng.annotations.Test;

import com.OrangeHRMApplicationBaseTest.BaseTest;
import com.OrangeHRMApplicationPages.OrangeHRMLoginPage;

public class OrangeHRMLoginPageTest extends BaseTest {

	OrangeHRMLoginPage loginPage;

	@Test(priority=1,description=" validating OrangeHRM Application LogIN Page Logo Test ")
	public void logInPageLogoValidationTest()
	{
	loginPage= new OrangeHRMLoginPage();
	loginPage.logInPageLogoValidation();
	}

	@Test(priority=2,description=" validating OrangeHRM Application LogIN Page Text Test ")
	public void logInPageTextValidationTest()
	{
		loginPage= new OrangeHRMLoginPage();
		loginPage.logInPageTextValidation();
	}

	@Test(priority=3,description=" validating OrangeHRM Application LogIN Page LogIn Funcationality Test ")
	public void logInPageLogInFuncationalityTest()
	{
		loginPage= new OrangeHRMLoginPage();
		loginPage.logInPageLogInFuncationality("Admin", "Venkat@123");
	}
	
}
