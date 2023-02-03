package day47_CollecionPart2;

import java.sql.ClientInfoStatus;
import java.util.*;

public class SetExample {
    public static void main(String[] args) {

        Set<Integer> mySet = new HashSet<>();
        mySet.add(70);
        mySet.add(75);
        mySet.add(800);
        mySet.add(60);
        mySet.add(800);
        mySet.add(55);
        mySet.add(45);
        mySet.add(75);
        mySet.add(1000);
        mySet.add(500);

        //it doesn't save same elements
        System.out.println(mySet); //hash code order you will see. you can use for lopp
        System.out.println(mySet.size());

        List<String> list = Arrays.asList("23", "23", "a", "a", "b", "bb", "jj", "q", "t", "t");
        System.out.println(list);


        Set<String> unique = new HashSet<>(list);
        System.out.println(unique);// you will see just unique elements

        TreeSet<Integer> tSet= new TreeSet<>();
        tSet.add(500);
        tSet.add(501);
        tSet.add(502);
        tSet.add(503);
        tSet.add(505);
        tSet.add(504);
        tSet.add(507);
        tSet.add(508);
        tSet.add(505);
        tSet.add(499);

        System.out.println(tSet);//duplicates are not allowed, you will see Integers in an order



    }
}
