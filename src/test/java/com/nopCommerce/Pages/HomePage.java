package com.nopCommerce.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class HomePage {
		public WebDriver driver;
		
		@FindBy(linkText ="Log in")
		private WebElement loginHomePageLink;
		

		public HomePage (WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
				
		public LoginPage clickOnloginHomePageLink() {
			loginHomePageLink.click();
				return new LoginPage(driver);
	}		
}
		
//		public class HomePage {
//	public WebDriver driver;
//	
//	@FindBy(linkText ="Register")
//	private WebElement registerLink;
//
//
//	public HomePage (WebDriver driver) {
//		this.driver = driver;
//		PageFactory.initElements(driver, this);
//	}
//
//
//	public RegisterPage clickOnRegisterLink() {
//		registerLink.click();
//		return new RegisterPage(driver);
