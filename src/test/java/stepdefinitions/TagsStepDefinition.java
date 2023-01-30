package stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TagsStepDefinition {// 01 tags feature bagli    tag runner e bagli
    @Given("Smoke test icin hazirliklar yapildi")
    public void smokeTestIcinHazirliklarYapildi() {
    }

    @When("Smoke test calistiginda")
    public void smokeTestCalistiginda() {
        System.out.println("Smoke test calisti");
    }

    @Then("Smoke test basarili olmali")
    public void smokeTestBasariliOlmali() {

    }
    @Given("Regression test icin hazirliklar yapildi")
    public void regressionTestIcinHazirliklarYapildi() {
    }

    @When("Regression test calistiginda")
    public void regressionTestCalistiginda() {
        System.out.println("Regression test calisti");
    }

    @Then("Regression test basarili olmali")
    public void regressionTestBasariliOlmali() {
    }
}
