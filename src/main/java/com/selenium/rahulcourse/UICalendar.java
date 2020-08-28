package com.selenium.rahulcourse;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class UICalendar {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","c://webdriver//chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.path2usa.com/travel-companions");
        /*driver.findElement(By.id("travel_from")).sendKeys("Turkey");
        driver.findElement(By.id("travel_to")).sendKeys("India"+ Keys.ENTER);*/
        Thread.sleep(3000);
       WebElement calendarField=driver.findElement(By.xpath("//*[@id='travel_date']"));
        wait(driver,calendarField);
        JavascriptExecutor jse2 = (JavascriptExecutor)driver;
        jse2.executeScript("arguments[0].scrollIntoView()", calendarField);
        calendarField.click();
        List<WebElement> days=driver.findElements(By.xpath("//td[@class='day']"));
        for(int i=0;i<days.size();i++){
            if(days.get(i).getText().equals(8)){
                days.get(i).click();
            }
        }
    }
    public static void wait(WebDriver driver, WebElement webElement){
        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }
}
