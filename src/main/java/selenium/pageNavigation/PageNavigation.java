package selenium.pageNavigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PageNavigation {

    WebDriver driver;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        // give 30 seconds for the page to load
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); // do it once!

    }
    @Test
    public void pageNavigation(){
        driver.navigate().to("http://www.practiceselenium.com/");

        WebElement letsTalkButton = driver.findElement(By.xpath("//a[@href='let-s-talk-tea.html']"));
        letsTalkButton.click();

        letsTalkButton = driver.findElement(By.xpath("//a[@href='let-s-talk-tea.html']"));

        WebElement liElementOfA = driver.findElement(By.xpath("./..")); // to go parent

        Assert.assertEquals("active", liElementOfA.getAttribute("class"));

        driver.navigate().back();

      //  driver.navigate().forward();
      //  driver.navigate().refresh();

    }
    @Test
    public void waits() throws InterruptedException {
        Thread.sleep(10000); // hard sleep
        // this is not a good type wait, not every one is speed slow, do not use it
    }
}
