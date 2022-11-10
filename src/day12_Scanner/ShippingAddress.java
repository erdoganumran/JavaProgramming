package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your full name");
        String name = input.nextLine();

        System.out.println("Please enter your building number");
        int building = input.nextInt();

        input.nextLine();

        System.out.println("Please enter your street name");
        String street = input.nextLine();

        System.out.println("Please enter your city name");
        String city = input.nextLine();

        System.out.println("Please enter your state");
        String state = input.nextLine();

        System.out.println("Please enter your full zip code");
        int zipCode= input.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Your shipping address is: " + building + ", " + street+ ", " +city+ ", " +state+ ", " +zipCode);


input.close();



    }
}
