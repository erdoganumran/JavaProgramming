package day13_String;

import java.util.Scanner;

public class Initial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter your name");
        String firstName = scan.next();

        System.out.println("enter your last name");
        String lastName = scan.next();

        String initial = ""+ firstName.charAt(0) + lastName.charAt(0);// to make it string you should put "" before concatenation,

        System.out.println(""+ firstName.charAt(0) + lastName.charAt(0));//ue
        System.out.println(initial);//ue

        char f = firstName.charAt(0);
        char l= lastName.charAt(0);
        String initial2= f+"."+l;
        System.out.println(initial2);//u.e
        System.out.println(f+l);//218 it will turn number or special characters



scan.close();




    }
}
