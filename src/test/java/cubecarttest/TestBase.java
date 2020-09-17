package cubecarttest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {
    static WebDriver driver;
    int maxiumWaiTime = 30;


    // explict wait
    public void waitUntilElementIsVisible(WebElement webElement) {
        //driver=new ChromeDriver();
        WebDriverWait webDriverWait = new WebDriverWait(driver, maxiumWaiTime);
        webDriverWait.until(ExpectedConditions.visibilityOf(webElement));
    }

    //sleep
    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
