package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrays2 {
    public static void main(String[] args) {
        int[]arr1D={1,2,3};
        int [][] arr2D= {{1,2,3}, {4,5,6,7,8}, {9,10,11,12,13}};
        int [][][]arr3D= {  {{1,2,3}, {4,5,6,7,8}, {9,10,11,12,13}},  {{1,2,3}, {4,5,6,7,8}, {9,10,11,12,13}} };
//     index for for 2 dimensional arrays    0                                          1
//index num for each 1 din.     0            1             2               0         1                 2
        //3 Dimensional array contains 2 dimensional array
        //we have three types of index number
        System.out.println(Arrays.deepToString(arr3D));// whole 3d array
        System.out.println(Arrays.deepToString(arr3D[0]));// 0. 2d array [[1, 2, 3], [4, 5, 6, 7, 8], [9, 10, 11, 12, 13]]
        System.out.println(Arrays.toString(arr3D[0][0]));//spesific 1d array [1, 2, 3]
        System.out.println(arr3D[0][0][0]);// spesific element 1

        for (int [][]each2d:arr3D){
            for (int[]each1D:each2d){
                for (int element:each1D){
                    System.out.println(element);
                }
            }
        }

        System.out.println("--------------------------------------------------------------");

        int [][][][] arr4D= {    {{{1,2,3}, {4,5,6,7,8}}, {{9,10,11,12,13},{1,2,3}}} ,  {{{9,10,11,12,13},{1,2,3}}, {{70,80,80},{67,87,90}}}  };

        System.out.println(arr4D[1][1][1][1]);//87
        for (int[][][] ints : arr4D) {// we need 4 for each loop //for each 3 th dim array
            for (int[][] anInt : ints) {//for each 2 th dim array in each 3 dim array
                for (int[] ints1 : anInt) {//for 1 dim array
                    for (int i : ints1) {// for element
                        System.out.println(i);
                    }

                }

            }

        }
    }
}
