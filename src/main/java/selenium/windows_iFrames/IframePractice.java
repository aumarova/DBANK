package selenium.windows_iFrames;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframePractice {

    WebDriver driver;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void test1() {
        // to locate elements inside the iFrame we have to switch the driver to that iFrame
        driver.get("https://www.demoqa.com/frames");
        WebElement iFrame1 = driver.findElement(By.id("frame1"));

        driver.switchTo().frame(iFrame1);

        WebElement iframeHeader = driver.findElement(By.id("sampleHeading"));
        System.out.println(iframeHeader.getText());

        // to switch back to the main content call switch to default
        driver.switchTo().defaultContent();
        WebElement framesText = driver.findElement(By.xpath("//div[text()='Frames']"));
        System.out.println(framesText.getText());


        // how do you work with iframes
        // how to switch back to main page
    }

    @Test
    public void test2() {
        driver.get("https://www.demoqa.com/frames");
        driver.switchTo().frame(2);
        String text = driver.findElement(By.xpath("//h1")).getText();
        System.out.println(text);

    }

    @Test
    public void test3() {
        driver.get("https://www.demoqa.com/frames");
        driver.switchTo().frame("iFrame1");

    }
}