package com.selenium.collections;


public class FindPairsAmazonInt {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,8};
        functionPairs(arr,7);
    }
    public static void functionPairs(int arr[],int sumNumber){
        int size=arr.length;
//        for(int i=0;i<size/2;i++){
//            for(int j=0;j<size;j++){
//                if(arr[i]+arr[j]==sumNumber){
//                    int pairs[]={arr[i],arr[j]};
//                    System.out.println(Arrays.toString(pairs));
//                }
//            }
//        }
        String result="";
        for(int i=0;i<arr.length/2;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]+arr[j]==sumNumber){
                    result+="{"+arr[i]+","+arr[j]+"}";
                }
            }
        }
        System.out.println(result);

//        String result="";
//        for(int i=0;i<arr.length/2;i++){
//            for(int j=arr.length-1;j>0;j--){
//                if(arr[i]+arr[j]==sumNumber){
//                    result+="{"+arr[i]+","+arr[j]+"}";
//                }
//            }
//        }
//        System.out.println(result);

    }
}
