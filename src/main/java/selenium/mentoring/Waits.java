package selenium.mentoring;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class Waits {

    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Test
    public void testImplicit() {

        // Implicit Wait -> informing selenium web driver to wait for specific amount of time and if the web element
        // is not visible after waiting for that specific point then throw "No such Element found Exception".
        driver.get("http://qaautomated.blogspot.in");

        // method implicitlywait() accepts 2 parameters: 1) time value 2) time unit like days, hours, minutes, seconds, milliseconds
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.quit();
    }

    @Test
    public void testExplicit() {
        // Explicit wait is a concept of the dynamic wait which wait dynamically for specific conditions. It can be implemented by WebDriverWait class.

        driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");

        driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();

        // syntax:
        WebDriverWait wait = new WebDriverWait(driver, 20);
        // condition is - element "about me" is visible
        // ExpectedConditions is a class in Selenium which has some predefined condition which makes our task easy.
        //
        WebElement element = wait
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));

        // if element found then we will use isDisplayed method
        boolean status = element.isDisplayed();

        // if else condition
        if (status) {
            System.out.println("===== WebDriver is visible======");
        } else {
            System.out.println("===== WebDriver is not visible======");
        }

        driver.quit();
    }

    @Test
    public void fluentWait() {


        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)


                // Max time for wait- If conditions are not met within this time frame then it will fail
                .withTimeout(60, TimeUnit.SECONDS)

                // It should poll webelement after every single second
                .pollingEvery(2, TimeUnit.SECONDS)

                //Specify what exceptions to ignore
                .ignoring(NoSuchElementException.class);

        driver.get("http://softwaretestingplace.blogspot.com/2017/02/selenium-fluent-wait.html");
        driver.findElement(By.xpath("//*[@id='post-body-5280210221385817166']/div[1]/button")).click();


        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                WebElement element = driver.findElement(By.xpath("//*[@id='softwareTestingMaterial']"));
                String getTextOnPage = element.getText();
                if (getTextOnPage.equals("Software Testing Material - DEMO PAGE")) {
                    System.out.println(getTextOnPage);
                    return element;
                } else {
                    System.out.println("FluentWait Failed");
                    return null;
                }
            }
        });
    }



}


