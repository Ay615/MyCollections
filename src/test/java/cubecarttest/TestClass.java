package cubecarttest;


import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class TestClass {
    WebDriver driver;
    @BeforeClass
    public void setUp(){
        DriverInitialization driverInit=DriverInitialization.getInstance();
       // driver=new ChromeDriver();
        driver=driverInit.openBrowser();
    }
    @Test
    public void test1(){
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());

    }
    @AfterClass
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}
