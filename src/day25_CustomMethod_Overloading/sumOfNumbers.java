package day25_CustomMethod_Overloading;

public class sumOfNumbers {
    public static void main(String[] args) {

        System.out.println("sum = "+ sumOfNumbers(4,5));
        int sum=sumOf3Numbers(10,20,30);
        System.out.println("sum2 = " + sum);
        int sum3=sumOf4Numbers(10,20,30,40);
        System.out.println("sum3 = " + sum3);

    }

    public static int sumOfNumbers(int a, int b){
// parameter is must have information.--> int a, int b
        return a+b;
    }

    public static int sumOf3Numbers(int a, int b, int c){
// parameter is must have information.--> int a, int b,c
        return a+b+c;
    }

    public static int sumOf4Numbers(int a, int b, int c, int d){
// parameter is must have information.--> int a, int b,c,d
        return a+b+c+d;
    }


}

