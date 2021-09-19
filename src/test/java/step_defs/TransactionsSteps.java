package step_defs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.*;
import pojo.DepositDataContainer;
import utils.Driver;

import java.net.MalformedURLException;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TransactionsSteps {
    WebDriver driver = Driver.getDriver();
    DepositPage deposit = new DepositPage(driver);
    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);
    WithdrawPage withdrawPage = new WithdrawPage(driver);
    NewCheckingAccountPage newCheckingAccountPage = new NewCheckingAccountPage();

    public TransactionsSteps() throws MalformedURLException {
    }

    @Given("^Verify that web title is \"([^\"]*)\"$")
    public void verify_that_web_title_is(String arg1) throws Throwable {
        assertEquals("Login page title mismatch", "Digital Bank", driver.getTitle());
    }

    @When("^User logs in with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_logs_in_with_and(String username, String password) throws Throwable {
        loginPage.login(username, password);
    }

    @Then("^User successfully logged in to home page$")
    public void user_successfully_logged_in_to_home_page() throws Throwable {
        String actualPage = homePage.homeMenu.getText();
        assertEquals("Home", actualPage); // "Home"
    }

    @Given("^User navigates to Deposit page$")
    public void user_navigates_to_Deposit_page() throws Throwable {
        deposit.depositMenu.click();

    }

    @When("^User submits a deposit with the following info$")
    public void userSubmitsADepositWithTheFollowingInfo(List<DepositDataContainer> list) {
        DepositDataContainer data = list.get(0);

        deposit.depositMoneyToAccount(data.getAccountName(), data.getAmount());

    }

    @Then("^Verify alert error message \"([^\"]*)\" is displayed$")
    public void verifyAlertErrorMessageIsDisplayed(String errorMsg) throws Throwable {
        String actualMessage = deposit.errorMessage.getText().trim().replaceAll("[^a-zA-Z0-9' .()$]", "");
        assertEquals("Initial deposit error message is wrong!", errorMsg, actualMessage);
        String actualMsg = withdrawPage.errorMessageWithdraw.getText().trim().replaceAll("[^a-zA-Z0-9' .()$]", "");
        assertEquals("Withdraw with 0 error message is wrong", errorMsg, actualMsg);
    }

    @Then("^Verify that deposit amount has been applied with the following$")
    public void verifyThatDepositAmountHasBeenAppliedWithTheFollowing() {
        newCheckingAccountPage.checkingMenu.click();
        newCheckingAccountPage.viewChecking.click();
        deposit.verifyAmountApplied();


    }


}


