package day12_Scanner;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);// if your scanner name is scan int name should be inout. if it is scan should be scan.

        System.out.println("Please enter the radius of the circle");

        int radius = scan.nextInt();

        if (radius>0){
            System.out.println("perimeter = " + (2*radius*3.14) + " area = " + (radius*radius*3.14));
        }
        else System.out.println("please enter a valid number");
        scan.close();

    }
}

/*
    1. Circle:
            1.1 Ask the user to enter the radius of the circle
            1.1 Calculate the area and perimeter of the circle by using the radius
 */
