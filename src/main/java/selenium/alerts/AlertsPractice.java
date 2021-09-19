package selenium.alerts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsPractice {
    WebDriver driver;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void testSimpleAlert() throws InterruptedException {
        driver.get("https://www.demoqa.com/alerts");
        WebElement simpleAlertButton = driver.findElement(By.id("alertButton"));
        simpleAlertButton.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement confirmButton = driver.findElement(By.id("confirmButton"));
        confirmButton.click();
        Thread.sleep(3000);
        Alert alert2 = driver.switchTo().alert();
        alert2.accept();
    }
    @Test
    public void testSimpleAlert2(){
        driver.get("https://www.demoqa.com/alerts");
        WebElement confirmButton = driver.findElement(By.id("confirmButton"));
        confirmButton.click();

        Alert alert2 = driver.switchTo().alert();
        alert2.dismiss();

    }
    @Test
    public void testSimpleAlert3() throws InterruptedException {
        driver.get("https://www.demoqa.com/alerts");
        WebElement promptButton = driver.findElement(By.id("promptButton"));
        promptButton.click();

        Alert alert2 = driver.switchTo().alert();
        Thread.sleep(3000);
        alert2.sendKeys("Hi there");
        Thread.sleep(3000);
        alert2.accept();
    }
    @Test
    public void testSimpleAlert4(){
        driver.get("https://www.demoqa.com/alerts");
        WebElement timeAlertButton = driver.findElement(By.id("timeAlertButton"));
        timeAlertButton.click();

        WebDriverWait wait = new WebDriverWait(driver, 6);
        wait.until(ExpectedConditions.alertIsPresent());

        driver.switchTo().alert().accept();

    }

}
