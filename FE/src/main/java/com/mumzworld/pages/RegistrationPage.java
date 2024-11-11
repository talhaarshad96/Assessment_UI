package com.mumzworld.pages;

import com.mumzworld.utilities.Common;
import com.mumzworld.utilities.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class RegistrationPage extends Common {

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    private By fNameField = By.xpath("//input[@id='firstname']");
    private By lNameField = By.xpath("//input[@id='lastname']");
    private By emailField = By.xpath("//input[@id='email']");
    private By passwordField = By.xpath("//input[@id='password']");
    private By createAccountButton = By.xpath("//button[@id='register_btn']");

    public RegistrationPage enterFormDetails(String fname, String lastName, String email, String password) {
        waitForVisibleWebElement(driver, fNameField, Constants.MEDIUM_TIMEOUT);
        driver.manage().timeouts().implicitlyWait(Constants.MEDIUM_TIMEOUT, TimeUnit.SECONDS);
        waitForElementToBeClickable(driver, fNameField, Constants.MEDIUM_TIMEOUT);
        getElement(driver, fNameField).sendKeys(fname);
        getElement(driver, lNameField).sendKeys(lastName);
        getElement(driver, emailField).sendKeys(email);
        getElement(driver, passwordField).sendKeys(password);
        getElement(driver, createAccountButton).click();
        return this;
    }
}
