package com.selenium.collections;


public class ForLoop {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                long sum=i*j;
                System.out.print(String.format("%d * %d= %d  ",i,j,sum));
            }
            System.out.println();

        }


    }
}
