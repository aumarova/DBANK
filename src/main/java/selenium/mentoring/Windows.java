package selenium.mentoring;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Windows {

    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

        @Test
        public void testWindowHandle () {
            driver.get("https://demoqa.com/browser-windows");
            driver.findElement(By.id("windowButton")).click();

            // Click on the new window element and read the text displayed on the window
            WebElement text = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));

            // Fetching the text using method and printing it
            System.out.println("Element found using text: " + text.getText());
            driver.quit();

        }
    }
