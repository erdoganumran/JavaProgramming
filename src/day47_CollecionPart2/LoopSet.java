package day47_CollecionPart2;

import java.util.HashSet;
import java.util.Set;

public class LoopSet {
    public static void main(String[] args) {
        Set<Integer> mySet = new HashSet<>();
        mySet.add(70);
        mySet.add(60);
        mySet.add(800);
        mySet.add(55);
        mySet.add(45);
        mySet.add(75);
        mySet.add(1000);
        mySet.add(500);

        for (Integer integer : mySet) {
            System.out.print(integer+"|");
        }
        System.out.println();

        //for each/lambda
        mySet.forEach(n-> System.out.print(n+"|"));


    }
}