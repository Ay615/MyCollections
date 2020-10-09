package com.selenium.rahulcourse.javastream;

import java.util.ArrayList;

public class StreamDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add("Apple");
        list.add("Ayshe");
        list.add("Banan");
        list.add("Mihr");
        list.add("Abdu");
       list.stream().filter(s->s.startsWith("A")).count();
    }
}
