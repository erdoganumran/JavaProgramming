package day15_ForLoop;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        int max= -2147483648;// this smallest integer number we can assign
        //any user entered number will be greater then -214748..  it is just temporary value

        for (int i = 1; i <=5; i++) {
            System.out.println("Enter a number:");
            int num = scan.nextInt();

            if (num>max) {max=num;}// I want to repeat this condition several times to find the max num
        }
        System.out.println(max);
    }
}
