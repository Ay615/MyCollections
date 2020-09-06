package com.selenium.tests;

public class GoogleMultiThreadTest {
    public static void main(String[] args) {
        GoogleMultiThread search1 = new GoogleMultiThread("Java");
        GoogleMultiThread search2 = new GoogleMultiThread("Selenium");
        GoogleMultiThread search3 = new GoogleMultiThread("Test Automation");
        //define each thread
        Thread browser1 = new Thread(search1, "Browser 1");
        Thread browser2 = new Thread(search2, "Browser 2");
        Thread browser3 = new Thread(search3, "Browser 3");
        //execute the thread
        browser1.start();
        browser2.start();
        browser3.start();
    }
}
