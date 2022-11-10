package day22_MultiDimensionalArray;

import java.util.Arrays;

public class IteratingMultiDimensionalArray {
    public static void main(String[] args) {

        int [][] arr2D= {{1,2,3}, {4,5,6}, {7,8,9,10,11}};

        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {//j is index number of elements
                System.out.print(arr2D[i][j]+ " ");// it will show each element of every array one by one
            }// i: index number of single dimensional arrays
            System.out.println();
            //System.out.println(Arrays.toString(arr2D[i]));// it will show arrays in the separate lines

        }
    }
}
