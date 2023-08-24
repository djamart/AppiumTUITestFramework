package steps;

import io.cucumber.java.After;
import pages.LoginPage;
import pages.PageObjectManager;
import utils.TestContextSetup;

public class Hooks {
    TestContextSetup testContextSetup;
    PageObjectManager pageObjectManager;
    public Hooks(TestContextSetup testContextSetup) {
            this.testContextSetup = testContextSetup;
    }
    @After
    public void AfterScenario() throws InterruptedException {
        LoginPage loginPage = testContextSetup.pageObjectManager.getLoginPage();

        loginPage.clickBackButton();
        Thread.sleep(1000);
        loginPage.clickBackButton();
    }
}
