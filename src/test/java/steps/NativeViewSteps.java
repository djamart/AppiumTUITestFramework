package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.NativeViewPage;
import pages.PageObjectManager;
import pages.SamplesListPage;
import utils.TestContextSetup;

public class NativeViewSteps {
    TestContextSetup testContextSetup;
    PageObjectManager pageObjectManager;
    public NativeViewSteps(TestContextSetup testContextSetup) {
        this.testContextSetup=testContextSetup;
    }

    @Given("Native View button is displayed")
    public void native_view_button_is_displayed() {
        SamplesListPage samplesListPage = testContextSetup.pageObjectManager.getSamplesListPage();

        samplesListPage.checkNativeViewButton();
    }
    @When("User clicks the Native View button")
    public void user_clicks_the_native_view_button() {
        SamplesListPage samplesListPage = testContextSetup.pageObjectManager.getSamplesListPage();

        samplesListPage.clickNativeViewButton();
    }
    @Then("View one is displayed")
    public void view_one_is_displayed() {
        NativeViewPage nativeViewPage = testContextSetup.pageObjectManager.getNativeViewPage();

        nativeViewPage.checkViewOne();
    }
    @Then("View two is displayed")
    public void view_two_is_displayed() {
        NativeViewPage nativeViewPage = testContextSetup.pageObjectManager.getNativeViewPage();

        nativeViewPage.checkViewTwo();
    }
    @Then("View tree is displayed")
    public void view_tree_is_displayed() {
        NativeViewPage nativeViewPage = testContextSetup.pageObjectManager.getNativeViewPage();

        nativeViewPage.checkViewTree();
    }
}
