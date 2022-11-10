package day25_CustomMethod_Overloading;

import utilities.StringUtility;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        String  str ="Java Programming Language";
        StringUtility.printEachChar(str);
        System.out.println("---------------------------------");

        String str2= "Wooden Spoon";
        String reversed= StringUtility.reverse(str2);
        System.out.println(reversed);
        System.out.println("-------------------------------");

        String word= "Cidvic";
        boolean palindrome= StringUtility.isPalindrome(word);
        System.out.println("palindrome = " + palindrome);
        System.out.println("-------------------------------------");

        String []names={"Anna", "Java", "Python", "racecar", "Mom","Cydeo"};
        int count= 0;
        for (String name : names) {
            if(StringUtility.isPalindrome(name)){
                count++;
            }
        }
        System.out.println("count = " + count);

        System.out.println("----------------------------------------");

        System.out.println(StringUtility.anagram(word,str));

        System.out.println("----------------------------------------");

        System.out.println(StringUtility.removeDuplicates(str));


    }
}
