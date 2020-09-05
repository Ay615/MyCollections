package com.selenium.rahulcourse.restassuredapi;

import io.restassured.path.json.JsonPath;

public class ConditionLogic {
    public static void main(String[] args) {
        JsonPath json=new JsonPath(Jsons.coursePrice());
        int courseSize=json.getInt("courses.size()");
        for(int i=0;i<courseSize;i++){
            String courseTitles=json.getString("courses["+i+"].title");
            if(courseTitles.equals("Cypress")){
                System.out.println(json.get("courses["+i+"].price"));
                break;
            }

        }
    }
}
