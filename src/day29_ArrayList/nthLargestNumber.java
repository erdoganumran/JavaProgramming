package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class nthLargestNumber {
    public static void main(String[] args) {

        ArrayList<Integer> numbers= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7, 7 ,8, 8,1,5));
        int n=3; //sout 6


        for (int i = 1; i < n; i++) {
            numbers.removeIf(p-> p==Collections.max(numbers));
        }
        int max= Collections.max(numbers);
        System.out.println(max);

    }
}
/*

1. write a program that can return the nth largest number from an arraylist

			arraylist = {1,2,3,4,5,6,7, 7 ,8, 8}
			n = 5

			output:
				4
 */