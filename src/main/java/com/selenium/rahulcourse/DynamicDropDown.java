package com.selenium.rahulcourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicDropDown {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c://webdriver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        WebElement fromFiled = driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]"));
        fromFiled.click();
        WebElement fromFieldText = driver.findElement(By.xpath("//a[@value=\"GOI\"]"));
        fromFieldText.click();
        WebElement toFieldText = driver.findElement(By.xpath("//a[@value='MAA']"));
        //also can use //(//a[@value='MAA'])[2] or use parent child relation like
        //"//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']
        wait(driver, toFieldText);
        toFieldText.click();

    }
        public static void wait(WebDriver driver, WebElement webElement){
            WebDriverWait wait=new WebDriverWait(driver,10);
            wait.until(ExpectedConditions.visibilityOf(webElement));
        }

}
