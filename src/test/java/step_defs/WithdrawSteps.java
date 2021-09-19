package step_defs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pages.WithdrawPage;
import pojo.WithdrawDataContainer;
import utils.Driver;

import java.util.List;

public class WithdrawSteps {

    WebDriver driver = Driver.getDriver();
    WithdrawPage withdrawPage = new WithdrawPage(driver);

    @Given("^User navigates to Withdraw page$")
    public void userNavigatesToWithdrawPage() {
        withdrawPage.withdraw.click();
    }

    @When("^User User submits a withdraw with following information$")
    public void userUserSubmitsAWithdrawWithFollowingInformation(List<WithdrawDataContainer> list) {
        WithdrawDataContainer data = list.get(0);
        withdrawPage.withdrawMoney(data.getAccount(), data.getAmount());
    }


    @And("^User selects withdraw account as \"([^\"]*)\"$")
    public void userSelectsWithdrawAccountAs(String account) throws Throwable {
        Select dropdown = new Select(withdrawPage.selectAccountWithdraw);
        dropdown.selectByVisibleText(account);


    }

    @When("^User submits a withdraw with \"([^\"]*)\" amount$")
    public void userSubmitsAWithdrawWithAmount(String amount) throws Throwable {
        withdrawPage.withdrawAmount.sendKeys(amount);
        withdrawPage.submitWithdraw.click();
    }

    @Then("^Verify that withdraw amount has been applied$")
    public void verifyThatWithdrawAmountHasBeenApplied() {


    }


}
