package selenium.advancedLocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HomeWork {
    static WebDriver driver;

    @BeforeClass
    public static void setup() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void byXpath() {
        driver.get("https://www.amazon.com/");

        WebElement searchBox = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        searchBox.sendKeys("Iphone" + Keys.ENTER);

        WebElement seeMoreButton = driver.findElement(By.xpath("//*[@id=\"brandsRefinements\"]/ul/li[8]/span/div/a/span"));
        seeMoreButton.click();

        List<WebElement> allBrands = driver.findElements(By.xpath("//li[starts-with(@id, 'p_89')]"));

        for (WebElement brand : allBrands) {
            System.out.println(brand.getText());
        }

        WebElement appleBrand = driver.findElement(By.cssSelector(" li[id='p_89/Apple']>*>*"));
        appleBrand.click();


    }

    //write a helper method which will help us validate Iphone search result details.

    //This method should accept a WebElement that is a Iphone div.

    //and expected results for price, Color, and Brand.


    @Test
    public void listFirstIphone() {
        driver.get("https://www.amazon.com/");

        WebElement searchBox = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        searchBox.sendKeys("Iphone" + Keys.ENTER);

        WebElement appleBrandLink = driver.findElement(By.cssSelector(" li[id='p_89/Apple']>*>*"));
        appleBrandLink.click();

        WebElement apple = driver.findElement(By.xpath("//div[@class='s-main-slot s-result-list s-search-results sg-row']/div[3]"));

        //validateIphones(apple, "899.99", "Silver", "Apple");

        WebElement price = apple.findElement(By.xpath("//span[@class='a-price']"));
        System.out.println(price.getText());

        WebElement color = apple.findElement(By.xpath("//span[text()='Yellow']"));
       System.out.println(color.getText());
//
//        WebElement brand = apple.findElement(By.xpath("//span[text()='Apple']"));
//        System.out.println(brand.getText());
//
//        Assert.assertEquals("Yellow", color.getText());

        // 3 assertions apple price color
//        Assert.assertEquals(firstIphoneListed.getAttribute(), firstIphoneListed.);

        // validateIphones(apple, "599.00", "Yellow", "Apple");
    }

    public static void validateIphones(WebElement webElement, String expectedPrice, String expectedColor, String expectedBrand) {
        Assert.assertEquals("Price should be $599.00", expectedPrice, driver.findElement(By.xpath("//span[@class='a-price']")));
//        Assert.assertEquals("Color must be Yellow", expectedColor, driver.findElement(By.xpath("//span[text()='Yellow']")));
//        Assert.assertEquals("Brand must be Apple", expectedBrand, driver.findElement(By.xpath("//span[text()='Apple']")));
//    }

    }

}
