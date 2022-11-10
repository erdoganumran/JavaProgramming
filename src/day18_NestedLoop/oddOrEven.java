package day18_NestedLoop;

import java.util.Scanner;

public class oddOrEven {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        while (true) {
            System.out.println("enter your number");
            int n= scan.nextInt();

            if(n%2==0){
                System.out.println("even number");
            }
            else {
                System.out.println("odd number");
            }

            System.out.println("Would you like to enter another number");
            String ans= scan.next().toLowerCase();

            while (!(ans.equals("no") || ans.equals("yes"))){
                System.out.println("invalid answer");
                System.out.println("Would you like to enter another number");
                ans= scan.next().toLowerCase();
            }
            if (ans.equals("no")){
                break;
            }

        }

    }
}
/*
2. Write a program that asks user to enter a number , and check if the number is odd or even.
        if it's odd, print "Odd Number"
        if it's even, print "Even number"

        Ask the user "Would you like to enter another number"
                if user enters yes, repeat the previous steps
                if user enters no, print nothing

                If user enteres invalid answer, repeat the previous steps

 */