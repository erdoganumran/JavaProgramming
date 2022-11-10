package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {
        String sentence= "Today is a good day to learn Java";
        String [] arr = sentence.split(" ");

        String reversed="";
        for (int i = arr.length-1; i>=0 ; i--) {
            reversed+= arr[i]+" ";
        }
        System.out.println(reversed);
    }
}
