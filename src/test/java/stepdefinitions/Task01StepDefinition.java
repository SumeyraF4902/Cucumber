package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Task01Page;
import utilities.Driver;

public class Task01StepDefinition {
    @Given("Kullanici google sayfasina gider")
    public void kullaniciGoogleSayfasinaGider() {
        Driver.getDriver().get("https://www.google.com/");
    }

    @When("Kullanici cucumber kelimesini arar")
    public void kullaniciCucumberKelimesiniArar() {
        Task01Page tp=new Task01Page(Driver.getDriver());
        tp.searchWord("cucumber");
    }

    @Then("Kullanici sayfada cucumber kelimesi gectigini dogrular")
    public void kullaniciSayfadaCucumberKelimesiGectiginiDogrular() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("cucumber"));
        Driver.closeDriver();

    }
}
