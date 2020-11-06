package functiontests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataPicker {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c://webdriver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com");
        Thread.sleep(3000);
        WebElement datepickerLink = driver.findElement(By.xpath("//*[text()='Datepicker']"));
        datepickerLink.click();
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
        WebElement dateRageLink = driver.findElement(By.xpath("//*[text()='Select a Date Range']"));
        dateRageLink.click();
    }
}
