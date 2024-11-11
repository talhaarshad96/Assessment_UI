package stepDefinitions;

import com.mumzworld.pages.TotalSummaryPage;
import com.mumzworld.utilities.Common;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TotalSummarySteps {

    TotalSummaryPage totalSummaryPage = new TotalSummaryPage(Common.getDriver());
    private static Logger logger = LoggerFactory.getLogger(TotalSummaryPage.class);


    //region And
    @And("^User increases product quantity by (\\d+)$")
    public void userIncreasesProductQuantityBy(int itemQuantity) throws InterruptedException {
        logger.info("Selecting ItemNumber : "+ itemQuantity);
        totalSummaryPage.setTheQuantity(itemQuantity);

    }

    @Then("^User verifies that the product quantity on Cart is shown as (\\d+)$")
    public void userVerifiesThatTheProductQuantityOnCartIsShownAs(Integer quantity) {
        logger.info("Verifying the quantity on Cart");
        //Act
        Integer actualText = totalSummaryPage.getQuantityFromCartImage();

        //Assert
        Assert.assertEquals(quantity, actualText);

    }

    @And("^User clicks on Proceed checkout$")
    public void userClicksOnProceedCheckout() {
        logger.info("Clicking on Proceed");
        totalSummaryPage.clickButtonProceedCheckout();
    }

    @And("^User clicks on Create Account$")
    public void userClicksOnCreateAccount() throws InterruptedException {
        logger.info("Clicking on Create Account");
        totalSummaryPage.clickButtonCreateAccount();
    }
    //endregion
}
