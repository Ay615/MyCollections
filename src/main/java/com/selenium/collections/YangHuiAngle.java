package com.selenium.collections;

public class YangHuiAngle {
    public static void main(String[] args) {
        int[][] a=new int[10][];
        for(int i=0;i<a.length;i++){
            a[i]=new int[i+1];
            a[i][0]=a[i][i]=1;
            for(int j=1;j<a[i].length-1;j++){
                a[i][j]=a[i-1][j-1]+a[i-1][j];
            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
