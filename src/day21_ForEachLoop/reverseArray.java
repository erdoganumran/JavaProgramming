package day21_ForEachLoop;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {

        int [] numbers= {1,2,3,4,5,6,7,8,9,10};
        int [] reversedArray= new int[numbers.length];// it contains all the elements and make sure that the array has enoughh capacity to contain all the elements

        for (int i= numbers.length-1, j=0; i>=0; i--, j++){
        reversedArray[j]=numbers[i];//i 10 j 0 i 9 j 1 i 8 j 2... i 0 j 10
        }
        System.out.println(Arrays.toString(reversedArray));
    }
}
/*
	5.  Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};

 */