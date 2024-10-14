package stepDefinition;

import ddt_config.DataReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import util.Common;
import util.TestContextSetup;

public class MyStepdefs {
    TestContextSetup tcs;
    public MyStepdefs(TestContextSetup tcs){
        this.tcs=tcs;
    }
    @Given("Given Scenario")
    public void givenScenario(DataReader dataReader) {
        String row1Value = Common.dataExtractorFromSheet(dataReader, "HeadingName1");
        System.out.println("Given - :"+row1Value);

    }

    @When("When Scenario")
    public void whenScenario() {
    }

    @And("And Scenario")
    public void andScenario() {
    }

    @Then("Then Scenario")
    public void thenScenario(DataReader dataReader) {
        String row1Value = Common.dataExtractorFromSheet(dataReader, "HeadingName1");
        System.out.println("Then - :"+row1Value);
        Assert.assertTrue(true);
    }

}
