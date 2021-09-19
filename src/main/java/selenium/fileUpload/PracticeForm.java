//package selenium.fileUpload;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//public class PracticeForm {
//
//    WebDriver driver;
//
//    @Before
//    public void setUp(){
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//    }
//
//    @Test
//    public void radioButtonSelection(){
//        driver.get("https://demoqa.com/automation-practice-form");
//
//        driver.findElement(By.id("firstName")).sendKeys("MyName");
//
//        driver.findElement(By.id("lastName")).sendKeys("LastName");
//
//        driver.findElement(By.id("userEmail")).sendKeys("myEmail@gmail.com");
//
//        WebElement femaleRadioButton = driver.findElement(By.xpath("//label[@for='gender-radio-2']"));
//        femaleRadioButton.click();
//
//        driver.findElement(By.id("userNumber")).sendKeys("3237777777");
//
//        driver.findElement(By.id("dateOfBirthInput")).click();
//
//        driver.findElement(By.id("dateOfBirthInput")).click();
//
//        WebElement nextMonthButton = driver.findElement(By.xpath("//button[text()='Next Month']"));
//        nextMonthButton.click();
//        nextMonthButton.click();
//
//        WebElement monthDropDownButton = driver.findElement(By.className("react-datepicker__month-select"));
//
//        Select dropDown = new Select(monthDropDownButton);
//
//        List<WebElement> options = dropDown.getOptions();
//
//        for( WebElement option : options){
//            System.out.println(option.getText());
//        }
//        dropDown.selectByValue("9");
//
//        WebElement yearDropDownButton = driver.findElement(By.className("react-datepicker__year-select"));
//
//        Select yearDrop = new Select(yearDropDownButton);
//
//        // List<WebElement> list = yearDrop.getOptions();
//
//
//        yearDrop.selectByValue("1986");
//
//        WebElement dateButtonSelection = driver.findElement(By.xpath("//div[@aria-label='Choose Thursday, October 30th, 1986']"));
//
//        dateButtonSelection.click();
//
//        WebElement subjectsButton = driver.findElement(By.xpath("//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']"));
//        subjectsButton.click();
//
////        WebElement hobbies1 = driver.findElement(By.xpath("//div/input[@value='1']"));
////        hobbies1.click();
//
//        WebElement uploadPicButton = driver.findElement(By.id("uploadPicture"));
//        uploadPicButton.sendKeys("/Users/aizadaumarova/Desktop/logo.png");
//
//        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
//        currentAddress.sendKeys("MY address is here: , + " +
//                "MY address is here: +" +
//                "MY address is here: +" +
//                "MY address is here: +" +
//                "MY address is here: +" +
//                "MY address is here: +" +
//                "MY address is here: ");
//
//        WebElement stateAndCityDrop = driver.findElement(By.className("css-19bqh2r"));
//
//
//        Select multipleDrop = new Select(stateAndCityDrop);
//        multipleDrop.selectByValue("NCR");
//
//        WebElement selectCityDrop = driver.findElement(By.className(" css-tlfecz-indicatorContainer"));
//
//        Select mltpDrop = new Select(selectCityDrop);
//        mltpDrop.selectByValue("Noida");
//
//        driver.findElement(By.id("submit")).click();
//
//
//    }
//    @Test
//    public void windowsNewTab(){
//
//        driver.get("https://demoqa.com/browser-windows");
//
//    }
//}
