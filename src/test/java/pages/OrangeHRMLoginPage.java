package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMLoginPage {//08_DataTable .feature clasıyla bagli


    WebDriver driver;

    public OrangeHRMLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy (name="username")
    WebElement txtUserName;

    @FindBy (name="password")
    WebElement txtPassword;

    @FindBy(xpath="//button[@type='submit']")
    WebElement btnLogin;

    @FindBy(className="oxd-alert-content-text")
    WebElement errMessage;

    public void typeUserName(String text){
        txtUserName.sendKeys(text);
    }
    public void typePassword(String text){
        txtPassword.sendKeys(text);
    }

    public void clickLogin(){
        btnLogin.click();
    }
    public void  loginAsAdmin(){
        typeUserName("Admin");
       typePassword("admin123");
        clickLogin();
    }
    public void verifyErrMessageContains(String message){
        Assert.assertTrue(errMessage.getText().contains(message));
    }}
