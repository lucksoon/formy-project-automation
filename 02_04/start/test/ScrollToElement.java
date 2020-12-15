import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {
    public static void main(String[] args) {

        // set location of chromedriver
        System.setProperty("webdriver.chrome.driver", "/Users/lsoonyadeth/Downloads/chromedriver");

        // create new instance of chromedriver
        WebDriver driver = new ChromeDriver();

        // Navigate  the driver to new test page
        driver.get("https://formy-project.herokuapp.com/scroll");

       // Elements to automate
       WebElement name = driver.findElement(By.id("name"));
      //
       Actions actions = new Actions (driver);
       //Use Method  "move to element"  provided by Actions class
       actions.moveToElement(name);
       name.sendKeys("Luck Soonyadeth");


        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("11/20/2020");


        // quite the driver
        driver.quit();
    }
}
