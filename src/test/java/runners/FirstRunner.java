package runners;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ={ "src/test/resources/features/features/firstFeature.feature"},//icinde bulundugu dosya yolu
        glue = {"stepdefinitions"}//clasin ismini yazdik
)
public class FirstRunner {


    public static class TagsStepdefinition {
        @Given("Smoke test icin hazirliklar yapıldı")
        public void smokeTestIcinHazirliklarYapıldı() {
        }

        @When("Smoke test calistiginda")
        public void smokeTestCalistiginda() {
        }

        @Then("Smoke test basarili olmali")
        public void smokeTestBasariliOlmali() {
        }
    }
}
