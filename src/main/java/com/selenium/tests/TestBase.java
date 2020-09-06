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
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        WebDriver webDriver=new ChromeDriver();
        webDriver.manage().window().maximize();
        StopWatch stopWatch=new StopWatch();
        stopWatch.start();
        webDriver.get("https://www.google.com");
        webDriver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        String[] keywords=new String[]{"Selenium","Java",
                "Washington DC","Canada"};
        for(String keyword:keywords) {
            WebElement searchBox = webDriver.findElement(By.name("q"));
            System.out.println("Keywords: "+keyword);
            searchBox.sendKeys(keyword+ Keys.ENTER);
            Thread.sleep(5000);
            webDriver.navigate().back(); //go back to the main page
        }
        stopWatch.stop();
        System.out.println(stopWatch);
        webDriver.close();
        webDriver.quit();
    }
}
