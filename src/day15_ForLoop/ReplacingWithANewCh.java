package day15_ForLoop;

import java.text.spi.BreakIteratorProvider;
import java.util.Scanner;

public class ReplacingWithANewCh {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word");
        String word = scan.nextLine();


        if (word.charAt(0)=='x') System.out.println(word.replaceFirst("x", "a"));
         scan.close();

    }
}
/*
	1. Write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
 */