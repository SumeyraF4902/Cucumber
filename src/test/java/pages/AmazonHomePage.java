package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AmazonHomePage {

private WebDriver driver;

    public AmazonHomePage(WebDriver driver) {// feature klosorunde 06 ya bagli olarak calisir
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="twotabsearchtextbox")//arama kutusu
    private WebElement searchbox;

    @FindBy(id="nav-search-submit-button")//arama butonu
    private WebElement searchButton;

    public void searchKeyHitEnter(String key){// arama yapacak methot
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(searchbox));//serchbox elementinin gorunur olmasina kadar bekle demek

        searchbox.sendKeys(key+ Keys.ENTER);
    }
    public void searchKey(String key){//arama kutunun entere basılmadan yatik altinaki methoda da butonu clickle dedik
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(searchbox));
        searchbox.sendKeys(key);
    }
    public void clickSerachButton(){//arama butununu tikla dedik
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(searchButton)).click();
    }}
