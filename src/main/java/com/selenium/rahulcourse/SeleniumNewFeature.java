package com.selenium.rahulcourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumNewFeature {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c://webdriver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        WebElement nameEditBox =driver.findElement(By.cssSelector("[name='name']"));
        //selenium 4 new features relative locators  but not stable

        //System.out.println(driver.findElement(withTagName("label").above(nameEditBox)).getText());

        WebElement dateofBirth= driver.findElement(By.cssSelector("[for='dateofBirth']"));

        //driver.findElement(withTagName("input").below(dateofBirth)).sendKeys("02/02/1992");

        WebElement iceCreamLabel=driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));

        //driver.findElement(withTagName("input").toLeftOf(iceCreamLabel)).click();

//Get me the label of first Radio button

        WebElement rb=driver.findElement(By.id("inlineRadio1"));

        //System.out.println(driver.findElement(withTagName("label").toRightOf(rb)).getText());

    }
    }

