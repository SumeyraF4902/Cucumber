package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Task01Page {
    private WebDriver driver;
    public Task01Page(WebDriver driver) {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(name="q")
    private WebElement searchText;

   public void searchWord(String value){
       searchText.sendKeys(value+ Keys.ENTER);
   }
}
