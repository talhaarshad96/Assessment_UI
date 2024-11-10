package com.mumzworld.pages;

import com.mumzworld.utilities.Common;
import com.mumzworld.utilities.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class SearchResultPage extends Common {
    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
    }

    private By searchBoxField = By.xpath("//input[@id='search_textbox']");
    private By get_TextOn_LandingPage = By.xpath("//span[normalize-space()='Fast free delivery']");
    private String selectTheItemByIndex = "(//button[@title='Add to Cart'])[%s]";

    public SearchResultPage clickSearchBoxAndEnterItemNameAndClickSearch(String itemName) {
        waitForVisibleWebElement(driver, searchBoxField, Constants.MEDIUM_TIMEOUT);
        waitForElementToBeClickable(driver, searchBoxField, Constants.MEDIUM_TIMEOUT);
        getElement(driver, searchBoxField).sendKeys(itemName);
        getElement(driver, searchBoxField).sendKeys(Keys.ENTER);
        return this;
    }

    public String getTextOnLandingPage() {
        waitForVisibleWebElement(driver, get_TextOn_LandingPage, Constants.MEDIUM_TIMEOUT);
        return getElement(driver, get_TextOn_LandingPage).getText();
    }

    public void selectTheItem(Integer itemNum) {
        driver.manage().timeouts().implicitlyWait(Constants.MEDIUM_TIMEOUT, TimeUnit.SECONDS);
        waitForPresenceWebElement(driver, By.xpath(String.format(selectTheItemByIndex, itemNum)), Constants.LONG_TIMEOUT);
        waitForVisibleWebElement(driver, By.xpath(String.format(selectTheItemByIndex, itemNum)), Constants.LONG_TIMEOUT);
        getElement(driver, By.xpath(String.format(selectTheItemByIndex, itemNum))).click();
    }
}