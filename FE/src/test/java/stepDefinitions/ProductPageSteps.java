package stepDefinitions;

import com.mumzworld.pages.ProductPage;
import com.mumzworld.utilities.Common;
import com.mumzworld.utilities.ScenarioContext;
import cucumber.api.java.en.And;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProductPageSteps {
    ProductPage productPage = new ProductPage(Common.getDriver());
    private static Logger logger = LoggerFactory.getLogger(ProductPageSteps.class);
    private ScenarioContext scenarioContext;

    public ProductPageSteps(ScenarioContext scenarioContext) {
        this.scenarioContext = scenarioContext;
    }

    //region And
    @And("^User clicks on shopping cart$")
    public void userClicksOnAddToCart() throws InterruptedException {
        logger.info("Clicking on shopping cart Button");
        productPage.clickButtonShoppingCart();
    }
    //endregion

    //region Then

    //endregion
}