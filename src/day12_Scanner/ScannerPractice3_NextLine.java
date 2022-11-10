package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //reads what you write, reads everything.

        System.out.println("Enter a full name");
        String fullName= input.nextLine();
        System.out.println("Enter your Programming Language");
        String language = input.nextLine();//

        System.out.println("Please enter your age");
        int age = input.nextInt();// it will ignore enter method here and enter will be left in the scanner

        input.nextLine();// we use this nexline method to capture the enter key then scanner will be empty. if it is empty it can go to next line
// if you use nextLine method, enter key will be described at the scanner. if you use nextline method it won't be described in the scanner. this is the only disadvantage of nexLine.
//nexline method can not ignore enter key that other methods ignores. in all other methods enter key left in the scanner. however nextline doesn't ignore enter key.
//if you use nexline method after another method, nextline method will be going to read the previous enter key as a default
// that is why we need to clear out of scanner memory with input.nextLine();
//if we are using nextLine() method after the other methods of scanner, we MUST provide one addition nextLine()

        System.out.println("Enter your school name");
        String schoolName = input.nextLine();//enter

        System.out.println("language = " + language);
        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);

        input.close();
    }
}
