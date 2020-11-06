package com.selenium.rahulcourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class RetrieveDataFromWebTable {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://webdriver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");
        List<WebElement> list=driver.findElements(By.xpath("//*[text()='Sri Lanka Innings']/parent::div/parent::div/div"));
        int stratRow=3;
        List<String> elements=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            while (stratRow<=list.size()-2){
              elements.add(driver.findElement(By.xpath("//*[text()='Sri Lanka Innings']/parent::div/parent::div/div["+stratRow+"]/div[3]")).getText());
              stratRow++;
            }
        }
        System.out.println(elements);
    }
}
