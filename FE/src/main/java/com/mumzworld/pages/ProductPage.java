package com.mumzworld.pages;

import com.mumzworld.utilities.Common;
import com.mumzworld.utilities.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ProductPage extends Common {

    private By cartButton = By.xpath("//a[@title='Cart']");

    private WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonShoppingCart() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Constants.LONG_TIMEOUT, TimeUnit.SECONDS);
        Thread.sleep(5000);
        getElement(driver, cartButton).click();
    }

}