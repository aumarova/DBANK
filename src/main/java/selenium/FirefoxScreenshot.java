package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class FirefoxScreenshot {

    WebDriver driver;

    @Before
    public void setUp() {

        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    }
    @Test
    public void takeScreenshotBank() throws IOException {

        driver.get("http://3.131.35.165:8080/bank/login");
        driver.findElement(By.id("username")).sendKeys("tcruise@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Tomtom1234");
        driver.findElement(By.id("submit")).click();

        File sf = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(sf, new File("selenium/image3.png"));

        driver.findElement(By.linkText("Logout")).click();
        driver.close();
    }
    @Test
    public void window(){
        driver.get("https://www.amazon.com/");
        String mainPage = driver.getWindowHandle();
        System.out.println("main page: " + mainPage);
        driver.close();


    }
}
