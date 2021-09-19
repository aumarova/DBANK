package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ScreenshotHandle {

    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    }

    @Test
    public void takeScreenshot() throws IOException {
        driver.get("https://www.amazon.com/");

        System.out.println(driver.getTitle());
        System.out.println(driver.getWindowHandle());

        //we typecast it because WebDriver interface and TakeScreenshot interface are different variables, so
        // TakScreenshot variable can not hold WebDriver instance
        //If ChromeDriver driver = new ChromeDriver() then no casting is necessary
        //TakesScreenshot
        //TakesScreenshot is the public interface that provides a method getScreenshotAs() to capture the screenshot and
        // store it in the specified location and implements the following classes:
        //
        //FirefoxDriver
        //ChromeDriver
        //InternetExplorerDriver
        //EdgeDriver
        //OperaDriver
        //SafariDriver
        //EventFiringWebDriver
        //RemoteWebDriver
        //RemoteWebElement

        //driver that can capture a screenshot and store it and is achieved by casting the driver instance into
        // TakesScreenshot type instance.


        //OutputType has 3 types: BASE64, BYTES, FILE
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        //Now we can use this File object to copy the image at our desired location,
        // as shown below, using the FileUtils Class.
        FileUtils.copyFile(screenshotFile , new File("selenium/image1.png"));

        WebElement searchBox = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        searchBox.sendKeys("Iphone" + Keys.ENTER);

        File screenshotFile2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile2 , new File("selenium/image2.png"));

        driver.close();


    }

}