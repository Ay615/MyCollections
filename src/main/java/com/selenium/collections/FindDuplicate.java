package com.selenium.collections;

import java.util.ArrayList;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] num = {4, 5, 5, 4, 6, 6, 8, 9, 4};
        ArrayList<Integer> list = new ArrayList();
        for (int i = 0; i <num.length;i++){
            int k=0;
            if(!list.contains(num[i])){
                list.add(num[i]);
                for(int j=0;j<num.length;j++){
                    if(num[i]==num[j]){
                           k++;
                    }
                }
                System.out.println(num[i]);
                System.out.println(k);
            }
        }
    }
}
