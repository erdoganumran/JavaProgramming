package day26_CustomMethodPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class ReversedArray2 {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
    }

    public static int [] reverse(int[] array) {
        int [] result={};

        for (int i = array.length - 1; i >= 0; i--) {
            result= ArraysUtility.addElement(result,array[i]);// everytime each element will be added to the result with add element method
        }
        return result;
    }

}
