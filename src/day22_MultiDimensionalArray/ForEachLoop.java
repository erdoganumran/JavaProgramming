package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int [][] arr2D= {{1,2,3}, {4,5,6,7,8}, {9,10,11,12,13}};

        for (int[] ints : arr2D) {
            System.out.println(Arrays.toString(ints));// [1, 2, 3]... etc
            for (int each : ints) {// you can use for each loop if you want to print in a regular order
                System.out.println(each); //1//2//3//4//,.....
            }
            }
        }
    }

