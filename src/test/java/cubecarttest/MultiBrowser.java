package cubecarttest;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class MultiBrowser {

    WebDriver driver;
    WebUtility webUtility;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "c:\\webdriver\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        //define a webdriver
        driver = new ChromeDriver(chromeOptions);
        //maximize browser window
        driver.manage().window().maximize();
        // initialize the driverUtility class
        webUtility = new WebUtility(driver);
    }

    @Test()
    public void dragDropTest() {
        driver.get("https://jqueryui.com/droppable/");
        // this line of code is to scroll down the page to make the element visible
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");

        WebElement iframe = driver.findElement(By.tagName("iframe"));
        webUtility.waitForElementVisible(iframe);
        //move webdriver to the iframe
        driver.switchTo().frame(iframe);
        WebElement draggable = driver.findElement(By.id("draggable"));
        webUtility.waitForElementVisible(draggable);
        WebElement droppable = driver.findElement(By.id("droppable"));
        webUtility.waitForElementVisible(droppable);
        // define actions : drag and drop
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(draggable, 20, 0);  // drag a little from the original place by pixel
        actions.dragAndDrop(draggable, droppable).build().perform();
        // webUtility.sleep(2);
        // assertion
        webUtility.waitForElementVisible(droppable);
        Assert.assertTrue(droppable.getText().contains("Dropped"));
    }

    @Test(enabled = false)
    public void menuTest() {
        driver.get("https://jqueryui.com/menu/");
        // this line of code is to scroll down the page to make the element visible
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");

        WebElement iframe = driver.findElement(By.cssSelector(".demo-frame"));
        webUtility.waitForElementVisible(iframe);
        driver.switchTo().frame(iframe);

        WebElement musicMenu = driver.findElement(By.id("ui-id-9"));
        webUtility.waitForElementVisible(musicMenu);
        //actions to mouse move
        Actions actions1 = new Actions(driver);
        actions1.moveToElement(musicMenu).build().perform();
        //webUtility.sleep(2);

        WebElement rockMenu = driver.findElement(By.id("ui-id-10"));
        webUtility.waitForElementVisible(rockMenu);
        Actions actions2 = new Actions(driver);
        actions2.moveToElement(rockMenu).build().perform();
        //webUtility.sleep(2);

        //verification
        WebElement classicMenu = driver.findElement(By.id("ui-id-12"));
        webUtility.waitForElementVisible(classicMenu);
        Assert.assertTrue(classicMenu.isDisplayed());
    }

    @Test(description = "Multiple window verification")
    public void multipleWindowTest() {
        driver.get("http://seleniummaster.com/sitecontent/testfiles/windowtest.html");
        WebElement openWindowLink = driver.findElement(By.linkText("Open Window"));
        String mainWindowName = driver.getWindowHandle();
        System.out.println("mainWindowName: " + mainWindowName);
        webUtility.waitForElementVisible(openWindowLink);
        openWindowLink.click();
        for (String eachWindow : driver.getWindowHandles()) {
            System.out.println("Window name: " + eachWindow);
            if (!eachWindow.equalsIgnoreCase(mainWindowName)) {
                driver.switchTo().window(eachWindow);
                WebElement confirmationButton = driver.findElement(By.name("Abutton1"));
                webUtility.waitForElementVisible(confirmationButton);
                Assert.assertTrue(confirmationButton.isDisplayed());
            }
        }
    }

    @Test(description = "Multiple window verification Robot Framework Website")
    public void multipleWindowRobotFrameworkSiteTest() {
        driver.get("https://robotframework.org/");
        WebElement openShopLink = driver.findElement(By.xpath("//li/a[contains(text(),'Shop')]"));
        String mainWindowName = driver.getWindowHandle();
        System.out.println("mainWindowName: " + mainWindowName);
        webUtility.waitForElementVisible(openShopLink);
        openShopLink.click();
        for (String eachWindow : driver.getWindowHandles()) {
            System.out.println("Window name: " + eachWindow);
            if (!eachWindow.equalsIgnoreCase(mainWindowName)) {
                driver.switchTo().window(eachWindow);
                WebElement tShirtLink = driver.findElement(By.xpath("//a[text()='T-shirts, women']"));
                webUtility.waitForElementVisible(tShirtLink);
                Assert.assertTrue(tShirtLink.isDisplayed());
            }
        }
    }

    @Test(enabled = false)
    public void AlertAcceptTest() {
        driver.get("http://seleniummaster.com/sitecontent/testfiles/alert.html");
        WebElement removeButton = driver.findElement(By.name("removebutton"));
        webUtility.waitForElementVisible(removeButton);
        removeButton.click();
        // for demo purpose define some sleep time
        webUtility.sleep(1);
        // handle the Alert
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println(alertText);
        alert.accept();
        // multiple element logic
        // by this multiple element logic we can verify the none-existing element
        List<WebElement> testCase1 = driver.findElements(By.id("testcase1"));
        int count = testCase1.size();
        Assert.assertEquals(count, 0);
    }

    @Test(enabled = false)
    public void AlertDismissTest() {
        driver.get("http://seleniummaster.com/sitecontent/testfiles/alert.html");
        WebElement removeButton = driver.findElement(By.name("removebutton"));
        webUtility.waitForElementVisible(removeButton);
        removeButton.click();
        // for demo purpose define some sleep time
        webUtility.sleep(1);
        // handle the Alert
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
        // multiple element logic
        List<WebElement> testCase1 = driver.findElements(By.id("testcase1"));
        int count = testCase1.size();
        Assert.assertTrue(count >= 1);

        // here we can also use single element logic because the element is exist
        WebElement testCase1Element = driver.findElement(By.id("testcase1"));
        webUtility.waitForElementVisible(testCase1Element);
        Assert.assertTrue(testCase1Element.isDisplayed());
    }

    @Test(description = "Multiple elements select test",enabled = false)
    public void selectableElementTest() {
        driver.get("https://jqueryui.com/selectable/");
        // this line of code is to scroll down the page to make the element visible
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");

        WebElement iframe = driver.findElement(By.tagName("iframe"));
        webUtility.waitForElementVisible(iframe);
        driver.switchTo().frame(iframe);
        // find all selectable elements
        List<WebElement> selectableItems = driver.findElements(By.xpath("//ol[@id='selectable']/li"));
        int totalItems = selectableItems.size();
        System.out.println("Total items: " + totalItems);
        int clickCounter = 0;
        for (WebElement eachItem : selectableItems) {
            webUtility.waitForElementVisible(eachItem);
            System.out.println(eachItem.getText());
            eachItem.click();
            clickCounter++;
            // for demo purpose define sleep time
            // webUtility.sleep(2);
        }
        Assert.assertEquals(totalItems, clickCounter);

    }

    @Test(description = "Multiple links test",enabled = false)
    public void multipleLinkTest() {
        driver.get("https://jqueryui.com/");
        // find all links
        List<WebElement> allLinks = driver.findElements(By.xpath("//div[@id='sidebar']//a"));
        int totalLinks = allLinks.size();
        System.out.println("Total items: " + totalLinks);
        List<String> urls=new ArrayList<String>();
        for (WebElement link : allLinks)
        {
            String url=link.getAttribute("href"); // href is each link's url on UI
            urls.add(url);
        }
       /* for (String url : urls)
        {
            driver.navigate().to(url);
            //webUtility.sleep(2);
            ScreenShotUtility screenShotUtility=new ScreenShotUtility();
            screenShotUtility.captureImage(url.replace("https://jqueryui.com/","")
                    .replaceAll("/",""),driver);
        }
        Assert.assertTrue(urls.size()>1);
*/
    }

    @AfterClass
    public void tearDown()
    {
        driver.close();
        driver.quit();
    }


}
