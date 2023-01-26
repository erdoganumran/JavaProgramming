package day04_Variables;

import java.util.Date;

public class PrimitivesIntro {
    public static void main(String[] args) {

        byte age = 38;
        short weight = 160; //weight number is out of byte range, so we use short
        int salary = 100_000;// salary is out  of short rage
        //int is preferred data type for integer numbers

        long asset = 3_333_333_333L;// if the code take the code as int, you can add L for it
        float tax = 0.26F;// you should add F to determine the float number
        double PI = 3.14;// Double is the preferred one for the floating points

        char ch1 = 35; //for single characters you can use asciitable
        char ch2 = '#';

        System.out.println("ch1 = " + ch1);
        System.out.println("ch2 = " + ch2);

        char ch3 = 35000;
        System.out.println("ch3 = " + ch3);// chars have some characters for the number between 0-65000
        // make sure when you use char the character is a single character

        char gender = 'F';
        char YesNo = 'Y';

        boolean isEmployed = true;
        boolean isMarried = true; // use boolean for true or false



















    }



}
