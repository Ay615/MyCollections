package com.selenium.collections;

import java.util.Arrays;

public class CoppyTwoArray {
    public static void main(String[] args) {
        //copy with actual order
        String[] s={"AA","BB","CC","DD","EE"};
        String[] s1=new String[s.length];
        for(int i=0;i<s.length;i++){
            s1[i]=s[i];
        }
        System.out.println(Arrays.toString(s1));
        //make array with descending order
        String temp="";
        for(int i=0;i<s.length/2;i++){
            temp=s[i];
            s[i]=s[s.length-i-1];
            s[s.length-i-1]=temp;
        }
        System.out.println(Arrays.toString(s));
    }
}
