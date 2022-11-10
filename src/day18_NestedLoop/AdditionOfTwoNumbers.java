package day18_NestedLoop;

import java.util.Scanner;

public class AdditionOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        while(true) {

            System.out.println("enter you first number:");
            int a = scan.nextInt();
            System.out.println("enter you second number:");
            int b = scan.nextInt();
            System.out.println("addition: " + (a+b));

            System.out.println("would you like to continue?");
            String s= scan.next().toLowerCase();

            while (!(s.equals("yes") || s.equals("no"))){// if this inner loop stop, outer loop will continue
                System.out.println("invalid entry, please re enter:");
                s= scan.next().toLowerCase();
            }

            if(s.equals("no")) {break;// exits the outer loop
            }
            }
        scan.close();
        }


    }

