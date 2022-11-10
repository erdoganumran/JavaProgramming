package day20_Arrays;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {
        char [] letters =new char[26];
/*
        for (char i = 'A', j=0; i <= 'Z' && j<letters.length; i++,j++) {//it is one data type that is why this way is possible
            letters[j]=i;
        }
        System.out.println(Arrays.toString(letters));

        System.out.println("--------------------------------------------");

        char ch='A';
        for (int i = 0; i < letters.length; i++,ch++) {
            letters[i]=ch;//ABC...
        }System.out.println(Arrays.toString(letters));

        System.out.println("-------------------------------------------------------");
        */
        char ch2='Z';
        for (int i = 0; i <=letters.length-1 ; i++, ch2--) {
            letters[i]=ch2;
        }
        System.out.println(letters);


    }
}
