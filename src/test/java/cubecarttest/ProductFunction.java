package cubecarttest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ProductFunction extends TestBase {
    WebDriver driver;
    ExcelReadWrite excelReadWrite=new ExcelReadWrite();


    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "c://webdriver//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://cubecart.unitedcoderschool.com/ecommerce/admin_w4vqap.php?_g=customers&node=email");
    }

    public void login() {
        String userName = "testautomation";
        String password = "automation123!";
        driver.findElement(By.id("username")).sendKeys(userName);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login")).click();
    }

    public void addProducts() {
        ExcelReadWrite excelReadWrite=new ExcelReadWrite();
        //add a new product
        driver.findElement(By.id("nav_products")).click();

        int productCount=1;
        for (int i=1;i<= productCount;i++)
        {
            String productName=excelReadWrite.excelRead("products.xlsx","Sheet1",i,1);
            if(productName!=null) {
                driver.findElement(By.linkText("Add Product")).click();
                driver.findElement(By.id("name")).sendKeys(productName);
                //pricing
                String productPrice = excelReadWrite.excelRead("products.xlsx", "Sheet1", i, 2);

                driver.findElement(By.linkText("Pricing")).click();
                driver.findElement(By.id("price")).sendKeys(productPrice);

                driver.findElement(By.cssSelector("input[value='Save']")).click();
                WebElement successMessage = driver.findElement(By.cssSelector("div.success"));
                if (successMessage.isDisplayed())
                    System.out.println("New product " + productName + " is added");
                else System.out.println("test failed");
                productCount++;
            }
        }
    }

    public void bulkChangePrice() {
        driver.findElement(By.linkText("Bulk Price Change")).click();
        sleep(2);
        int productsCount=1;
        for (int i=1;i<=productsCount;i++)
        {
            String productName=excelReadWrite.excelRead("products.xlsx", "Sheet1",i,1);
            if(productName!=null) {
                System.out.println(productName);
                driver.findElement(By.xpath("//*[text()='" + productName + "']/preceding-sibling::td/div/input")).click();
                productsCount++;
            }
        }
        driver.findElement(By.id("bulk_price_method")).click();
        Select select=new Select(driver.findElement(By.id("bulk_price_method")));
        select.selectByVisibleText("By Percent");
        driver.findElement(By.name("price[value]")).sendKeys("130");
        driver.findElement(By.xpath("//input[@value='Save']")).click();
        sleep(1);
        String result=driver.findElement(By.className("success")).getText();
        System.out.println(result);
        if(result.equals("Prices have been updated accordingly."))
            System.out.println("Test passed");
        else
            System.out.println("Test failed");
    }

    public void bulkDeleteProducts() {
        driver.findElement(By.id("nav_products")).click();
        //driver.findElement(By.linkText("View All")).click();
        sleep(2);
        int productsCount=1;
        for (int i=1;i<=productsCount;i++)
        {
            String productName=excelReadWrite.excelRead("products.xlsx", "Sheet1",i,1);
            if(productName!=null) {
                System.out.println(productName);
                driver.findElement(By.xpath("//*[text()='"+productName+"']//parent::td/preceding-sibling::td/div/input")).click();
                productsCount++;
                sleep(1);
            }
        }
        Select delete=new Select(driver.findElement(By.xpath("//select[@name='action']")));
        delete.selectByVisibleText("Delete");
        driver.findElement(By.xpath("//input[@value='Save']")).click();
        sleep(1);
        String result=driver.findElement(By.className("success")).getText();
        System.out.println(result);
       /* if(result.equals("Product(s) successfully deleted."))
            System.out.println("Test passed");
        else
            System.out.println("Test failed");*/
    }

    //define prodouct name for add review
    String productName=excelReadWrite.excelRead("products.xlsx", "Sheet1",1,1);

    public void addReview()
    {
        driver.findElement(By.linkText("Reviews")).click();
        driver.findElement(By.linkText("Add review")).click();
        //driver.findElement(By.id("ajax_name")).sendKeys(productName);
        driver.findElement(By.id("ajax_name")).sendKeys(productName);
        sleep(1);
        //get auto-complete textbox value
        List<WebElement> autoSuggest = driver.findElements(By.xpath("//span[@class='jqac-link']"));
        //System.out.println(autoSuggest.size());
        autoSuggest.get(0).click();

        driver.findElement(By.id("review_title")).sendKeys("Review-Abdurahman");
        driver.findElement(By.className("submit")).click();//class="success"
        String result=driver.findElement(By.className("success")).getText();
        System.out.println(result);
        if(result.equals("Review successfully added."))
            System.out.println("Test passed");
        else
            System.out.println("Test failed");
    }

    public void updateReview() {
        driver.findElement(By.linkText("Reviews")).click();
        driver.findElement(By.linkText("View All")).click();
        sleep(1);
        driver.findElement(By.xpath("//*[text()='"+productName+"']//parent::div/preceding-sibling::span/a")).click();
        sleep(1);

        //click five star for edit
        driver.findElement(By.xpath("//a[@title='3']")).click();
        //click Submit
        driver.findElement(By.className("submit")).click();//class="success"
        //varify
        String result=driver.findElement(By.className("success")).getText();
        System.out.println(result);
        if(result.equals("Review successfully updated."))
            System.out.println("Test passed");
        else
            System.out.println("Test failed");

    }

    public void deleteReview() {
        driver.findElement(By.linkText("Reviews")).click();
        driver.findElement(By.linkText("View All")).click();
        driver.findElement(By.xpath("//*[text()='"+productName+"']//parent::div/preceding-sibling::span/a[2]")).click();

        Alert alert = driver.switchTo().alert();
        alert.accept();
        sleep(1);
        //varify
        String result=driver.findElement(By.xpath("//div[@class='success']")).getText();
        System.out.println(result);
        if(result.equals("Review successfully deleted."))
            System.out.println("Test passed");
        else
            System.out.println("Test failed");

    }

    public void closeBrowser()
    {
        driver.close();
        driver.quit();
    }
}
