package com.mumzworld.pages;

import com.mumzworld.utilities.Common;
import com.mumzworld.utilities.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class TotalSummaryPage extends Common {
    public TotalSummaryPage(WebDriver driver) {
        this.driver = driver;
    }

    private By increaseQuantity = By.xpath("//button[@id='increase_button']");
    private By quantityFromCartImage = By.xpath("//div[contains(@class, 'bg-secondary') and contains(@class, 'text-tertiary-white') and contains(@class, 'border-tertiary-white')]");

    public void setTheQuantity(int quantity) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Constants.MEDIUM_TIMEOUT, TimeUnit.SECONDS);
        waitForPresenceWebElement(driver, increaseQuantity, Constants.LONG_TIMEOUT);
        for (int i = 1; i < quantity; i++) {
            getElement(driver, increaseQuantity).click();
            Thread.sleep(2000);
        }
    }

    public Integer getQuantityFromCartImage(){
        waitForVisibleWebElement(driver, quantityFromCartImage, Constants.MEDIUM_TIMEOUT);
        return Integer.valueOf(getElement(driver, quantityFromCartImage).getText());
    }
}