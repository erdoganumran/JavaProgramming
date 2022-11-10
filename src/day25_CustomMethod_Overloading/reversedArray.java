package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class reversedArray {


    public static void main(String[] args) {

        int[] RevInt= reversedArray(new int[]{4, 6, 8, 10, 20, 4, 40, 7, 30});
        double[] RevDouble=reversedArray(new double[]{4.0,6.0,8.0,10.0,20.0,4.0,40.0,7.0,30.0});
        char[] RevChar=reversedArray(new char[]{'h', '5', '6'});
        String[] RevStr=reversedArray(new String[]{"ak", "um","why"});

        System.out.println("RevStr = " + Arrays.toString(RevStr));
        System.out.println("RevDouble = " + Arrays.toString(RevDouble));
        System.out.println("RevChar = " + Arrays.toString(RevChar));
        System.out.println("RevStr = " + Arrays.toString(RevStr));

    }
    public static int [] reversedArray(int[] arr) {
        int j= arr.length-1;
        int [] newArr= new int[arr.length];
        for (int each: arr){
            newArr[j--]=each;
        }
        return newArr;
    }
    public static double [] reversedArray(double[] arr) {
        int j= arr.length-1;
        double [] newArr= new double[arr.length];
        for (double each: arr){
            newArr[j--]=each;
        }
        return newArr;
    }
    public static char [] reversedArray(char[] arr) {
       int j= arr.length-1;
        char [] newArr= new char[arr.length];
        for (char each: arr){
            newArr[j--]=each;
        }
        return newArr;
    }
    public static String [] reversedArray(String[] arr) {
        int j= arr.length-1;
        String [] newArr= new String[arr.length];
        for (String each: arr){
            newArr[j--]=each;
        }
        return newArr;
    }

}
/*
Task 4:
	1. Create a method that can reverse an integer array

	2. Create a method that can reverse a double array

	3. Create a method that can reverse a char array

	4. Create a method that can reverse a String array
 */