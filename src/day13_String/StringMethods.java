package day13_String;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        String word = "Cydeo";

        char third= word.charAt(3);// e because it will start from 0
        System.out.println(third);

        //char tenth = word.charAt(9);
        //System.out.println(tenth); it will give exception = String index out of range: 9

        System.out.println("--------------------------------------------------");

        String s1 = "Batch 25 is the best batch";
        int totalCharacters = s1.length();// it will start count from 1
        System.out.println(totalCharacters);//26

        char lastChar = s1.charAt(totalCharacters-1);//h because char has -1 character
        char lastChar2 = s1.charAt(s1.length()-1);//h

        System.out.println(lastChar2);
        System.out.println(lastChar);

        System.out.println("---------------------------------------------------");

        String str="Wooden Spoon";//it's immutable
        str = str.toUpperCase();//WOODEN SPOON. It creats a new object. Because string is immutable that is why we have assign it back again like here
        System.out.println(str);

        String s= "JAVA";
        s = s.toLowerCase();
        System.out.println(s);//java

        String st = "Today is a great day to learn java programming language";
        st = st.toUpperCase();// it creates a new object
        System.out.println(st);








    }
}
