package cubecarttest;


import java.util.*;


public class Test {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<String, String>();
        map.put("Google","https://www.google.com");
        map.put("Yahoo","https://www.yahoo.com");
        map.put("Youtube","https://www.youtube.com");
        for(Map.Entry entry:map.entrySet()){
            System.out.println(entry.getKey()+ " : " + entry.getValue());
        }


    }
}
