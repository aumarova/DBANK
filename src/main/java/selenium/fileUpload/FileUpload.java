package selenium.fileUpload;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FileUpload {

    WebDriver driver;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    }
    @Test
    public void test1(){
        driver.get("https://demoqa.com/upload-download");

        WebElement fileUpload = driver.findElement(By.id("uploadFile"));

        fileUpload.sendKeys("/Users/aizadaumarova/Desktop/logo.png");

        WebElement label = driver.findElement(By.id("uploadedFilePath"));

        String actual = label.getText();

        Assert.assertEquals("C:\\fakepath\\logo.png", actual); // make sure we uploaded the right file

        Assert.assertTrue(label.isDisplayed());

    }
    @Test
    public void uploadToGoogle(){
        driver.get("https://images.google.com/");

        WebElement cameraIcon = driver.findElement(By.xpath("//div[@jscontroller='vCzgHd']"));

        cameraIcon.click();

        WebElement uploadImageButton = driver.findElement(By.xpath("//a[text()='Upload an image']"));

        uploadImageButton.click();

        WebElement chooseFileButton = driver.findElement(By.cssSelector("#awyMjb"));

        chooseFileButton.sendKeys("/Users/aizadaumarova/Desktop/logo.png");

        String actualRes = driver.getTitle();

        Assert.assertEquals("Google Search", actualRes);

    }
    /*  Homework:
        radio buttons with assertion
        enabled - disabled - isDisplayed


     */

}

