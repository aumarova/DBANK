package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DepositPage{

    public DepositPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "deposit-menu-item")
    public WebElement depositMenu;

    @FindBy(id = "selectedAccount")
    public WebElement selectAccountDropdown;

    @FindBy(id = "amount")
    public WebElement depositAmountTextBox;

    @FindBy(xpath = "//div//button[@class='btn btn-primary btn-sm']")
    public WebElement submitButtonDeposit;

    @FindBy(xpath = "//button[@type='reset']")
    public WebElement resetButtonDeposit;

    @FindBy(xpath = "//option[text()='ABC (Standard Checking)']")
    public WebElement ABCChecking;


    @FindBy(xpath = "//div[text()='ABC']")
    public WebElement ABCAccountName;

    @FindBy(xpath = "//div[contains(@class, 'alert-dismissible')]")
    public WebElement errorMessage;


    @FindBy(xpath = "//table[@id='transactionTable']//th")
    public List<WebElement> transactionColumns;

    @FindBy(xpath = "//table[@id='transactionTable']/tbody/tr[@role='row']/td[4]")
    public List<WebElement> lastDepositRow;

    @FindBy(id = "transactionTable")
    public WebElement webTable;

    @FindBy(tagName = "//table[@id='transactionTable']/tbody/tr[@role='row'][5]/td")
    List<WebElement> depositRow;

    @FindBy(tagName = "//table[@id='transactionTable']/tbody//tr//td")
    List<WebElement> webTableColumns;

    public void depositMoneyToAccount( String account, String amount) {

        Select dropdown = new Select(selectAccountDropdown);
        dropdown.selectByVisibleText(account);
        depositAmountTextBox.sendKeys(amount);
        submitButtonDeposit.click();

    }
    public void verifyAmountApplied(){

       int amountHeader = 0;
       for( WebElement element: webTableColumns){
           amountHeader++;
           if( element.getText().equalsIgnoreCase("amount")){
               break;

           }
       }
        int depositAmountIndex = 0;
       for(WebElement deposit: depositRow){
           depositAmountIndex++;
           if(depositAmountIndex == amountHeader){
               assertTrue("amount is not matching", deposit.getText().contains("amount"));
           }
       }



    }

}


