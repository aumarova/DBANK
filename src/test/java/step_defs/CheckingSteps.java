package step_defs;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.DepositPage;
import pages.NewCheckingAccountPage;
import pojo.NewCheckingDataContainer;
import utils.BankingAccount;
import utils.Driver;
import java.net.MalformedURLException;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CheckingSteps {
    WebDriver driver = Driver.getDriver();
    DepositPage deposit = new DepositPage(driver);
    NewCheckingAccountPage newCheckingAccountPage = new NewCheckingAccountPage();

    public CheckingSteps() throws MalformedURLException {
    }


    @Then("^Verify that \"([^\"]*)\" welcoming message is displayed$")
    public void verify_that_welcoming_message_is_displayed(String expectedWelcomeMessage) {

        WebElement welcomeMessage = driver.findElement(By.xpath("//li[contains(text(),'Welcome')]"));
        assertTrue("Welcome Message is not displayed", welcomeMessage.isDisplayed());
        assertEquals("Welcome Message mismatch", expectedWelcomeMessage, welcomeMessage.getText());

    }


    @Then("^Verify that home page panel with account info is displayed$")
    public void verify_that_home_page_panel_with_account_info_is_displayed() throws Throwable {
        newCheckingAccountPage.validateAllMenuItemsAreDisplayed();
    }


    @Given("^User clicks on new \"([^\"]*)\" account$")
    public void user_clicks_on_new_account(String arg1) throws Throwable {
        newCheckingAccountPage.checkingMenu.click();
        newCheckingAccountPage.newCheckingAccount.click();
    }

    @When("^User creates Checking account with the following info$")
    public void user_creates_Checking_account_with_the_following_info(List<NewCheckingDataContainer> checkingDataList) {
        NewCheckingDataContainer data = checkingDataList.get(0);
        newCheckingAccountPage.createNewCheckingAccount(data.getAccountType(), data.getAccountOwnership(), data.getAccountName(), data.getInitialDeposit());
    }

    @Then("^verify newly created account information contains$")
    public void verifyNewlyCreatedAccountInformationContains(List<NewCheckingDataContainer> checkingDataList) {


    }

    @Then("^The validation message \"([^\"]*)\" should appear$")
    public void the_validation_message_should_appear(String expectedValidationMessage) {
        String actualMessage = driver.switchTo().activeElement().getAttribute("validationMessage");
        assertEquals("Validation message is wrong!", expectedValidationMessage, actualMessage);
    }


    @Then("^Verify that \"([^\"]*)\" dropdown has following options$")
    public void verify_that_dropdown_has_following_options(String accountType, List<String> views) {

        if (accountType.equalsIgnoreCase(BankingAccount.CHECKING)) {
            newCheckingAccountPage.checkingMenu.click();
            newCheckingAccountPage.validateTheCheckingMenuList(views);
        }

    }

    @And("^User clicks on   new \"([^\"]*)\" account$")
    public void userClicksOnNewAccount(String arg0) throws Throwable {
        newCheckingAccountPage.checkingMenu.click();

    }


    @When("^User submits checking account with \"([^\"]*)\" deposit$")
    public void userSubmitsCheckingAccountWithDeposit(String amount) throws Throwable {
        deposit.depositMenu.click();


    }

    @Then("^Verify field error message \"([^\"]*)\" is displayed$")
    public void verify_field_error_message_is_displayed(String errorMessage) {
        String actualMessage = driver.switchTo().activeElement().getAttribute("validationMessage");
        assertEquals("Please select an item in the list.", errorMessage, actualMessage);
        String actualMessage2 = driver.switchTo().activeElement().getAttribute("validationMessage");
        assertEquals("Please fill out this field.", errorMessage, actualMessage2);

    }


    @And("^User clicks on \"([^\"]*)\" account$")
    public void userClicksOnAccount(String arg0) throws Throwable {
          deposit.depositMenu.click();
    }
}