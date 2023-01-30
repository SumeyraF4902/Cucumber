package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.GoogleSearchPage;
import utilities.Driver;

public class ParameterizedStepsDefinition {//parameterizedstepsfeatureye bagli
    @When("Kullanici  {string} arattiginda")
    public void kullaniciArattiginda(String key) {

        GoogleSearchPage sp=new GoogleSearchPage(Driver.getDriver());
        sp.searchFor(key);

    }

    @Then("Kullanici tittle de {string} gormelidir")
    public void kullaniciTittleDeGormelidir(String key) {

        Assert.assertTrue(Driver.getDriver().getTitle().contains(key));
        Driver.closeDriver();
    }
}
