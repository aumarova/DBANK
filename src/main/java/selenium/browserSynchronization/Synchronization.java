package selenium.browserSynchronization;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Synchronization {

    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://www.etsy.com/");
        // implicit wait
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // for every browser
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); // for every browser
        driver.manage().window().maximize();

    }
    @Test
    public void singIn(){

        WebElement signInButton = driver.findElement(By.xpath("//button[contains(@class, 'select-signin')]"));
        signInButton.click();

        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, 3);

        //
        WebElement googleButton = wait.until((ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@data-google-button]"))));
        googleButton.click();

    }
    @Test
    public void visibleTest(){

        driver.get("https://demoqa.com/dynamic-properties");
        WebDriverWait wait = new WebDriverWait(driver, 1);
        WebElement button = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("visibleAfter")));
        button.click();
    }
    @Test
    public void test2(){
        driver.get("https://demoqa.com/dynamic-properties");
        WebDriverWait wait = new WebDriverWait(driver, 5);

        // wait until attribute contains
       wait.until(ExpectedConditions.attributeContains(By.id("colorChange"), "class", "text-danger"));
        WebElement colorChangeButton= driver.findElement(By.id("colorChange"));

        Assert.assertTrue(colorChangeButton.getAttribute("class").contains("text-danger"));
    }
}
