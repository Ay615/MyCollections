package com.selenium.tests;

import javafx.scene.paint.Stop;
import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        WebDriver webDriver=new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://www.google.com");
            WebElement searchBox = webDriver.findElement(By.name("q"));
            searchBox.sendKeys("java"+ Keys.ENTER);
        System.out.println(webDriver.getTitle()); //go back to the main page
        webDriver.close();
        webDriver.quit();
    }
}
