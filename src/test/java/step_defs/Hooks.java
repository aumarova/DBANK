package step_defs;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Driver;

import java.util.concurrent.TimeUnit;

public class Hooks {

    WebDriver driver = Driver.getDriver();


    @After
    public void tearDown(Scenario scenario) {
        driver.findElement(By.cssSelector("img[class=\"user-avatar rounded-circle\"]")).click();
        driver.findElement(By.xpath("//a[text()='Logout']")).click();

        Driver.takeScreenshot(scenario);
        Driver.closeDriver();
    }
}











