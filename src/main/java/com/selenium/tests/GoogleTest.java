package com.selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GoogleTest {
    WebDriver driver;
    @Parameters("browser")
    @Test
    public void googleSearch(String browser){
        if(browser.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", "c://webdriver//chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();}
        else if(browser.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", "c://webdriver//geckodriver.exe");
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
        }

        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("selenium");
        System.out.println(driver.getTitle());

    }

}
