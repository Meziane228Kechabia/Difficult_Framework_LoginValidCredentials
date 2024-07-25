package com.nopCommerce.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nopCommerce.Pages.HomePage;
import com.nopCommerce.Pages.LoginPage;
import com.nopCommerce.Pages.LogoutSuccessPage;
import com.nopCommerce.TestBase.TestBase;

public class LoginToMyAccount extends TestBase {
	public LoginToMyAccount() throws Exception{ 
		  super();		  
	} 
	public WebDriver driver;
	public HomePage homePage;
	public LoginPage loginPage;
	public LogoutSuccessPage logoutSuccessPage;
	
@BeforeMethod
public void loginSetup() {
	
	driver = openingApplicationWithAnyBrowser(prop.getProperty("browser"));
	homePage = new HomePage(driver);
	homePage.clickOnloginHomePageLink();
	loginPage = new LoginPage(driver);
	}
@Test(priority =1)

public void loginWithValidCredentials( ) {
	String email = prop.getProperty("email");
	String password = prop.getProperty("password");
	loginPage.enterEmail(email); 
	loginPage.enterPassword(password);
	loginPage.clickOnLoginButton();
	//logoutSuccessPage = new LogoutSuccessPage(driver);
	logoutSuccessPage.logOutAppearancePage(driver);
	//Assert.assertTrue(logoutSuccessPage.logOutAppearancePage(driver));
	
}	

@AfterMethod
public void tearDown() {	
	driver.quit();
	}
}
