package day15_ForLoop;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        int min= 2147483647;// biggest int number we can assign
        for (int i = 0; i <5; i++) {
            System.out.println("Enter a number:");
            int num = scan.nextInt();

            if (num<min) {min=num;}// it will repeat this condition 5 times
        }
        System.out.print(min);

        scan.close();
    }
}
