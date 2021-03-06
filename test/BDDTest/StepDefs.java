package BDDTest;

import cucumber.api.java.After;
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

    @When("^I search for \"(.*?)\"$")
    public void i_search_for(String searchValue) throws Throwable {
        script.searchForValue(searchValue);
    }

    @Then("^the page title is \"(.*?)\"$")
    public void the_page_title_is(String expectedTitle) throws Throwable {
        script.checkPageTitle(expectedTitle);
    }

    @After
    public void tearDown() throws Exception {
        tidyUp();
    }
}
