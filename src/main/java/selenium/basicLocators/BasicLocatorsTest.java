package selenium.basicLocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocatorsTest {

    static WebDriver driver;

    @BeforeClass
    public static void setUp(){
        // Why we need bonigarcia?
        // Webdrivermanager helps to download binanries/executables in an automated way. It supports browsers such
        // as Chrome, Firefox, Opera, PhantomJS, Microsoft Edge, or Internet Explorer. We just need to add its dependency
        // through Maven or Gradle to download all the necessary drivers.
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Before
    public void goToHomePage(){

        driver.get("http://google.com");
    }

    @AfterClass
    public static void tearDown(){
        driver.close();
    }


    @Test
    public void findById() {
        // instead of System.setProperty(

        // findElement method looks for element in the page source
        WebElement feelingLuckyButton = driver.findElement(By.id("gbqfbb"));

        //getText()
        Assert.assertEquals("Wrong text value on FeelingLucky Button", "I'm Feeling Lucky", feelingLuckyButton.getAttribute("value"));

        //getAttribute()

    }

    @Test
    public void findByName() {


        // findElement method looks for element in the page source
        WebElement searchButton = driver.findElement(By.name("btnK"));
        Assert.assertEquals("Wrong text value on Search Button", "Google Search", searchButton.getAttribute("value"));


    }

    @Test
    public void findByLink() {
        //when trying to find element when there is a link

        System.out.println("Starting fins By Link Text");
        // a href = "https://devxschool.com/">school</a>

        System.out.println("Finished setting up ChromeDriver");

        System.out.println("navigated to google.com");

        WebElement gmailLink = driver.findElement(By.linkText("Gmail"));
        System.out.println("Located Gmail Link");

        Assert.assertEquals("Gmail", gmailLink.getText());
        System.out.println("Assertion for link text passed");

        gmailLink.click();
        System.out.println("Clicked on gmail link");

        System.out.println(driver.getCurrentUrl()); // -> https://www.google.com/gmail/about/#

        Assert.assertEquals("Gmail link on google.com is not taking to the right page",
                "https://www.google.com/gmail/about/#", driver.getCurrentUrl());

    }
    @Test
    public void partialLintText(){

        WebElement howSearchWorks = driver.findElement(By.partialLinkText("How Search"));
        howSearchWorks.click();

        Assert.assertEquals("Google Search - Discover How Google Search Works",driver.getTitle());


    }
    @Test
    public void className(){
        // When using className make sure you have it's  unique name

        WebElement youTubeShorts = driver.findElement(By.className("NKcBbd"));
        youTubeShorts.click();
        Assert.assertEquals("Introducing the shorter side of YouTube - YouTube", driver.getTitle());
    }
    // use get() at the beginning, use navigate() in the middle

}

