package com.selenium.collections;

public class FindSmallestNumber {
    public static void main(String[] args) {
        int[][] numbers={{2,4,5},{3,4,7},{1,2,9}};
        int min=numbers[0][0];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(numbers[i][j]<min){
                    min=numbers[i][j];
                }
            }
        }
        System.out.println(min);
    }
}
