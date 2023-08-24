package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.PageObjectManager;
import utils.TestContextSetup;

public class LoginSteps {
    TestContextSetup testContextSetup;
    PageObjectManager pageObjectManager;
    public LoginSteps(TestContextSetup testContextSetup) {
        this.testContextSetup=testContextSetup;
    }

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        LoginPage loginPage = testContextSetup.pageObjectManager.getLoginPage();
        loginPage.checkLoginPageTitle();
    }
    @When("User login into the application")
    public void user_login_into_the_application() {
        LoginPage loginPage = testContextSetup.pageObjectManager.getLoginPage();

        loginPage.enterUsername();
        loginPage.enterPassword();
        loginPage.clickLoginButton();
    }
    @Then("Samples List is displayed")
    public void samples_list_is_displayed() {
        LoginPage loginPage = testContextSetup.pageObjectManager.getLoginPage();

        loginPage.checkSamplesListPageTitle();
    }
}
