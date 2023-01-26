package day29_ArrayList;

import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {
    public static void main(String[] args) {
        ArrayList <Integer>list1= new ArrayList<>(Arrays.asList(1,1,2,3,3,4,5,5,6,7,7,8,9,9));
        ArrayList <Integer>unique=new ArrayList<>();



        for (Integer each : list1) {
            if (Collections.frequency(list1, each) == 1){
                unique.add(each);
            }
        }
        System.out.println(unique);

        System.out.println("-----------------------------");
//ANOTHER SOLUTION WITHOUT LOOP
        ArrayList <Integer>list2= new ArrayList<>(Arrays.asList(1,1,2,3,3,4,5,5,6,7,7,8,9,9));
        ArrayList <Integer>unique2=new ArrayList<>(list2);

        unique2.removeIf(p-> Collections.frequency(unique2,p)>1);// removed all elements freq is more than 1. p represents each element of list2 array list
        System.out.println(unique2);





    }
}
