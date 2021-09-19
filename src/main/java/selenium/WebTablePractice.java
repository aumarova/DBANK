package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebTablePractice {
    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    }
    @After
    public void tearDown(){
        driver.close();
    }

    @Test
    public void printList(){
        driver.navigate().to("https://chandanachaitanya.github.io/selenium-practice-site/");

        // bring the table into the view
        Actions actions = new Actions(driver);

        WebElement buttonToScrollTo = driver.findElement(By.id("win1"));
        actions.moveToElement(buttonToScrollTo).perform();


        // how to get te number of the rows
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='BooksAuthorsTable']/tbody/tr"));

        int numberOfRows = rows.size();
        System.out.println("number of rows: " + numberOfRows);


        // how to get the number of columns
        List<WebElement> columns = driver.findElements(By.xpath("//table[@id='BooksAuthorsTable']//tr/th"));

        int numberOfColumns = columns.size();
        System.out.println("number of columns: " + numberOfColumns);

        //print out all the books by Dan Brown
        List<WebElement> DanBrownBooks = driver.findElements(By.xpath("//table[@id='BooksAuthorsTable']//tr[4]/td"));

        for(int i = 1; i < DanBrownBooks.size(); i++){
            System.out.println(DanBrownBooks.get(i).getText());
        }
    }
    @Test
    public void printList2() {
        driver.navigate().to("https://chandanachaitanya.github.io/selenium-practice-site/");

        WebElement table = driver.findElement(By.xpath("//table[@id='BooksAuthorsTable']"));

        List<WebElement> columnNames = table.findElements(By.xpath(".//th")); //book1, book2 ... author

        int indexOfAuthorColumn = 0;

        for (WebElement columnName: columnNames){
            ++indexOfAuthorColumn;
            if(columnName.getText().contains("Author"))break;
        }

        List<WebElement> authors = table.findElements(By.xpath(".//tr/td[" + indexOfAuthorColumn+ "]"));

        int indexOfDanBrown = 1;

        for (WebElement author: authors){
            ++indexOfDanBrown;
            if(author.getText().trim().equals("Dan Brown"))break;
        }

        int numOfColumns = columnNames.size();
        String booksXpath = ".//tr["+indexOfDanBrown+"]/td";

        for ( int i = 1; i<=numOfColumns; i++){
            if ( i == indexOfAuthorColumn)continue;

            WebElement book = table.findElement(By.xpath(booksXpath+"["+i+"]"));
            System.out.println(book.getText());
        }


    }
    @Test
    public void webTable1(){
        driver.get("https://money.rediff.com/indices");

       driver.findElement(By.id("showMoreLess")).click();

       WebElement webTable = driver.findElement(By.id("dataTable"));

       List<WebElement> rows = webTable.findElements(By.xpath("//tbody//tr"));

       int rowsCount = rows.size();

      //  System.out.println(rowsCount); //16

        for ( int i =0; i< rowsCount; i++){


            List<WebElement>columns = rows.get(i).findElements(By.xpath("//tbody//td"));

            int columnsCount= columns.size();

          //  System.out.println(columnsCount); //80

            for ( int j = 0; j< columnsCount; j++){
                String cellText = columns.get(j).getText();
                if (cellText.equals("S&P BSE 100")){
                    System.out.println("columnfound: "+ columns.get(7).getText()); // 17640.13
                }
            }
        }


    }
}
