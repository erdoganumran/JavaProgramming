package day26_CustomMethodPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {

        int[] array={1,1,3,3,4,5,3,4,7,1,8};
        int []unique=uniqueElements(array);
        System.out.println(Arrays.toString(unique));

    }


    //return the unique elements of the array as a new array
    public static int[] uniqueElements(int[] array){
        int [] result={};// this is temporary array. we don't know the length.
        // length is 0 now. the length is not change at below i just assign this array to a new array

        for(int each:array){
            if (ArraysUtility.frequencyOfElement(array, each)==1){// for each element, every iteration it will count each of the elements freq here
                //if freq ==1 for first ellement result= each
                //for second iteration it will count second element of array, if it is 1, result wil be added old result
            result=ArraysUtility.addElement(result,each);
            //but if the size is fixed how we can add a new element, check add element method
// every time each will be added to the result array
                // i assgined it again and again because array size is fixed
            }
        }
        return result;

    }
    //return the unique elements of the array as a new array
    public static double[] uniqueElements(double[] array){
        double [] result={};
        for(double each:array){
            if (ArraysUtility.frequencyOfElement(array, each)==1){
                result=ArraysUtility.addElement(result,each);

            }
        }
        return result;

    }
    //return the unique elements of the array as a new array
    public static char[] uniqueElements(char[] array){
        char [] result={};
        for(char each:array){
            if (ArraysUtility.frequencyOfElement(array, each)==1){
                result=ArraysUtility.addElement(result,each);

            }
        }
        return result;

    }
    //return the unique elements of the array as a new array
    public static String[] uniqueElements(String[] array){
        String [] result={};
        for(String each:array){
            if (ArraysUtility.frequencyOfElement(array, each)==1){
                result=ArraysUtility.addElement(result,each);

            }
        }
        return result;

    }

}
