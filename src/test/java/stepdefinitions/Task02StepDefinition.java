package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Task02Page;
import utilities.Driver;

public class Task02StepDefinition {
    @Given("Google sayfasına gidilir")
    public void googleSayfasınaGidilir() {
        Driver.getDriver().get("https://www.google.com/");
    }

    @When("Selenium kelimesini aratılır")
    public void seleniumKelimesiniAratılır() {
        Task02Page tp=new Task02Page();
        tp.searchKey("selenium");
    }

    @Then("Selenium kelimesinin geçtiğini title da doğrular")
    public void seleniumKelimesininGeçtiğiniTitleDaDoğrular() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("selenium"));
        Driver.closeDriver();
    }
}
