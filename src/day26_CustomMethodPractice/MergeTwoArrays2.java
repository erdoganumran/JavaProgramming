package day26_CustomMethodPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class MergeTwoArrays2 {
    public static void main(String[] args) {

        int[]arr1={1,2,3,4};
        int[]arr2={5,6,7,8};
        System.out.println(Arrays.toString(merge(arr1,arr2)));


    }
    //merges the given two arrays and returns the new array
    public static int[] merge(int[] arr1, int[] arr2) {

        int[] result = {};
        for (int i : arr1) {
            result = ArraysUtility.addElement(result, i);
        }
        for (int i : arr2) {
            result = ArraysUtility.addElement(result, i);
        }
        return result;
    }

    //merges the given two arrays and returns the new array
    public static double[] merge(double[] arr1, double[] arr2) {

        double[] result = {};
        for (double i : arr1) {
            result = ArraysUtility.addElement(result, i);
        }
        for (double i : arr2) {
            result = ArraysUtility.addElement(result, i);
        }
        return result;
    }

    //merges the given two arrays and returns the new array
    public static char[] merge(char[] arr1, char[] arr2) {

        char[] result = {};
        for (char i : arr1) {
        result = ArraysUtility.addElement(result, i);
        }
        for (char i : arr2) {
        result = ArraysUtility.addElement(result, i);
        }
        return result;
        }
    //merges the given two arrays and returns the new array
    public static String[] merge(String[] arr1, String[] arr2) {

        String[] result = {};
        for (String i : arr1) {
            result = ArraysUtility.addElement(result, i);
        }
        for (String i : arr2) {
            result = ArraysUtility.addElement(result, i);
        }
        return result;
    }


}

        
        
