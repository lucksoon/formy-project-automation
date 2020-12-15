import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) {

       //Locate the Chrome Driver
        System.setProperty("webdriver.chrome.driver", "/Users/lsoonyadeth/Downloads/chromedriver");

        //Set new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        //Navigate to the test website
        driver.get("https://formy-project.herokuapp.com/switch-window");

        //Find the elements on the page to test
        // In this test case, we're looking for elements "Open New Tab"  AND "OPEN ALERT" buttons
        WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
        newTabButton.click();
        // At this point two windows(tabs) are currently being opened

        //--How to set focus on both window/tabs then switch to the new opened window/tab and then back to orignal window/tab

        //Define new variable for original tab and set focus on the original window
        String originalHandle = driver.getWindowHandle();

        // Use a FOR loop to iterate through the two handles and set focus on the new tab/window
        for (String handler1: driver.getWindowHandles())  {
            driver.switchTo().window(handler1); }

        // switch focus back to original window
        driver.switchTo().window(originalHandle);


        driver.quit();
    }
}
