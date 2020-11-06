package com.selenium.tests;

import java.text.SimpleDateFormat;
import java.util.*;

public class Test1 {
    public static void main(String[] args) {
       Calendar ca=Calendar.getInstance();
       SimpleDateFormat simpleDateFormat=new SimpleDateFormat("M/d/y");
        System.out.println(simpleDateFormat.format(ca.getTime()));
        System.out.println(ca.get(Calendar.DAY_OF_MONTH));
        System.out.println(ca.get(Calendar.AM_PM));
        System.out.println(ca.get(Calendar.DAY_OF_WEEK_IN_MONTH));



    }

}
