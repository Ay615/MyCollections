package cubecarttest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverInitialization {
    private static DriverInitialization driverInitialization=null;
    private WebDriver driver;
    private DriverInitialization(){

    }
    public static DriverInitialization getInstance(){
        if(driverInitialization==null)
            driverInitialization=new DriverInitialization();
        return driverInitialization;
    }
    public WebDriver openBrowser(){
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        driver=new ChromeDriver();
        return driver;
    }

}
