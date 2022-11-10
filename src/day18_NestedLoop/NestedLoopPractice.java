package day18_NestedLoop;

import java.util.Scanner;

public class NestedLoopPractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("enter your age:");
            int age = scan.nextInt();

            while (age < 0 || age > 120) {
                System.err.println("invalid entry! please re enter your age:");
                age = scan.nextInt();
            }

            System.out.println("would you like to continue?");
            String ans = scan.next().toLowerCase();

            while (!(ans.equals("yes") || ans.equals("no"))) {
                System.out.println("Invalid entry! please re enter your answer");
                ans = scan.next().toLowerCase();
            }

            if (ans.equals("no")) {
                break;
            }
        }


    }
}
