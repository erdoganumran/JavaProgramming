package day12_Scanner;

import java.util.Scanner;

public class NextLineMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your age");
        int age = input.nextInt();

        input.nextLine();// it will clear input the scanner memory

        System.out.println("Please enter you full name");
        String name = input.nextLine();// it takes everything that the scanner has and scanner will be empty.

        System.out.println("Your GPA");
        double gpa = input.nextDouble();

        input.nextLine();// it will clear input the scanner memory

        System.out.println("School name");
        String schoolName = input.nextLine();

        System.out.println("age = " + age);
        System.out.println("name = " + name);
        System.out.println("schoolName = " + schoolName);
        System.out.println("gpa = " + gpa);


        input.close();

    }
}
