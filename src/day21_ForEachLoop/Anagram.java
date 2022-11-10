package day21_ForEachLoop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1= "abcd";
        String str2="dabc";

        char [] array1= str1.toCharArray();
        Arrays.sort(array1);
        char[] array2= str2.toCharArray();
        Arrays.sort(array2);
        boolean a= Arrays.equals(array1,array2);
        if(a){
            System.out.println("this is an anagram!");}

    }
}
