package day16_ForLoopStringPractice;

public class Palindrome {
    public static void main(String[] args) {
        String str = "javaj";
        String str2 = "";

        for (int i = str.length()-1; i>=0; i--)
        {str2 += str.charAt(i);}


        if (str.equalsIgnoreCase(str2))
        {System.out.println("This is a palindrome");}
        else {System.out.println("This is not a palindrome");}


    }
}
