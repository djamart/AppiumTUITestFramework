package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.NativeViewPage;
import pages.PageObjectManager;
import pages.SamplesListPage;
import utils.TestContextSetup;

public class SliderSteps {
    TestContextSetup testContextSetup;
    PageObjectManager pageObjectManager;
    public SliderSteps(TestContextSetup testContextSetup) {
        this.testContextSetup=testContextSetup;
    }


    @Given("Slider button is displayed")
    public void slider_button_is_displayed() {

    }
    @When("User clicks the Slider button")
    public void user_clicks_the_slider_button() {

    }
    @Then("Slider page is displayed")
    public void slider_page_is_displayed() {

    }
    @Then("User can slide to the right")
    public void user_can_slide_to_the_right() {

    }
    @Then("User can slide to the left")
    public void user_can_slide_to_the_left() {

    }
}
