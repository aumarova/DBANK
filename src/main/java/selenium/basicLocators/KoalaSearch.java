package selenium.basicLocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KoalaSearch {


    static WebDriver driver;

    @BeforeClass
    public static void setUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Before
    public void goToHomePage() {

        driver.get("http://google.com");
    }

    @AfterClass
    public static void tearDown() {
        driver.close();
    }

    @Test
    public void findById() {

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("koala");
        WebElement googleSearchButton = driver.findElement(By.name("btnK"));
        googleSearchButton.click();
        System.out.println(driver.getCurrentUrl());





    }
}

