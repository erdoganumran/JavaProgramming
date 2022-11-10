package day09_IfStatements;

public class PosNegZero {
    public static void main(String[] args) {

        int number = 0;

        boolean positive = number > 0;
        boolean negative = number < 0;


        if (positive) {
            System.out.println(number + " is a positive number");
        } else if (negative) {
            System.out.println(number + " is a negative number");
        } else {
            System.out.println("number is zero");
        }
        System.out.println("----------------------------");

        if (number>0){
            System.out.println(number + " is a positive number");}
        else if (number<0) {
            System.out.println(number + " is a negative number");}
        else {
            System.out.println("number is zero");}

        }

    }



