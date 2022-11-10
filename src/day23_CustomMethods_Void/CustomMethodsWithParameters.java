package day23_CustomMethods_Void;

public class CustomMethodsWithParameters {

    public static void main(String[] args) {

       // oddOrEven();// if it is giving compiler error, it means the method demand additional info to complete its task
        oddOrEven(20);// because it was int.  number is parameter name. this argument will be assigned to the number variable

        System.out.println("----------------------------------------------");

        age(1988);//1988 is argument here. this argument will be assigned to the perimeter

        System.out.println("-----------------------------------------------");

        printNumber(50,100);


    }


    public static void oddOrEven(int number) {// this value only wil be given when you call it. it can be any integer

        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        } else {
            System.out.println(number + " is odd number");
        }


    }


    public static void age(int birthYear){// we must have age information
        int age= 2021-birthYear;
        System.out.println("your age is "+ age);
    }

    public static void printNumber(int x,int y) {
        for (int i=x;i<=y;i++){
            System.out.print(i+" ");
        }
    }


}
//void means nothing. main does not return a value.

