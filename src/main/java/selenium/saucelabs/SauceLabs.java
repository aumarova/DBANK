package selenium.saucelabs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class SauceLabs {

    public static void main(String[] args) throws MalformedURLException {

       // WebDriverManager.chromedriver().setup();
        // How to use suacelabs?
        // 1. get username and password

        String USERNAME = "oauth-aizadaumarova-6e131";
        String ACCESS_KEY ="57d150b2-e8ee-4632-9763-dc6271e29dfa";


        // set up url to the hub which is running on saucelabs VM

        String url ="https://oauth-aizadaumarova-6e131:57d150b2-e8ee-4632-9763-dc6271e29dfa@ondemand.us-west-1.saucelabs.com:443/wd/hub";

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", Platform.WIN10);
        capabilities.setCapability("browserName", BrowserType.FIREFOX);
        capabilities.setCapability("browserVersion", "latest");

        WebDriver driver = new RemoteWebDriver(new URL(url), capabilities);
        driver.get("https://www.amazon.com/");

        WebElement searchBox = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        searchBox.sendKeys("Iphone" + Keys.ENTER);
        WebElement appleBrand = driver.findElement(By.cssSelector("li[id='p_89/Apple']"));

        System.out.println(appleBrand.getText());
        driver.close();

    }
}
