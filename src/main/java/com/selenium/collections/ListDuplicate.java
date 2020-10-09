package com.selenium.collections;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ListDuplicate {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("Australia");
        list.add("Brazil");
        list.add("Canada");
        list.add("United Status");
        list.add("Canada");
        list.add("Brazil");
        HashSet<String> set=new HashSet<String>();
        for(int i=0;i<list.size();i++){
            String countryName=list.get(i);
            if(set.add(countryName)==false){
                System.out.println(countryName+" is Duplictated");
            }
        }


    }
}
