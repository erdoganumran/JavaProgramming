package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class MethodOverloading {

    public static void main(String[] args) {

        int[] intArray={5,6,7,0,-1,-2,-3};
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));


        double[] doubleArray={4.0,10.0,5,0, 6.0,11.0,8.0};
        Arrays.sort(doubleArray);// this sort methods have similar functionality

        char[] charArray={'a','b','c','d','e'};
        Arrays.sort(charArray);

        int sum=sumOfNumbers(5,10);
        int sum2= sumOfNumbers(5,10,15);
        int sum3= sumOfNumbers(5,10,15,20);

        double sum4= sumOfNumbers(18.0,2.0);
        double sum5= sumOfNumbers(10.0, 7.0, 5.0);
        double sum6= sumOfNumbers(10.0, 7.0, 6.0,5.0);
    }

    public static int sumOfNumbers(int a, int b){//they all have same method name but they are different methods
        return a+b;
    }
    public static int sumOfNumbers(int a, int b,int c){
        return a+b+c;
    }
    public static int sumOfNumbers(int a, int b, int c, int d){
        return sumOfNumbers(a,b)+sumOfNumbers(c,d);//--> this is another way to return the data
    }

    public static double sumOfNumbers(double a, double b){
        return a+b;
    }
    public static double sumOfNumbers(double a, double b, double c){
        return a+b+c;
    }
// if they have same method name and same parameters it will give compile error
//you can overload the method infinite times. data type or parameters should be different
    public static double sumOfNumbers(double a, double b, double c, double d){
        return sumOfNumbers(a,b,c)+d;
    }




}
