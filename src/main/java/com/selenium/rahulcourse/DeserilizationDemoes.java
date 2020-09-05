package com.selenium.rahulcourse;

import io.restassured.path.json.JsonPath;


public class DeserilizationDemoes {
    public static void main(String[] args) {
        JsonPath jsonPath = new JsonPath(JsonFile3.coursesJson());
        int coursesSize = jsonPath.getInt("courses.size()");
        System.out.println(coursesSize);
        int purchaseAmount=jsonPath.getInt("dashboard.purchaseAmount");
        System.out.println(purchaseAmount);
        for(int i=0;i<coursesSize;i++){
            String courseTitles=jsonPath.getString("courses["+i+"].title");
            if(courseTitles.equals("Cypress")){
                int price=jsonPath.getInt("courses["+i+"].price");
                System.out.println(courseTitles);
                System.out.println(price);
            }

        }
    }
}
