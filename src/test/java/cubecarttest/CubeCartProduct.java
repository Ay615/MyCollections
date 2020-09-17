package cubecarttest;

import java.util.ArrayList;
import java.util.List;

public class CubeCartProduct {
    public static void main(String[] args) {
        List<String> productsInfo=new ArrayList<String>();
        productsInfo.add("No,Product Name,Product Price");
        productsInfo.add("01,Device01-Abdurahman,100");
        ProductFunction productFunction=new ProductFunction();
        productFunction.openBrowser();
        productFunction.login();
        productFunction.addProducts();
        productFunction.bulkDeleteProducts();
        productFunction.closeBrowser();
    }
}
