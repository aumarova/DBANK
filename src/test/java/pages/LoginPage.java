package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.XMLFormatter;

public class LoginPage {

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "username")
   public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "submit")
    public WebElement signInButton;

    @FindBy(xpath = "//div[contains(@class,'alert-dismissible')]")
    public  WebElement loginErrorMessage;

    public void login(String usernameInput, String passwordInput){
        username.sendKeys(usernameInput);
        password.sendKeys(passwordInput);
        signInButton.click();
    }
}
