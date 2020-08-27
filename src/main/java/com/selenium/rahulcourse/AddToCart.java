package com.selenium.rahulcourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class AddToCart {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c://webdriver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        List<WebElement> allItems=driver.findElements(By.cssSelector("h4.product-name"));
        for(int i=0;i<allItems.size();i++){
            String names=allItems.get(i).getText();
            String[] itemNames={"Cucumber","Brocoli","Beetroot"};
            List<String> nestedItems=Arrays.asList(itemNames);
            if (nestedItems.contains(names)){
                driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
            }
        }
    }
}

       /* Thread.sleep(3000);
        addItems(driver,itemsNeeded);

    }

    public static  void addItems(WebDriver driver,String[] itemsNeeded)

    {

        int j=0;

        List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));

        for(int i=0;i<products.size();i++)

        {

//Brocolli - 1 Kg

//Brocolli,    1 kg

            String[] name=products.get(i).getText().split("-");

            String formattedName=name[0].trim();

//format it to get actual vegetable name

//convert array into array list for easy search

//  check whether name you extracted is present in arrayList or not-

            List itemsNeededList = Arrays.asList(itemsNeeded);

            if(itemsNeededList.contains(formattedName))

            {

                j++;

//click on Add to cart

                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

                if(j==itemsNeeded.length)

                {

                    break;

                }

            }

        }

    }



}*/

