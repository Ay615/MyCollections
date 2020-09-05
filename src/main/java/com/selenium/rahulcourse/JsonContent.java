package com.selenium.rahulcourse;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class JsonContent {
    public static void main(String[] args) throws IOException {
        //  serilization(marshling)-convert java object to json content
        Map<String,String> courses=new HashMap<String,String>();
        courses.put("course title","java");
        courses.put("price","50");
        ObjectUsedForJsonContent content=new ObjectUsedForJsonContent("https://seleniummaster.teachable.com/"
        ,"SDET trainig","Automation","Dolkun Tarim","https://www.linkedIn.com",courses);
        ObjectMapper mapper=new ObjectMapper();
        mapper.writeValue(new File("testdata/jsonfile2"),content);
        String jsonContent=mapper.writeValueAsString(content);
        System.out.println(jsonContent);
        //deserilization(Unmarshling)
        System.out.println("Instructor is: "+content.getInstructor());
        System.out.println("servecies is:"+content.getServices());
    }
}
