package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AmazonHomePage;
import pages.AmazonSearchPage;
import utilities.Driver;

public class AmazonStepDefinitions {// feature klosorunde 06 ya bagli olarak calisir
    @Given("Kullanici amazon sitesine gider")
    public void kullaniciAmazonSitesineGider() {
        Driver.getDriver().get("https://www.amazon.com.tr/");
    }

    @When("Kullanici amazonda {string} aratir") //arama yapmak icin amazon  home page olusutrduk
    public void kullaniciAmazondaAratir(String arg0) {
       AmazonHomePage hp=new AmazonHomePage(Driver.getDriver());
        hp.searchKeyHitEnter(arg0);
        }

    @Then("Kullanici arama sonuclarinda {string} gormelidir")// burada farkli bir sayfa olusacagi, icin islem yapabilmek adına amazonsearhpage clasini acariz
    public void kullaniciAramaSonuclarindaGormelidir(String arg0) {

        AmazonSearchPage sp= new AmazonSearchPage(Driver.getDriver());

        sp.validaResultTextHasKey(arg0);
    }

    @And("Kullanici browseri kapatir")

    public void kullaniciBrowseriKapatir() {
        Driver.closeDriver();
    }
}
