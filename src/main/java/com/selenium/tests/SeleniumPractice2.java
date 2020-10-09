package com.selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        WebElement em=driver.findElement(By.id("email"));
        em.sendKeys("aynigar@gmail.com");
        String t = em.getAttribute("value");
        //get fontsize of the element
        String fontSize=em.getCssValue("font-size");
        if(t.length()==0)
        {
            System.out.println("Textbox present in Facebook login page is empty");
        }
        else {
            System.out.println("Textbox present in Facebook login page is not empty");
        }

    }
}
