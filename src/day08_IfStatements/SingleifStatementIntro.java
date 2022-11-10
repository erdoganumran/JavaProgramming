package day08_IfStatements;

public class SingleifStatementIntro {
    public static void main(String[] args) {

        int number = 300;

        boolean evenNumber = number % 2 == 0;
        boolean oddNumber = !evenNumber;

        if (evenNumber) {
            System.out.println(number + " is even number");
        }

        if (oddNumber) {
            System.out.println(number + " is odd number");

        }


        System.out.println("--------------------------");

        int n = 0;

        boolean positive = n>0;
        boolean negative = n<0;
        boolean zero = n==0;

        if (positive) {
            System.out.println(n + " is a positive number");
        }

        if (negative) {
            System.out.println(n + " is a negative number");
        }

        if (zero) {
            System.out.println(n + " is zero");
        }

        System.out.println("----------------------");

        int number1 = 301;

        if (number1 % 2 ==0) {
            System.out.println(number + " is even number");
        }

        if (number1 % 2 ==1) {
            System.out.println(number1 + " is odd number");

        }
    }
}