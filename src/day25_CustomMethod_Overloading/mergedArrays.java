package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class mergedArrays {

    public static void main(String[] args) {

        int [] arr= merger(new int[]{1,2,3}, new int[]{4, 5, 6});
        System.out.println(Arrays.toString(arr));

        double [] arr1= merger(new double[]{1.0,2.0,3.0}, new double[]{4, 5, 6});
        System.out.println(Arrays.toString(arr1));

        char [] arr2= merger(new char[]{'p','2','k'}, new char[]{'h', '5', '6'});
        System.out.println(Arrays.toString(arr2));

        String [] arr3= merger(new String[]{"as","ad","aes"}, new String[]{"ags", "aqws", "asgf"});
        System.out.println(Arrays.toString(arr3));

    }

    public static int [] merger(int [] arr1, int[] arr2){
        int [] merged= new int[arr1.length+arr2.length];
        int i=0;
        for (int each:arr1){
            merged[i++]=each;
        }
        for (int each:arr2){
            merged[i++]=each;
        }
        return merged;

    }
    public static double [] merger(double [] arr1, double[] arr2){
        double [] merged= new double[arr1.length+arr2.length];
        int i=0;
        for (double each:arr1){
            merged[i++]=each;
        }
        for (double each:arr2){
            merged[i++]=each;
        }
        return merged;

    }
    public static char [] merger(char [] arr1, char[] arr2){
        char [] merged= new char[arr1.length+arr2.length];
        int i=0;
        for (char each:arr1){
            merged[i++]=each;
        }
        for (char each:arr2){
            merged[i++]=each;
        }
        return merged;

    }
    public static String [] merger(String [] arr1, String[] arr2){
        String [] merged= new String[arr1.length+arr2.length];
        int i=0;
        for (String each:arr1){
            merged[i++]=each;
        }
        for (String each:arr2){
            merged[i++]=each;
        }
        return merged;

    }
}
/*
Task1:
	1. create a method that can merge two integer arrays.

	2. create a method that can merge two double arrays.

	3. create a method that can merge two char arrays.

	4. create a method that can merge two String arrays.
 */