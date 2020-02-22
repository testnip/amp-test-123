package nz.co.nzpost.automation.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import nz.co.nzpost.automation.domain.MapHolder;
import nz.co.nzpost.automation.io.ModelFactory;
import nz.co.nzpost.automation.page.AddressSearchPage;
import nz.co.nzpost.automation.page.UserRegistrationPage;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRegistrationSteps {

    private final UserRegistrationPage userRegistrationPage;

    @Autowired
    public UserRegistrationSteps(UserRegistrationPage userRegistrationPage) {
        this.userRegistrationPage = userRegistrationPage;
    }

    @Given("^User is on customer portal$")
    public void userIsOnCustomerPortal() {
        userRegistrationPage.open();

    }

    @And("^User want to register$")
    public void userWantToRegister() throws InterruptedException {
        userRegistrationPage.clickLoginButton();
    }
}
