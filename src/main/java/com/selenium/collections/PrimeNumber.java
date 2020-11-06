package com.selenium.collections;

public class PrimeNumber {
    public static void main(String[] args) {
        foundPrimeNumber(30);
    }
    public static void foundPrimeNumber(int number){
        int count=0;
        for(int i=2;i<=number;i++){
            int j=0;
            for(j=2;j<=i;j++){
                if(i%j==0){
                    break;
                }
            }
            if(i==j){
                count++;
                System.out.println("Prime numbers was : "+i);

            }
        }System.out.println("Totao Cont of Prime Numbers Was : "+count);
    }
}
