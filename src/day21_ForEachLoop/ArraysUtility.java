package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {
        int [] nums= {1,2,3,4,5};// every caharacter is called an element 1 is an element 2 is an element...
        System.out.println(Arrays.toString(nums));// it always converts to a string "[1, 2, 3, 4, 5]" .this toString method implicitly called for every single object
        //System.out.println(nums);if it is array it wont be called implicitly. it will give hashcode


        System.out.println("-----------------------------------------");

        int []scores= {95,100, 60,45, 50};
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));
        System.out.println("minimum score :"+ scores[0]);
        System.out.println("minimum score :"+ scores[scores.length-1]);

        System.out.println("------------------------------------------");
        String [] names= {"umran", "EREN", "Ahmet", "zuhal", "mehmet"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        System.out.println("-------------------------------");

        int [] arr1={1,2,3};
        int [] arr2= {1,3,2};
        boolean r1= Arrays.equals(arr2,arr1);//false
        System.out.println(r1);


        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean r2= Arrays.equals(arr2,arr1);//true
        System.out.println(r2);

        System.out.println("--------------------------------------------");

        char[] ch1= {'a', 'b', 'c'};
        char[] ch2= {'c', 'a', 'b'};

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean anagram = Arrays.equals(ch1, ch2);
        System.out.println("this are anagram " + anagram);//true






    }
}
