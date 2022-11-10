package day10_NestedIf;

import org.w3c.dom.ls.LSOutput;

public class NestedIfIntro {
    public static void main(String[] args) {

        int score = 700;

        if(score>=0 && score>=100) { // if the score is valid
            if (score>=50) {// if the student pass the exam
                System.out.println("passed");
            }
            else {// if the student fail
                System.out.println("failed");}
        }
        else { //if the score is not valid
            System.out.println("invalid score");}


        System.out.println("------------------------");

        int age =16;
        boolean hasID = false;

        if (hasID) {
            if (age >= 21) {
                System.out.println("eligible to buy alcohol");}
            else {
                System.out.println("not eligible to buy alcohol");}
        }
        else {
            System.out.println("You must have ID");
        }
        System.out.println("----------------------------------");

        int number= 8;

        if (number >= 1 && number <=7) {
            if (number == 1) {
                System.out.println("monday");
            }
            if (number == 2) {
                System.out.println("tuesday");
            }
            if (number == 3) {
                System.out.println("wednesday");
            }
            if (number == 4) {
                System.out.println("thursday");
            }
            if (number == 5) {
                System.out.println("friday");
            }
            if (number == 6) {
                System.out.println("saturday");
            }
            if (number == 7) {
                System.out.println("sunday");
            }
        }
        else {
                System.out.println("please, enter a valid number");
        }





    }
}


