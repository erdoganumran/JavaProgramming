package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class addElementsToArray {
    public static void main(String[] args) {

        //int [] newInt= addInteger(new int[]{1, 2, 3, 4, 5}, 6);
        //System.out.println(Arrays.toString(newInt));

        int [] array= {1, 2, 3, 4, 5};
        array= addInteger(array,6);
        System.out.println(Arrays.toString(array));



        double [] newDouble= addDouble(new double[]{1.0, 2.0, 3, 4.0, 5.0}, 6.0);
        System.out.println(Arrays.toString(newDouble));

        String [] array3= {"ali", "burak", "can", "didem"};
        array3= addString(array3,"emre");
        System.out.println(Arrays.toString(array3));


        //array4 ve d verilmesi lazim./ return is arr4 d ve array4 e gore tanimlanmis

        //System.out.println(addChar(new char[]{'a', 'b', 'c'}, 'd'));--> bu sekilde de dogru sonucu basiyor ama asagidaki sekilde arrayi tekrar kullanabiliyoruz

        char []array4= {'a', 'b', 'c', 'd'};
        array4=addChar(array4,'e'); //addChar methodu ile birlikte array4 u daha buyuk bir arraya atamis olduk, yeni bir array olusmus oldu.
        System.out.println(Arrays.toString(array4));


    }
    public static int[] addInteger(int[] array, int a){

        int [] arr= new int[array.length+1];
        int i=0;
        for(int each:array){
            arr[i++]=each;
        }
        arr[i]=a;
        return arr;

    }

    public static double[] addDouble(double[]array2, double b){

        double [] arr2= new double[array2.length+1];
        int i=0;
        for(double each:array2){
            arr2[i++]=each;
        }
        arr2[i]=b;
        return arr2;


    }

    public static String[] addString(String [] array3, String c){

        String [] arr3= new String[array3.length+1];
        int i=0;
        for(String each:array3){
            arr3[i++]=each;
        }
        arr3[i]=c;
        return arr3;

    }//ctrl+r will change all the variable data type to a new data type at the chosen highlighted lines

    public static char[] addChar(char[] array4, char d){

        char [] arr4= new char[array4.length+1];
        int i=0;
        for(char each:array4){
            arr4[i++]=each;
        }
        arr4[i]=d;
        return arr4;

    }






}
/*
		1. create a return method called addInteger that can add an Inteeger  after the  last index of an integer array

					{1,2,3,4}, 5
					new array ==> {1,2,3,4,5}

	    2. create a return method called addDouble that can add a double after the last index of a double array

	    3. create a return method called addString that can add a String after the last index of a String array

	    4. create a return method called addChar that can add a char after last index of a char array

 */