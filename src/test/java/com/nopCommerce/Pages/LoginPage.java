package com.nopCommerce.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public WebDriver driver;
    

    @FindBy (id = "Email")
	private WebElement emailField;

    @FindBy(id = "Password")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@class='button-1 login-button']")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); 
    }

    public void enterEmail(String emailText) {
    	emailField.sendKeys(emailText);
      //emailField.sendKeys(emailText);
    }
    
    public void enterPassword(String passwordText) {    	
        passwordField.sendKeys(passwordText);
    } 

    public void clickOnLoginButton() {
        loginButton.click();
    }
}
//@FindBy(id = "FirstName")
//private WebElement firstNameField;

//public void enterFirstName(String firstNameText) {
//	firstNameField.sendKeys(firstNameText);