package utils;

import cucumber.api.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {
    static WebDriver driver;

    private static final Logger LOGGER = LogManager.getLogger(Driver.class);
    // we want our framework to be able to run all the tests that we have created on browser
    // we want to make sure new Driver initialized only if it's not been initialized already
    public static WebDriver getDriver()  {

        // We have to make sure the whole framework is using the same exact web browser window
        if (driver == null) {
            switch (ConfigReader.getProperty("dbank.browser").toLowerCase()) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "safari":
                    driver = new SafariDriver();
                    break;
                case "ie":
                    WebDriverManager.iedriver().setup();
                    driver = new InternetExplorerDriver();
                    break;
                case "saucelabs":
                    String platform = ConfigReader.getProperty("dbank.suacelabces.platform");//will be getting from System.getProperty
                    String browser = ConfigReader.getProperty("dbank.dsaucelabs.browser");
                    String browserVersion =ConfigReader.getProperty("dbank.dsaucelabs.browser.version");
                    driver = loadSauceLabs(platform,browser,browserVersion);
                    break;

                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
            }
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
           // driver.manage().window().maximize();
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    public static void takeScreenshot() throws IOException {

        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File abc = new File("src/test/resources/firstSeleniumScreenshot.png");


        FileUtils.copyFile(screenshotFile, abc);
    }

    public static void takeScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            //taking the screenshot and saving it in byte arrays
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

            scenario.embed(screenshot, "image/png");


        }
    }
    private static WebDriver loadSauceLabs(String platform, String browserType, String browserVersion) {

        String USERNAME = ConfigReader.getProperty("dbank.saucelabs.username");
        String ACCESS_KEY ="57d150b2-e8ee-4632-9763-dc6271e29dfa";
        String HOST = ConfigReader.getProperty("dbank.dsaucelabs.host");


        // set up url to the hub which is running on saucelabs VM

        String url ="https://" + USERNAME + ":" + ACCESS_KEY + "@" + HOST;

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", platform);
        capabilities.setCapability("browserName", browserType);
        capabilities.setCapability("browserVersion", browserVersion);

        WebDriver driver = null;
        try {
            driver = new RemoteWebDriver(new URL(url), capabilities);
        }
        catch(MalformedURLException e) {
            e.printStackTrace();
        }
        return driver;
    }
}

