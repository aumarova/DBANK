package selenium.advancedMouseInteractions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class PracticeActions {

    WebDriver driver;

    @Before
    public void setUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        // driver.manage().window().maximize();
    }

    @Test
    public void test1() {

        driver.navigate().to("https://demoqa.com/buttons");
        WebElement doubleClickBtn = driver.findElement(By.id("doubleClickBtn"));
        WebElement rightClickBtn = driver.findElement(By.id("rightClickBtn"));
        WebElement clickMeButton = driver.findElement(By.xpath("//button[text()='Click Me']"));


        Actions actions = new Actions(driver);
        actions.doubleClick(doubleClickBtn).perform(); // always end it with perform()
        actions.contextClick(rightClickBtn).click(clickMeButton).perform();


    }

    @Test
    public void hoverOver() {

        driver.navigate().to("https://demoqa.com/tool-tips");

        WebElement element = driver.findElement(By.id("toolTipButton"));
        //  WebElement textbox = driver.findElement(By.id("toolTipTextField"));

        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();

        //   actions.moveToElement(textbox).perform();

        WebElement toolTip = driver.findElement(By.id("buttonToolTip"));
        Assert.assertTrue(toolTip.isDisplayed());

        Assert.assertEquals("You hovered over the Button", toolTip.getText());

    }

    @Test
    public void slider() {
        driver.navigate().to("https://demoqa.com/slider");

        WebElement slider = driver.findElement(By.xpath("/input[@class='range-slider range-slider--primary']"));

        Actions actions = new Actions(driver);
        actions.clickAndHold(slider).moveByOffset(-2, 0).release().perform();


    }

    @Test
    public void droppable() {

        driver.navigate().to("https://demoqa.com/droppable");
        WebElement dragMe = driver.findElement(By.id("draggable"));
        WebElement droppableTarget = driver.findElement(By.id("droppable"));

        Actions actions = new Actions(driver);
        Point point = droppableTarget.getLocation();

        // actions.clickAndHold(dragMe).moveToElement(droppableTarget).perform();
        actions.clickAndHold().moveByOffset(240, 25).perform();


    }

    @Test
    public void progressBar() {

        driver.navigate().to("https://demoqa.com/progress-bar");

        WebElement start = driver.findElement(By.id("startStopButton"));
        start.click();

        WebElement progressBar = driver.findElement(By.xpath("//div[@role='progressbar']"));

        new WebDriverWait(driver, 15)
                .until(ExpectedConditions.attributeToBe(progressBar, "aria-valuenow", "100"));

        Assert.assertEquals("100%", progressBar.getText());
    }

    @Test
    public void dropDown() {

        driver.navigate().to("https://demoqa.com/menu#");
        WebElement mainItem2Button = driver.findElement(By.xpath("//a[text()='Main Item 2']"));
        // mainItem2Button.click();
        WebElement subList = driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']"));
        WebElement subItem = driver.findElement(By.xpath("//a[text()='Sub Sub Item 2']"));

        Actions actions = new Actions(driver);
        actions.clickAndHold(mainItem2Button).perform();
        actions.clickAndHold(subList).perform();
        actions.clickAndHold(subItem).perform();
        subItem.click();

    }
    @Test
    public void form() {
        driver.navigate().to("https://demoqa.com/automation-practice-form");
        WebElement firstNameInput = driver.findElement(By.id("firstName"));
//        WebElement lastNameInput = driver.findElement(By.id("lastName"));

        firstNameInput.sendKeys("John Doe");
        Actions actions  = new Actions(driver);
        actions.keyDown(Keys.COMMAND).sendKeys("a").keyUp(Keys.COMMAND).perform();
        actions.keyDown(Keys.COMMAND).sendKeys("c").keyUp(Keys.COMMAND).perform();

        actions.sendKeys(Keys.TAB).perform();
        actions.keyDown(Keys.COMMAND).sendKeys("v").keyUp(Keys.COMMAND).perform();
    }
}


