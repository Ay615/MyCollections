package com.selenium.collections;

public class BinarySearchDemo {
    public static void main(String[] args) {
        int[] arr = {-10, -35, -20, 10, 20, 30, 35, 45};
        int search = 35;
        int head = 0;
        int end = arr.length - 1;
        while (head<=end) {
            int middle = (head + end) / 2;
            if(search==arr[middle]){
                System.out.println(middle);
                break;
            }
            else if(search>arr[middle]){
                head=middle+1;
            }
            else {
                end=middle-1;
            }
        }
    }
}
