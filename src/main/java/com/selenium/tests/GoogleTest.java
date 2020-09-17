package com.selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class GoogleTest {
    @Test
    public void googleSearch1(){
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        WebDriver webDriver=new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://www.google.com");
        webDriver.findElement(By.name("q")).sendKeys("selenium");
        System.out.println(webDriver.getTitle());
        webDriver.close();
        webDriver.quit();
    }
    @Test
    public void googleSearch2(){
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        Proxy p=new Proxy();
        p.setHttpProxy("localhost:7777");
        DesiredCapabilities cap=new DesiredCapabilities();
        cap.setCapability(CapabilityType.PROXY, p);
        WebDriver driver=new ChromeDriver(cap);
        driver.get("https://www.amazon.com/ap/signin?ie=UTF8&clientContext=135-5743027-9249047&arb=6c4b1cc8-fcda-486b-a866-605aec608386&openid.pape.max_auth_age=0&use_global_authentication=false&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fgp%2Fcss%2Fhomepage.html%3Fie%3DUTF8%26%252AVersion%252A%3D1%26%252Aentries%252A%3D0&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=usflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
        WebElement userNameField=driver.findElement(By.cssSelector("input[tabindex = '1']"));
        userNameField.sendKeys("aynigar615@gmail.com");
        driver.findElement(By.cssSelector("input[tabindex = '5']")).click();
        WebElement passwordField=driver.findElement(By.xpath("//input[@tabindex='2']"));
        passwordField.sendKeys("A1992061500");
        driver.findElement(By.id("signInSubmit")).click();



    }
}
