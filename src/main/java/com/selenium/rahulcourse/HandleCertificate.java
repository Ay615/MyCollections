package com.selenium.rahulcourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HandleCertificate {
    public static void main(String[] args) {
        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.acceptInsecureCerts();
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.merge(capabilities);
        WebDriver driver=new ChromeDriver(chromeOptions);
    }
}
