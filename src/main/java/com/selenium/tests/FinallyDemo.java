package com.selenium.tests;

import java.util.HashMap;
import java.util.Map;

public class FinallyDemo {


    public static void main(String[] args)
    {
        Map<String,String> map=new HashMap<>();
        map.put("Java","Code");
        map.put("Python","code");
        map.put("Test","selenium");
        map.put("Apple","fruit");
        System.out.println(map.toString());
        System.out.println(map.get("Java").hashCode());
        System.out.println(map.get("Apple").hashCode());
        System.out.println(map.get("Test").hashCode());
        System.out.println(map.get("Python").hashCode());

    }
}
