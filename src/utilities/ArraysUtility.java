package utilities;

import java.util.Arrays;

public class ArraysUtility {

    //printss each integer of an integer array in separate lines
    public static void printEachElement(int[] array) {
        for (int each : array) {
            System.out.println(each);
        }
    }

    //prints each double of a double array in separate lines
    public static void printEachElement(double[] array) {
        for (double each : array) {
            System.out.println(each);
        }
    }

    //prints each char of a char array in separate lines
    public static void printEachElement(char[] array) {
        for (char each : array) {
            System.out.println(each);
        }
    }

    //prints each string of a string array in separate lines
    public static void printEachElement(String[] array) {
        for (String each : array) {
            System.out.println(each);
        }
    }

    //returns the max number from an integer array
    public static int maxNumber(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    //return the min number from an integer array
    public static int minNumber(int[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }

    //return the max number from a double array
    public static double maxNumber(double[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    //return the min number from an integer array
    public static double minNumber(double[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }

    //checks if the given integer is contained int the given array, return boolean
    public static boolean contains(int[] arr, int element) {
        boolean result = false;
        for (int each : arr) {
            if (each == element) ;
            result = true;
        }
        return result;
    }

    //checks if the given double is contained int the given array, return boolean
    public static boolean contains(double[] arr, double element) {
        boolean result = false;
        for (double each : arr) {
            if (each == element) ;
            result = true;
        }
        return result;
    }

    //checks if the given char is contained int the given char array, return boolean
    public static boolean contains(char[] arr, char element) {
        boolean result = false;
        for (char each : arr) {
            if (each == element) ;
            result = true;
        }
        return result;
    }

    //checks if the given String is contained int the given String array, return boolean
    public static boolean contains(String[] arr, String element) {
        boolean result = false;
        for (String each : arr) {
            if (each.equals(element)) ;
            result = true;
        }
        return result;
    }

    //adds the given element to array, return a new array
    public static int[] addElement(int[] array, int a) {

        int[] arr1 = new int[array.length + 1];
        int i = 0;
        for (int each : array) {
            arr1[i++] = each;
        }
        arr1[i] = a;
        return arr1;

    }

    //adds the given element to array, return a new array
    public static double[] addElement(double[] array, double b) {

        double[] arr = new double[array.length + 1];
        int i = 0;
        for (double each : array) {
            arr[i++] = each;
        }
        arr[i] = b;
        return arr;


    }

    //adds the given element to array, return a new array
    public static String[] addElement(String[] array, String c) {

        String[] arr = new String[array.length + 1];
        int i = 0;
        for (String each : array) {
            arr[i++] = each;
        }
        arr[i] = c;
        return arr;

    }

    //adds the given element to array, return a new array
    public static char[] addElement(char[] array, char d) {

        char[] arr = new char[array.length + 1];
        int i = 0;
        for (char each : array) {
            arr[i++] = each;
        }
        arr[i] = d;
        return arr;

    }

    public static int frequencyOfElement(int[] array, int element) {
        int count = 0;
        for (int each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }

    //return the frequency of the given element from the given array
    public static int frequencyOfElement(double[] array, double element) {
        int count = 0;
        for (double each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }

    //return the frequency of the given element from the given array
    public static int frequencyOfElement(char[] array, char element) {
        int count = 0;
        for (char each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }

    //return the frequency of the given element from the given array
    public static int frequencyOfElement(String[] array, String element) {
        int count = 0;
        for (String each : array) {
            if (each.equals(element)) {
                count++;
            }
        }
        return count;
    }


    //return the unique elements of the array as a new array
    public static int[] uniqueElements(int[] array) {
        int[] result = {};

        for (int each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {

                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;

    }

    //return the unique elements of the array as a new array
    public static double[] uniqueElements(double[] array) {
        double[] result = {};
        for (double each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);

            }
        }
        return result;

    }

    //return the unique elements of the array as a new array
    public static char[] uniqueElements(char[] array) {
        char[] result = {};
        for (char each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);

            }
        }
        return result;

    }

    //return the unique elements of the array as a new array
    public static String[] uniqueElements(String[] array) {
        String[] result = {};
        for (String each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);

            }
        }
        return result;

    }


    //removes index from the array, returns a new array
    public static int[] removeElements(int[] array, int index) {
        int[] arr = new int[array.length - 1];

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
            arr[j++] = array[i];
        }
        return arr;

    }

    //removes index from the array, returns a new array
    public static char[] removeElements(char[] array, int index) {
        char[] arr = new char[array.length - 1];

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
            arr[j++] = array[i];
        }
        return arr;

    }

    //removes index from the array, returns a new array
    public static String[] removeElements(String[] array, int index) {
        String[] arr = new String[array.length - 1];

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
            arr[j++] = array[i];
        }
        return arr;

    }

    //removes index from the array, returns a new array
    public static double[] removeElements(double[] array, int index) {
        double[] arr = new double[array.length - 1];

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
            arr[j++] = array[i];
        }
        return arr;

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

    //reverses the given array, returns a new array
    public static int[] reverse(int[] array) {
        int[] result = new int[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }
        return result;
    }

    //reverses the given array, returns a new array
    public static double[] reverse(double[] array) {
        double[] result = new double[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }
        return result;
    }

    //reverses the given array, returns a new array
    public static char[] reverse(char[] array) {
        char[] result = new char[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }
        return result;
    }

    //reverses the given array, returns a new array
    public static String[] reverse(String[] array) {
        String[] result = new String[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }
        return result;
    }

    //replace the elements of the array at given index with the new element
    public static int[] replace(int[]array, int index, int element){
        if(index<0 || index>= array.length){
            System.out.println("Invalid index number!");
            System.exit(0);
        }
        array[index]=element;

        return array;
    }
    //replace the elements of the array at given index with the new element
    public static double[] replace(double[]array, int index, double element){
        if(index<0 || index>= array.length){
            System.out.println("Invalid index number!");
            System.exit(0);
        }
        array[index]=element;

        return array;
    }
    //replace the elements of the array at given index with the new element
    public static char[] replace(char[]array, int index, char element){
        if(index<0 || index>= array.length){
            System.out.println("Invalid index number!");
            System.exit(0);
        }
        array[index]=element;

        return array;
    }
    //replace the elements of the array at given index with the new element
    public static String[] replace(String[]array, int index, String element){
        if(index<0 || index>= array.length){
            System.out.println("Invalid index number!");
            System.exit(0);
        }
        array[index]=element;

        return array;
    }

    //replaces all the matching old values of the array with a new value
    public static int[] replaceAll(int[] array, int oldElement, int newElement){

        for (int i = 0; i < array.length; i++) {
            if(array[i]==oldElement){array[i]=newElement;}
        }
        return array;
    }
    //replaces all the matching old values of the array with a new value
    public static double[] replaceAll(double[] array, double oldElement, double newElement){

        for (int i = 0; i < array.length; i++) {
            if(array[i]==oldElement){array[i]=newElement;}
        }
        return array;
    }
    //replaces all the matching old values of the array with a new value
    public static char[] replaceAll(char[] array, char oldElement, char newElement){

        for (int i = 0; i < array.length; i++) {
            if(array[i]==oldElement){array[i]=newElement;}
        }
        return array;
    }
    //replaces all the matching old values of the array with a new value
    public static String[] replaceAll(String[] array, String oldElement, String newElement){

        for (int i = 0; i < array.length; i++) {
            if(array[i].equals(oldElement)){array[i]=newElement;}
        }
        return array;
    }


    //removes the duplicates from the given array, returns the new array
    public static int[] removeDuplicates(int[] array){

        int[] result = {};

        for (int each : array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }
    //removes the duplicates from the given array, returns the new array
    public static double[] removeDuplicates(double[] array){

        double[] result = {};

        for (double each : array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }
    //removes the duplicates from the given array, returns the new array
    public static char[] removeDuplicates(char[] array){

        char[] result = {};

        for (char each : array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }
    //removes the duplicates from the given array, returns the new array
    public static String[] removeDuplicates(String[] array){

        String[] result = {};

        for (String each : array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }




}



//44

