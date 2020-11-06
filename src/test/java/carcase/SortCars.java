package carcase;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class SortCars{
    public static void main(String[] args) {
        ArrayList<Cars> list=new ArrayList<>();
        list.add(new Cars(1985,"Toyota","Cemry","(622-VRX)"));
        list.add(new Cars(1980,"Chevrolet","Chevette","(J43-SMB)"));
        list.add(new Cars(1993,"Honda","Civic","(883-RS9)"));
        list.add(new Cars(1966,"Ford","Mustang","(AZUCAR)"));
        list.add(new Cars(1996,"Dodge","Neon","(G74-LLC)"));

        //list.sort(Comparator.comparing(Cars::getYear));
        //list.sort(Comparator.comparing(Cars::getYear).reversed());
        Collections.sort(list);
        System.out.println(list.toString());
//        list.sort(new Comparator<Cars>() {
//            @Override
//            public int compare(Cars o1, Cars o2) {
//                int comparison=0;
//                comparison=o1.getYear().compareTo(o2.getYear());
//                return comparison;
//            }
//        };

//        for(Object carList:list){
//            System.out.println(carList);
//        }
    }


}
