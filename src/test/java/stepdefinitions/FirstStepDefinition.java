package stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class FirstStepDefinition {

    @Given("Ilk feature icin cucumber indirdim")
    public void ılk_feature_icin_cucumber_indirdim() {
        System.out.println("Given step i calisti");
    }
    @When("Senaryomu calıstırdigimda")
    public void senaryomu_calıstırdigimda() {
        System.out.println("When step i calisti");
    }
    @Then("Senaryomun calıstıgını konsolda gormeliyim")
    public void senaryomun_calıstıgını_konsolda_gormeliyim() {
        System.out.println("Then step i calisti");
    }



}
