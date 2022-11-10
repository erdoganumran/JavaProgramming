package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class medianNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("How many number do you want to enter?");
        int time= scan.nextInt();
        int []numbers = new int[time];

        int sub=0;

        for (int i = 0; i < time; i++) {
            System.out.println("enter your number:");
            numbers[i]= scan.nextInt();
            sub+=numbers[i];
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("average is " + (sub/time));
    }
}
/*
	4. AverageNumber:
			1. Ask the user how many numbers they want to enter
			2. get all the inputs from the user and store them into an array
			3. Iterate the array & return the average number

 */