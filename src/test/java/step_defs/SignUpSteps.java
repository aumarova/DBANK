package step_defs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pojo.SignUpDataContainer;
import pojo.User;
import utils.ConfigReader;
import utils.Driver;
import static org.junit.Assert.assertEquals;


public class SignUpSteps {

    WebDriver driver = Driver.getDriver();


    @Given("^user is on Sign Up page$")
    public void user_is_on_Sign_Up_page() {
        driver.get(ConfigReader.getProperty("dbank.env.signup"));

    }

    @When("^user inputs valid credentials$")
    public void user_inputs_valid_credentials()  {

        User user = SignUpDataContainer.generate();
        Select titleSelect = new Select(driver.findElement(By.id("title")));
        titleSelect.selectByValue(user.getTitle());

        driver.findElement(By.id("firstName")).sendKeys(user.getFirstName());
        driver.findElement(By.id("lastName")).sendKeys(SignUpDataContainer.generateLastName());
        driver.findElement(By.xpath("//input[@value='"+SignUpDataContainer.generateGender()+"']")).click();
        driver.findElement(By.id("dob")).sendKeys(SignUpDataContainer.generateDob());
        driver.findElement(By.id("ssn")).sendKeys(SignUpDataContainer.generateSsn());
        driver.findElement(By.id("emailAddress")).sendKeys(SignUpDataContainer.generateEmail());

        driver.findElement(By.id("password")).sendKeys(user.getPassword());

        driver.findElement(By.id("confirmPassword")).sendKeys(user.getConfirmPassword());
        driver.findElement(By.xpath("//*[contains(text(), 'Next')]")).click();
        driver.findElement(By.id("address")).sendKeys(SignUpDataContainer.generateAddress());
        driver.findElement(By.id("locality")).sendKeys(SignUpDataContainer.generateCity());
        driver.findElement(By.id("region")).sendKeys(SignUpDataContainer.generateState());
        driver.findElement(By.id("postalCode")).sendKeys(SignUpDataContainer.generateZip());
        driver.findElement(By.id("country")).sendKeys(SignUpDataContainer.generateCountry());
        driver.findElement(By.id("homePhone")).sendKeys(SignUpDataContainer.generateHomePhone());
        driver.findElement(By.id("mobilePhone")).sendKeys(SignUpDataContainer.generateMobilePhone());
        driver.findElement(By.id("workPhone")).sendKeys(SignUpDataContainer.generateWorkPhone());
        driver.findElement(By.id("agree-terms")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();



    }

    @Then("^user successfully registered$")
    public void user_successfully_registered() {
    String actualSuccess = driver.findElement(By.xpath("//div/span[@class='badge badge-pill badge-success']")).getText();
    assertEquals( "Success", actualSuccess);
    driver.close();
    }

    @Given("^User is on Sign Up page$")
    public void User_is_on_Sign_Up_page()  {
        driver.get(ConfigReader.getProperty("dbank.env.signup"));
    }
    @When("^User inputs invalid credentials$")
    public void user_inputs_invalid_credentials()  {
        Select titleSelect = new Select(driver.findElement(By.id("title")));
        titleSelect.selectByVisibleText("Mr.");
        driver.findElement(By.id("firstName")).sendKeys("I");
        driver.findElement(By.id("lastName")).sendKeys("B");
        driver.findElement(By.xpath("//input[@value='M']")).click();
        driver.findElement(By.id("dob")).sendKeys("00/00/1919");
        driver.findElement(By.id("ssn")).sendKeys("000997777");
        driver.findElement(By.id("emailAddress")).sendKeys("mail@j.com");
        driver.findElement(By.id("password")).sendKeys("Pass123");
        driver.findElement(By.id("confirmPassword")).sendKeys("Pass123");
        driver.findElement(By.xpath("//*[contains(text(), 'Next')]")).click();

      //  driver.close();

    }

    @Then("^User gets error message$")
    public void user_gets_error_message(){

    }




}