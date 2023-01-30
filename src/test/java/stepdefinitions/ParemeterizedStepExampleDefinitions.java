package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ParemeterizedStepExampleDefinitions {

//Cucumber Edition
    private static int int1, int2, sonuc;

    @Given("ilk sayi {int}")
    public void ilkSayi(int sayi1) {
        int1 = sayi1;
        System.out.println("int1 = " + int1);
    }


    @And("ikinci sayi {int}")
    public void ikinciSayi(int sayi2) {
        int2 = sayi2;
        System.out.println("int2 = " + int2);
    }

    @When("Bu sayilari {word} operatorune sokarsam")
    public void buSayilariOperatoruneSokarsam(String operator) {
        switch (operator) {
            case "+":
                sonuc = int1 + int2;
                break;
            case "-":
                sonuc = int1 - int2;
                break;
            case "*":
                sonuc = int1 * int2;
                break;
            case "/":
                sonuc = int1 / int2;
                break;

        }
        System.out.println("sonuc = " + sonuc);
    }


    @Then("sonuc {int} olmalidir")
    public void sonucOlmadir(int sayi) {

        Assert.assertEquals(sayi, sonuc);
    }


    @Then("sonuc <sonuc> olmalidir")
    public void sonucSonucOlmadir(int sayi) {
        Assert.assertEquals(sayi, sonuc);
    }

    //RegEx Edition



    /*@Given("^Ismim\"(\\w+)\"$")
    public void ismim(String isim) {
        System.out.println(isim);
    }
*/
    @Given("Ismim {string}")
    public void ısmim(String isim) {
        System.out.println(isim);
    }
}