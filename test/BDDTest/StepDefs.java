package BDDTest;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefs {
    private SeleniumTest script;

    public void setUpWebDriver() throws Exception {
        script = new SeleniumTest();
        script.setUp();
        script.goToHomePage();
    }

    public void tidyUp() {
        script.tearDown();
    }

    @Given("^I am on the homepage$")
    public void i_am_on_the_homepage() throws Throwable {
        setUpWebDriver();
    }

    @When("^I search for pillows$")
    public void i_search_for_pillows() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the page title is as expected$")
    public void the_page_title_is_as_expected() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
