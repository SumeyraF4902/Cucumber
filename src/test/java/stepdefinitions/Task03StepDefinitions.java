package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.time.Duration;

public class Task03StepDefinitions {
    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String arg0) {
        Driver.getDriver().get("https://www."+arg0+".com/");
    }

    @Then("kullanici {int} sn bekler")
    public void kullaniciSnBekler(int arg0) throws InterruptedException {
        Thread.sleep(arg0*1000);
    }

    @And("sayfa basliginin {string} icerdigini test eder")
    public void sayfaBasligininIcerdiginiTestEder(String arg0) {

        Assert.assertTrue(Driver.getDriver().getTitle().toLowerCase().contains(arg0));
    }

    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }
}
