package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        //System.out.println("Enter true or false");
        //boolean result = input.nextBoolean();// boolean can just read true or false. not experssion number or anything

        System.out.println("Please enter your name");
        String name = input.next();// next() will read just one word. if you are expecting one input you can use it. it will create just one word.
        System.out.println("name = " + name);

        input.close();

    }
}
