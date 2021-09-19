package selenium.basicLocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoStore {

    //Go to https://demostore.x-cart.com/
    //validate if the paypal icon with text is display or not?
    //Go to https://demostore.x-cart.com/
    //Click on Fashion
    //

    static WebDriver driver;

    @BeforeClass // run once
    public static void setUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Before // runs every test
    public void goToHomePage() {

        driver.get("https://demostore.x-cart.com/");
    }

    @AfterClass
    public static void tearDown() {
        driver.close();
    }

    @Test
    public void getTitle(){
        String page_title = driver.getTitle();
        System.out.println("Page title is: " + driver.getTitle());
        Assert.assertTrue(page_title.contains("Catalog"));
    }

    @Test
    public void findByClass() {

        WebElement fashionButton = driver.findElement(By.linkText("Fashion"));
        fashionButton.click();

      //  Assert.assertEquals("Fashion", fashionButton.getText());

    }
    @Test
    public void isDisplayed(){

        WebElement payPalIcon = driver.findElement(By.className("header_paypal-icon"));

        if (payPalIcon.isDisplayed()) {
            System.out.println("Paypal icon is displayed");

        }
        System.out.println(payPalIcon.isEnabled());
    }
    @Test
    public void addFestivalBracelet(){

        WebElement fashionButton = driver.findElement(By.linkText("Fashion"));
        fashionButton.click();
        WebElement festivalBracelet = driver.findElement(By.linkText("Festival Braslet Pack in Gold Tone"));
        festivalBracelet.click();
//        WebElement addToCartButton = driver.findElement(By.className("btn  regular-button regular-main-button add2cart submit"));
//        addToCartButton.click();
    }

    @Test
    public void getCurrentUrl(){
        System.out.println(driver.getCurrentUrl()); // -> https://demostore.x-cart.com/

    }
}