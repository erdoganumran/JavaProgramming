package day22_MultiDimensionalArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class IteratingMultiDimensionalArrays2 {
    public static void main(String[] args) {
        int [][] arr2D= {{1,2,3}, {4,5,6,7,8}, {9,10,11,12,13}};

        for (int i = arr2D.length-1; i >=0 ; i--) {//shortcut for reversing name.forr
            //*i: is representing of index of each array number

            for (int i1 = 0; i1 < arr2D.length; i1++) {// i1 respresent of index number of each element
                System.out.print(arr2D[i][i1]+ " ");// 9 10 11
            }
            System.out.println();
            System.out.println(Arrays.toString(arr2D[i]));//[9, 10, 11, 12, 13]

            }

        System.out.println("----------------------------------------------------------");

        for (int i = 0; i < arr2D.length; i++) {
            for (int i1 = arr2D[i].length - 1; i1 >= 0; i1--) {
                System.out.print(arr2D[i][i1]+ " ");//3 2 1 // 8 7 6 5 4...
            }
            System.out.println();
        }


        }

    }

