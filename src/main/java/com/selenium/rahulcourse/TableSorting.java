package com.selenium.rahulcourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TableSorting {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c://webdriver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        WebElement topDealsLink=driver.findElement(By.linkText("Top Deals"));
        topDealsLink.click();
        String mainWindow=driver.getWindowHandle();
        for(String tabs:driver.getWindowHandles()){
            if (!mainWindow.equals(tabs)) {
                driver.switchTo().window(tabs);
            }
        }
        driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
        driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
        List<String> names=new ArrayList<String>();
        List<WebElement> items=driver.findElements(By.cssSelector("tr td:nth-child(2)"));
        for(int i=0;i<items.size();i++){
           names.add(items.get(i).getText());
        }
        System.out.println(names.toString());
        ArrayList copiedItems=new ArrayList();
        copiedItems.addAll(names);
        System.out.println("copy of array is: "+copiedItems.toString());
        Collections.sort(copiedItems);
        //Collections.reverse(copiedItems);
        System.out.println("Sorted copy list is :"+copiedItems.toString());
        Assert.assertTrue(copiedItems.equals(names));

    }
}
