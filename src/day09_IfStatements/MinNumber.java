package day09_IfStatements;

public class MinNumber {
    public static void main(String[] args) {


        int firstNumber = 50;
        int secondNumber = 50;

        boolean min1 = firstNumber < secondNumber;
        boolean min2 = secondNumber < firstNumber;
        boolean equal = firstNumber == secondNumber;
        if (min1) {
            System.out.println(firstNumber+ " is the min number");
        }
        if (min2) {
            System.out.println(secondNumber + "is the min number");
        }
        if (equal) {
            System.out.println("the number are equal");
        }

    }
}







/*
Create a class called MinNumber, Write a program that can print the minimum number between two numbers, if both are equal then print Equal

			Ex:
				n1= 100, n2 = 200;

			output:
				100 is the minimum number


			n1 & n2

			possibility #1: n1 is Min
			possibility #2: n2 is Min
			possibility #3: equal

 */