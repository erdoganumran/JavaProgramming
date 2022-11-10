package day15_ForLoop;

import java.util.Scanner;

public class SumOfMultipleNumbers {
    public static void main(String[] args) {

        double sum = 0;
//fori is shortcut
        for (int i= 1; i<=100; i+=1 ){
            sum = sum+i;
            //System.out.print(sum); if I show it here it will show all the i and i+sum values. afrer after {} will show just the output.
            }
        System.out.println(sum);

        System.out.println("---------------------------------------------------");

        int total = 0;
        Scanner scan= new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            total+=scan.nextInt();//it will ask 5 times
        }
        System.out.println(total);
        scan.close();


        }

    }

