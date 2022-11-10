package day21_ForEachLoop;

import java.util.Arrays;

public class MergeToArrays {
    public static void main(String[] args) {
        int []arr1 = {1,2,3,4};
        int []arr2 = {5,6};
        int []arr4={7,8,9};
        int [] arr3= new int[arr2.length+ arr1.length+arr4.length];

        int i=0;
        for (int each:arr1){// it will repeat this. this loop arr1 times and for each element of arr1 it will assign every each
            arr3[i++]= each;//here i will increase 3 times. each means here every elements of arr1.
        }
        for (int each:arr2){// here i will be 3
            arr3[i++]=each;
        }
        for (int each:arr4){
            arr3[i++]=each;
        }
        System.out.println(Arrays.toString(arr3));
        System.out.println("--------------------------------------------");


        String []a={"umran", "gulle"};
        String []b={"eren", "erdogan"};
        String[]c= new String[a.length+b.length];
        int in=0;
        for (String each:a){
            c[in++]=each;
            //or in++ you also can write like this
        }
        for (String each:b){
            c[in++]=each;
        }
        System.out.println(Arrays.toString(c));






        /*for (int i = 0; i < arr1.length; i++) {
           arr3[i]=arr1[i];
        }
        for (int j = arr1.length, i=0; j < (arr2.length+ arr1.length); j++, i++) {
           arr3[j]=arr2[i];
        }

        System.out.println(Arrays.toString(arr3));*/

    }
}
/*


Task
  1. write a program that can merge two arrays of integers
		Ex:
			arr1 = {1,2,3,4}
			arr2 = {5,6}

		output
			arr3 = {1,2,3,4,5,6}

 */