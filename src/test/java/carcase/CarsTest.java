package carcase;

import java.io.*;
import java.util.ArrayList;

import java.util.Scanner;

public class CarsTest{
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("From which file do you want to load this information");
        String fileName=scanner.nextLine();
        BufferedReader reader=new BufferedReader(new FileReader(fileName));
        ArrayList<String> carLists=new ArrayList<>();
        String line=reader.readLine();
        while(line!=null){
            carLists.add(line);
            line=reader.readLine();
        }
        reader.close();
        System.out.println(carLists.toString());
//        for(String carsInfo:carLists){
//            System.out.println(carsInfo);
//        }




    }

}
