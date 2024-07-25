package com.nopCommerce.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutSuccessPage {
	
	public WebDriver driver;

@FindBy (linkText = "Log out")
private WebElement logOutPageLink;

public LogoutSuccessPage (WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
public boolean logOutAppearancePage (WebDriver driver) {
	boolean displayStatus = logOutPageLink.isDisplayed();
	return displayStatus;
}

//public boolean validateAccountSuccessCreateMessage() {
//	boolean displayStatus = yourRegistrationCompletedMessage.isDisplayed();
//	return displayStatus;
}
