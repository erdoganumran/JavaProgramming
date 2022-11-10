package day09_IfStatements;

public class MaxNumber {

    public static void main(String[] args) {

        int number1 = 40;
        int number2 = 30;

        boolean minNumber = number1< number2;

        if (minNumber){
            System.out.println(number1 + " is the min number");}
        else {
            System.out.println(number2 + " is the min number");
        }

        if (!minNumber) {
            System.out.println(number1 + " is the max number");
        }else {
            System.out.println(number2 + " is the max number");
        }

    }
}

/*
task:
		1. Maximum number between two different numbers
		2. Minimum number between two different numbers
 */