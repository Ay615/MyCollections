package com.selenium.rahulcourse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c://webdriver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        WebElement signinIcon=driver.findElement(By.xpath("//span[text()='Hello, Sign in']"));
        Actions actions=new Actions(driver);
        //move to specific element
        actions.moveToElement(signinIcon).build().perform();
        WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
       actions.moveToElement(searchBox).click().keyDown(Keys.SHIFT).sendKeys("Iphone").doubleClick().build().perform();
       //contextClick is right click
    }
}
