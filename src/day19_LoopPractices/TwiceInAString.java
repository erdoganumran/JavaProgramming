package day19_LoopPractices;

import java.util.Locale;

public class TwiceInAString {
    public static void main(String[] args) {
        String str = "abcccddeef";//de
        String result = "";
        String s = "";

        for (int i = 0; i < str.length(); i++) {
            String a = "" + str.charAt(i);
            s = str.substring(0, i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                String b = "" + str.charAt(j);
                if (a.equals(b)) count++;

            }
            if (count == 2 && !(s.contains("" + str.charAt(i)))) {
                System.out.print(a);
            }
        }

    }
}







/*
	3. Write a program that can display all the characters that appeared twice in the string.
 */