package cubecarttest;

import org.apache.commons.lang3.time.StopWatch;

import java.util.ArrayList;
import java.util.List;

public class CubeCartProduct {
    public static void main(String[] args) {
        List<String> productsInfo=new ArrayList<String>();
        productsInfo.add("No,Product Name,Product Price");
        productsInfo.add("01,Device01-Abdurahman,100");
        ProductFunction productFunction=new ProductFunction();
        StopWatch time=new StopWatch();
        time.start();
        productFunction.openBrowser();
        productFunction.login();
        productFunction.addProducts();
        productFunction.bulkDeleteProducts();
        time.stop();
        System.out.println("Time spended for this integration test is : "+time);
        productFunction.closeBrowser();
    }
}
