package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReversedSecondWord {
    public static void main(String[] args) {
        String sentence = "I Love Java";
        String []words= sentence.split(" ");
        String reversed= " ";

        for (int i = words[1].length()-1; i >=0; i--) {
            reversed += words[1].charAt(i);
        }
        words[1]=reversed;
        //System.out.println(Arrays.toString(words));//[I,  evoL, Java]
        for (String word:words){
            System.out.print(word+ " ");
        }
       /* String second=words[1];
        for (int i = words.length-1; i >=0 ; i--) {//index 2 index 1
            words[1] = "";

                for (int j = second.length() - 1; j >= 0; j--) {
                    words[1] += "" + second.charAt(j);
                }

            reversed += words[i] + " "; //java
        }
        System.out.println(reversed);
        System.out.println(words[1]);*/

    }
}
/*
	2. Write a program that can reverse the second word of the sentence
			Ex:
				sentence = "I Love Java";

			output:
				I evoL Java
 */