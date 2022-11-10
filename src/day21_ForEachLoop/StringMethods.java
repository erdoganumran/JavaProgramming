package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String str= "Java";
        char [] ch= str.toCharArray();
        System.out.println(Arrays.toString(ch));//ch[=[J,a,v,a];
        for (char each : ch){// each everytime will be initialized by every char which is ch of str
            System.out.println(each);//ch[=[J,a,v,a];
        }

        System.out.println("-----------------------------------------------------------");

        String str1= "Wooden Spoon";
        String [] words= str1.split(" ");
        System.out.println(Arrays.toString(words));

        System.out.println("------------------------------------------------------------");

        String email= "umrangulle@gmail.com";
        String[] sp= email.split("@");
        System.out.println(Arrays.toString(sp));
// if you split it by . (dot) it has to be given with the double slash \\.

        String sen= "today is java. today is beautiful. today is monday.";
        String[] spl= sen.split("\\.");
        System.out.println(Arrays.toString(spl));//[today is java,  today is beautiful,  today is monday]



    }
}
