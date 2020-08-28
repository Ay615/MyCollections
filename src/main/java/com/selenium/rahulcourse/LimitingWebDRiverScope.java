package com.selenium.rahulcourse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class LimitingWebDRiverScope {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://webdriver//chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qaclickacademy.com/practice.php");
        System.out.println(driver.findElements(By.tagName("a")).size());
        //limiting the webdriver scope
        WebElement footerdriver=driver.findElement(By.id("gf-BIG"));
        System.out.println(footerdriver.findElements(By.tagName("a")).size());
        WebElement coloumndriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        int size=coloumndriver.findElements(By.tagName("a")).size();
        System.out.println(size);
        // click on each link in the coloumn and check if the pages are opening-
        for(int i=0;i<size;i++){
            String clickOnTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
            coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnTab);
        }
        Set<String> tables=driver.getWindowHandles();
        Iterator<String> it=tables.iterator();
        while (it.hasNext()){
            driver.switchTo().window(it.next());
            System.out.println(driver.getTitle());

        }
    }
}
