package BDDTest;

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
}
