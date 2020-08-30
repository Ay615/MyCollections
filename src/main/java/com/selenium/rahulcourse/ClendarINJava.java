package com.selenium.rahulcourse;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ClendarINJava {
    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();
        SimpleDateFormat format=new SimpleDateFormat("M/d/yyyy hh:mm:ss");
        System.out.println(format.format(calendar.getTime()));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

    }
}
