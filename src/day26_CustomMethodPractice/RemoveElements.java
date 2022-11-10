package day26_CustomMethodPractice;

import java.util.Arrays;

public class RemoveElements {

    public static void main(String[] args) {
        int[]numbers={100,200,300,400,500,600};
        numbers= removeElements(numbers,3);
        System.out.println(Arrays.toString(numbers));

    }
    //removes index from the array, returns a new array
    public static int[] removeElements(int [] array, int index){
        int [] arr= new int[array.length-1];

        if(index<0||index> array.length-1){
            System.err.println("Invalid index: "+ index);
            System.exit(0);
        }
        int j=0;
        for (int i=0; i<array.length ;i++){
            if (i==index){
            continue;}
            arr[j++]=array[i];
        }
        return arr;

    }
    //removes index from the array, returns a new array
    public static char[] removeElements(char [] array, int index){
        char [] arr= new char[array.length-1];

        if(index<0||index> array.length-1){
            System.err.println("Invalid index: "+ index);
            System.exit(0);
        }
        int j=0;
        for (int i=0; i<array.length ;i++){
            if (i==index){
                continue;}
            arr[j++]=array[i];
        }
        return arr;

    }

    //removes index from the array, returns a new array
    public static String[] removeElements(String [] array, int index){
        String [] arr= new String[array.length-1];

        if(index<0||index> array.length-1){
            System.err.println("Invalid index: "+ index);
            System.exit(0);
        }
        int j=0;
        for (int i=0; i<array.length ;i++){
            if (i==index){
                continue;}
            arr[j++]=array[i];
        }
        return arr;

    }
    //removes index from the array, returns a new array
    public static double[] removeElements(double [] array, int index){
        double [] arr= new double[array.length-1];

        if(index<0|| index > array.length-1){
            System.err.println("Invalid index: "+ index);
            System.exit(0);
        }
        int j=0;
        for (int i=0; i<array.length ;i++){
            if (i==index){
                continue;}
            arr[j++]=array[i];
        }
        return arr;

    }




}
/*
	2. Create a class named RemoveElements:
			2.1 Create a method that passes two parametetrs: an integer array and an integer index. the method removes the element at the given index of the array and returns the new array
					Ex:
						int[] arr = {10,20,30,40}
						removeElement(arr, 2) ==> {10, 20, 40}

			2.2 Create a method that passes two parametetrs: a double array and an integer index. the method removes the element at the given index of the array and returns the new array


			2.3 Create a method that passes two parametetrs: a char array and an integer index. the method removes the element at the given index of the array and returns the new array

			2.4 Create a method that passes two parametetrs: a String array and an integer index. the method removes the element at the given index of the array and returns the new array


 */