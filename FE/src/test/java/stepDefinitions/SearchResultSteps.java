package stepDefinitions;

import com.mumzworld.pages.SearchResultPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.mumzworld.utilities.Common;

public class SearchResultSteps {
    SearchResultPage searchResultPage = new SearchResultPage(Common.getDriver());

    private static Logger logger = LoggerFactory.getLogger(SearchResultSteps.class);

    //region Given
    @Given("User navigates to mumzworld url")
    public void userNavigatesToMumzworldUrl() {
        logger.info("Navigating to mumzworld.com");
    }
    //endregion

    //region And
    @And("^User adds item num to cart (\\d+)$")
    public void userSelectItem(int itemNumber) {
        logger.info("Selecting ItemNumber : "+ itemNumber);
        searchResultPage.selectTheItem(itemNumber);
    }
    //endregion

    //region When
    @When("^search for product \"([^\"]*)\"$")
    public void searchForProduct(String productName) {
        logger.info("Searching the product Toys");
        searchResultPage.clickSearchBoxAndEnterItemNameAndClickSearch(productName);
    }
    //endregion

    //region Then
    @Then("^User verifies text \"([^\"]*)\" on search result page$")
    public void userVerifiesTextOnLandingPage(String expectedText) {
        logger.info("Verifying the text on Search result page");
        //Act
        String actualText = searchResultPage.getTextOnLandingPage();

        //Assert
        Assert.assertEquals(expectedText, actualText);
    }
    //endregion
}