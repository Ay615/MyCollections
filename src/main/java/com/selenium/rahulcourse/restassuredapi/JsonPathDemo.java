package com.selenium.rahulcourse.restassuredapi;

import io.restassured.path.json.JsonPath;

public class JsonPathDemo {
    public static void main(String[] args) {
        JsonPath jsonPath=new JsonPath(Jsons.coursePrice());
        int courseCount=jsonPath.getInt("courses.size()");
        System.out.println("Total course Count is: "+courseCount);
        int purchaseAmount=jsonPath.getInt("dashboard.purchaseAmount");
        System.out.println("Purchase Amount is: "+purchaseAmount);
        String firstCourseTitle=jsonPath.get("courses[0].title");
        System.out.println(firstCourseTitle);
        for(int i=0;i<courseCount;i++){
             String courseTites=jsonPath.getString("courses["+i+"].title");
             String prices=jsonPath.getString("courses["+i+"].price");
            System.out.println(courseTites);
            System.out.println(prices);
        }

    }
}
