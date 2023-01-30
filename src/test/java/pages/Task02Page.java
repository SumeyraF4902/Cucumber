package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Task02Page {
    public Task02Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(name="q")
    private WebElement searchText;

    public void searchKey(String key){
        searchText.sendKeys(key+ Keys.ENTER);

    }
}
