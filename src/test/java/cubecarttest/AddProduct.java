package cubecarttest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class AddProduct {
    WebDriver driver;
    @Parameters("browser")
    @Test
    public void setUp(String browser){

        driver.get("http://cubecart.unitedcoderschool.com/ecommerce/admin_w4vqap.php");
        String userName = "testautomation";
        String password = "automation123!";
        driver.findElement(By.id("username")).sendKeys(userName);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login")).click();
    }

    @Test(dataProvider = "myProduct",groups = "smoke test")
    public void cubeCartAddProduct(String productName,String code,String weight){
        driver.findElement(By.id("nav_products")).click();
        driver.findElement(By.linkText("Add Product")).click();
        driver.findElement(By.id("name")).sendKeys(productName);
        driver.findElement(By.id("product_code")).sendKeys(code);
        driver.findElement(By.id("product_weight")).sendKeys(weight);
        driver.findElement(By.xpath("//*[@id=\"page_content\"]/form/div[10]/input[3]")).click();
    }
    @DataProvider
    public Object[][] myProduct(){
        Object[][] products=new Object[3][3];
        products[0][0]="Computor";
        products[0][1]="6754";
        products[0][2]="567";
        products[1][0]="laptop";
        products[1][1]="63454";
        products[1][2]="5987";
        products[2][0]="Ipad";
        products[2][1]="66";
        products[2][2]="57";
       /* Object[][] po=new Object[][]{
            {"","",""},
            {"","",""},
            {"","",""}
        };*/
        return products;
    }

}
