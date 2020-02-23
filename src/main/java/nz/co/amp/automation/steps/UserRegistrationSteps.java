package nz.co.amp.automation.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import nz.co.amp.automation.page.UserRegistrationPage;
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
