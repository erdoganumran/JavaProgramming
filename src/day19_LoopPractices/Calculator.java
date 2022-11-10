package day19_LoopPractices;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int a = scan.nextInt();
        System.out.println("enter a math operator");
        char operator = scan.next().charAt(0);// i dont have any spesific scan method for a char. next is for string
        // if i want to assign to a char  index zero char i will get like above
        if (!(operator == '+' || operator == '-')) {
            System.err.println("invalid operator");
            System.exit(0);// terminates the whole program
        }
        System.out.println("enter a number");
        int b = scan.nextInt();

        if (operator == '+') {
            System.out.println(a + b);
        } else {
            System.out.println(a - b);
        }
    }
}

