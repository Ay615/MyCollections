package mobiletest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Base {
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.APP,"c:\\app\\ApiDemos-debug.apk");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"AynigarDevice");
        URL url=new URL("http://0.0.0.1:4723/wd/hub");
        AndroidDriver<AndroidElement> driver=new AndroidDriver<AndroidElement>(url,capabilities);

    }
}
