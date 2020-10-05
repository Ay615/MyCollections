package com.selenium.collections;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class Dataprovider4 {

    @Test(dataProvider = "maharaUsers",groups = "smoke test")
    public void test(String username,String password){
        System.out.println("Mahara username is:"+username);
        System.out.println("Mahara passwordes is:"+password);
    }

    @DataProvider
    public Object[][] maharaUsers(){
        Object[][] datas=new Object[4][2];
        datas[0][0]="Admin";
        datas[0][1]="MaharaDemo";
        datas[1][0]="Student";
        datas[1][1]="MaharaDemo";
        datas[2][0]="Learner";
        datas[2][1]="MaharaDemo";
        datas[3][0]="Staff";
        datas[3][1]="MaharaDemo";
        return datas;
    }
}
