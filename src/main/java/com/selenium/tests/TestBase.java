package com.selenium.tests;

import javafx.scene.paint.Stop;
import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestBase {
    WebDriver driver;
   @Parameters("browser")
    @Test
    public void amazonSearch(String browser){
       if(browser.equals("chrome")){
           System.setProperty("webdriver.chrome.driver", "c://webdriver//chromedriver.exe");
           driver = new ChromeDriver();
           driver.manage().window().maximize();}
       else if(browser.equals("firefox")) {
           System.setProperty("webdriver.gecko.driver", "c://webdriver//geckodriver.exe");
           driver = new FirefoxDriver();
           driver.manage().window().maximize();
       }
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        WebDriver webDriver=new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://www.amazon.com");
        System.out.println(webDriver.getTitle());

    }
}
