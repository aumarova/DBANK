package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    //In order to create page object model we need to create a PageFactory in the constructor

    public HomePage (WebDriver driver){
        // PageFactory class will link this class with the driver that's being currently used
        PageFactory.initElements(driver, this);
    }

   // @FindBy(xpath = "//div");
   // @FindBy(id = "someId");
   // @FindBy(name="someName");

    //Annotations can be used on top of mathod, variable, Constructor or method param
    @FindBy(id = "home-menu-item")
    public WebElement homeMenu;



}
