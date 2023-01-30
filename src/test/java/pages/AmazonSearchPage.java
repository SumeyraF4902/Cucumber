package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
// amazonda ikinci sayfada calisacagımız icin ikinci sayfayi olusturduk
public class AmazonSearchPage {  // feature klosorunde 06 ya bagli olarak calisir
    public WebDriver driver;

    public AmazonSearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy (className="s-breadcrumb")
        private WebElement resulText;

    public void  validaResultTextHasKey(String key){
        Assert.assertTrue(resulText.getText().contains(key));
    }
}
