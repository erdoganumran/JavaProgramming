package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class addElementsToArray_Overloading {
    public static void main(String[] args) {

        int [] numbers={1,2,3,4};
        numbers= addElement(numbers,7);// it returns to a new array. if it gives me array value (addElement method); I can assign to an array variable which is numbers here
        System.out.println(Arrays.toString(numbers));
        double[] nums= {10.0,12.0,14.0, 9};// 9 will return double
        nums = addElement(nums, 10.0);
        System.out.println(Arrays.toString(nums));
        String [] str= {"ak", "um","why"};
        str= addElement(str,"lkl");
        System.out.println(Arrays.toString(str));
        char [] ch= {'a', 'b', 'c', 'd'};
        ch= addElement(ch, 'k');
        System.out.println(Arrays.toString(ch));

    }

    public static int[] addElement(int[] array, int a){

        int [] arr1= new int[array.length+1];
        int i=0;
        for(int each:array){
            arr1[i++]=each;
        }
        arr1[i]=a;
        return arr1;

    }

    public static double[] addElement(double[]array2, double b){

        double [] arr2= new double[array2.length+1];
        int i=0;
        for(double each:array2){
            arr2[i++]=each;
        }
        arr2[i]=b;
        return arr2;


    }

    public static String[] addElement(String [] array3, String c){

        String [] arr3= new String[array3.length+1];
        int i=0;
        for(String each:array3){
            arr3[i++]=each;
        }
        arr3[i]=c;
        return arr3;

    }//ctrl+r will change all the variable data type to a new data type at the chosen highlighted lines

    public static char[] addElement(char[] array4, char d){

        char [] arr4= new char[array4.length+1];
        int i=0;
        for(char each:array4){
            arr4[i++]=each;
        }
        arr4[i]=d;
        return arr4;

    }



}
