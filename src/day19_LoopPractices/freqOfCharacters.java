package day19_LoopPractices;

public class freqOfCharacters {
    public static void main(String[] args) {
        String str = "aabcccd";
        String result = "";
        for (int i = 0; i <str.length() ; i++) {

            int freq=0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i)==str.charAt(j))
                {freq++;}
            }

            if (result.contains(""+ str.charAt(i)))
            {continue;}
            result+= "" + str.charAt(i);
            result+=freq;
        }

            System.out.print(result);
    }

}

/*
 * 	1. Write a program that can find the frequency of the characters from a string
 *
 * 			 Ex:
 *                         str = "aabcccd";
 *
 *                         output:
 *                                 a2b1c3d1
 *
 */