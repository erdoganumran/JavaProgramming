package BootCamp.day1;
import java.util.Arrays;

public class CustomMethods <T>{

    public T max(T[] arr){//T is dynamic. It can be dynamic, Integer, String etc.
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    public void reverse(T[] arr){//T is dynamic. It can be dynamic, Integer, String etc.

        T[] array= (T[]) new Object[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        CustomMethods<Integer> intARyyas= new CustomMethods<>();

        //when I create an object from this T class I have to specify the object type
        Integer [] arr= {1,2,3,4,5,6,7,8,9,10};
        System.out.println(intARyyas.max(arr));
        intARyyas.reverse(arr);


        System.out.println("-----------------");
        String str1 = "Cybertek";

        System.out.println(  reverse(str1) );

        String str2 = "School";

        System.out.println( reverse(str2) );

        String str3 = "Java";

        System.out.println( reverse( str3) );


        String str4 = "Anna";

        System.out.println(  isPalindrome(str3) );


    }


    public static String reverse(String str){
        String reverse = "";
        for(int i =str.length()-1; i >=0; i-- ){
            reverse += str.charAt(i);
        }
        return reverse;
    }

    public static boolean isPalindrome(String str){
        String reverse = reverse(str);
        return str.equalsIgnoreCase(reverse);
    }


    public static int min(int[] arr){
        Arrays.sort(arr);
        return arr[0];
    }

    public static double min(double[] arr){
        Arrays.sort(arr);
        return arr[0];
    }



}




class A{


    public static void main(String[] args) {
        System.out.println("String array");
    }

    public static void main(int[] arg){
        System.out.println("int array");
    }

    public static void main(String arg){
        System.out.println("String");
    }






}