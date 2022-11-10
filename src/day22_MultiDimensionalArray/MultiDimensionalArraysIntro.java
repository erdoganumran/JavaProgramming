package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArraysIntro {
    public static void main(String[] args) {
        //Syntax:int [][]int2D= new int[3][];// 3 is number of dimensional arrays

        String [] group1= {"joan", "joes", "james"};//index 0
        String [] group2= {"um", "es", "yas"};//index 1
        String [] group3= {"an", "jos", "jam"};//index 2

        String [][] groups = new String[3][];// index:0,1,2. 3 shows Number of one-dimensional arrays
        //[ first bracket: Indexes 1D arrays ] [ second bracket: Indexes of Elements ]
        groups[0]=group1;//index 0
        groups[1]=group2;//index 1
        groups[2]=group3;//index 2

       // System.out.println(Arrays.toString(group1)); this toString method is just for single dimensional arrays that is why itt will give hashcode
        System.out.println(Arrays.deepToString(groups));

        System.out.println("--------------------------------------------------------");
        //indesOfElements= 0,1,2     0,1,2    0,1,2,3,4
        int [][] numbers= {{1,2,3}, {4,5,6}, {7,8,9,10,11}};// if you know exact array numbers you can assign like this because we have two different types of index numbers
        //index numbers=      0,       1,        2

        // [][] two brackets mean is two-dimensional array
        //what you add your two-dimensional array they must be one dimensional array

        int [] i={1,2,3,4};
        int []b= {5,6,7};
        int []c={8,9,10,11};
        int [][] array2D= {i,b,c};
        System.out.println(Arrays.deepToString(array2D));//[[1, 2, 3, 4], [5, 6, 7], [8, 9, 10, 11]]

        System.out.println(Arrays.toString(array2D[1]));//[5, 6, 7] cuz i just retrieve just one array

        System.out.println(array2D[2][3]);//11// first bracket will search for array number 2, second compiler will be shown 3th element of 2nd array








    }
}
//String [] group1= {"joan", "joes", "james"};