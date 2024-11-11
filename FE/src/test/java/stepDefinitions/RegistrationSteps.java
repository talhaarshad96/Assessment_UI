package stepDefinitions;

import com.mumzworld.pages.RegistrationPage;
import com.mumzworld.pages.TotalSummaryPage;
import com.mumzworld.utilities.Common;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

public class RegistrationSteps {

    RegistrationPage registrationPage = new RegistrationPage(Common.getDriver());
    private static Logger logger = LoggerFactory.getLogger(TotalSummaryPage.class);

    @And("^User fills the registration form for new user$")
    public void userClicksOnCreateAccount(DataTable dataTable) {
        logger.info("Filling the new user form");

        // Convert DataTable to List<Map<String, String>>
        List<Map<String, String>> userDetailList = dataTable.asMaps(String.class, String.class);
        Map<String, String> userDetails = userDetailList.get(0); //assuming we have one row.

        String firstName = userDetails.get("firstName");
        String lastName = userDetails.get("lastName");
        String email = userDetails.get("email");
        String password = userDetails.get("password");

        registrationPage.enterFormDetails(firstName, lastName, email, password);
    }
}
