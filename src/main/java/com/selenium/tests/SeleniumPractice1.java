package com.selenium.tests;

import com.sun.deploy.security.SelectableSecurityManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //dimension class for set window size
        Dimension dimension=new Dimension(200,200);
        driver.manage().window().setSize(dimension);
        driver.get("https://www.google.com");
        //Point move the browser
        Point p=new Point(300,200);
        driver.manage().window().setPosition(p);
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.name("q")).sendKeys("java");
        WebElement em=driver.findElement(By.linkText("Ayarlar"));
        Point p1=em.getLocation();
        //print x and y location of an element
        System.out.println(p1.getX());
        System.out.println(p1.getY());
        //get width and height
        Dimension d2=em.getSize();
        System.out.println(d2.width);
        System.out.println(d2.height);





    }
}
