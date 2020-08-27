package com.selenium.rahulcourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AutoSuggestive {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c://webdriver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        WebElement passengerField=driver.findElement(By.id("divpaxinfo"));
        wait(driver,passengerField);
        passengerField.click();
        for(int i=0;i<4;i++){
            WebElement plusIcon= driver.findElement(By.xpath("//div[@class=\"ad-row-right\"]/span[3]"));
            wait(driver,plusIcon);
            plusIcon.click();
        }
        WebElement autoSuggest=driver.findElement(By.id("autosuggest"));
        wait(driver,autoSuggest);
        autoSuggest.sendKeys("ame");
        Thread.sleep(3000);
        List<WebElement> options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
        for(WebElement element:options){
            if(element.getText().equalsIgnoreCase("cameroon")){
            element.click();
            break;
        }
        }


    }
    public static void wait(WebDriver driver, WebElement webElement){
        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }
}
