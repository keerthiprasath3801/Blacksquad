package com.actions;


import org.openqa.selenium.support.PageFactory;
import com.locators.loginPageLocators; // Importing locator class
import com.utility.BaseClass; // Importing base class for driver setup

// Creating a class named loginPageActions
public class loginPageActions {
    loginPageLocators loginpagelocators; // Declaring an instance of loginPageLocators class

    // Constructor for loginPageActions class
    public loginPageActions() {
        loginpagelocators = new loginPageLocators(); // Initializing loginPageLocators object
        PageFactory.initElements(BaseClass.getDriver(), loginpagelocators); // Initializing page elements using PageFactory
    }

    // Method to click on a button (Button1)
    public void clickButton1() {
        loginpagelocators.loginButton.click();
    }

    // Method to click on another button (Button2)
    public void clickButton2() {
        loginpagelocators.mainLogin.click();
    }

    // Method to set the email field with the given email address
    public void setEmail(String strEmail) {
        loginpagelocators.EmailId.sendKeys(strEmail);
    }

    // Method to set the password field with the given password
    public void setPassword(String strPass) {
        loginpagelocators.Password.sendKeys(strPass);
    }

    // Method to click on a general button
    public void Button() {
        loginpagelocators.Button.click();
    }

    // Method to set a predefined email address
    public void email() {
        loginpagelocators.EmailId.sendKeys("herzutorka@gufum.com");
    }

    // Method to set a predefined password
    public void password() {
        loginpagelocators.Password.sendKeys("Welcome@123");
    }

    // Method to perform login with provided email and password
    public void LoginUser(String strEmail, String strPass) {
        setEmail(strEmail);
        setPassword(strPass);
        Button();
    }
}
