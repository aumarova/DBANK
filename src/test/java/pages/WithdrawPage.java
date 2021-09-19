package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class WithdrawPage {

    public  WithdrawPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "withdraw-menu-item")
    public WebElement withdraw;

    @FindBy(id = "selectedAccount")
    public WebElement selectAccountWithdraw;

    @FindBy(id = "amount")
    public WebElement withdrawAmount;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm']")
    public WebElement submitWithdraw;

    @FindBy(xpath = "//button[@class='btn btn-danger btn-sm'']")
    public WebElement resetWithdraw;

    @FindBy(xpath = "//div[contains(@class, 'alert-dismissible')]")
    public WebElement errorMessageWithdraw;


    public void withdrawMoney(String account, String amount){

        Select dropdown = new Select(selectAccountWithdraw);
        dropdown.selectByVisibleText(account);
        withdrawAmount.sendKeys(amount);
        submitWithdraw.click();

    }

}
