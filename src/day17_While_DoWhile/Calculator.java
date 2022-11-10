package day17_While_DoWhile;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first number:");
         int n = scan.nextInt();
        System.out.println("Enter your second number:");
        int n2 = scan.nextInt();


        System.out.println("Enter a math operator:");
        char c = scan.next().charAt(0);

        while(!(c == '-' || c== '+')) {// if the operator is invalid. here there is boolean like you see
            //we don't know how many times while will be executed, may be infinite times. we don,t know how many times that is why we use while
            //when this condition is invalid, while will not repeat it again
            System.out.println("Invalid Operator, please re-enter:");
            c = scan.next().charAt(0);
        }

        System.out.println((c== '+')? n+n2 : n-n2);

        scan.close();
    }
}
