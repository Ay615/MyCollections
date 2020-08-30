package com.selenium.rahulcourse;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
    @Test(dataProvider = "data")
    public void logInTest(String username,String password){
        System.out.println(username);
        System.out.println(password);

    }
    @DataProvider
    public Object[][] data(){
      Object[][] datas=new Object[3][2];
      datas[0][0]="user1";
      datas[0][1]="password1";
      datas[1][0]="user2";
      datas[1][1]="password2";
      datas[2][0]="user3";
      datas[2][1]="password3";
      return datas;
    }
}
