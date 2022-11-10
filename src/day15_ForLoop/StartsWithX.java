package day15_ForLoop;

import java.util.Scanner;

public class StartsWithX {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter a word");
        String word= scan.nextLine();

        if (word.charAt(0)=='x') System.out.println(word.replace("x","a"));
        scan.close();

    }
}
/*
	2. Write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea

 */