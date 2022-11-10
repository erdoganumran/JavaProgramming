package day19_LoopPractices;

public class UniqueCh {
    public static void main(String[] args) {
        String str = "aabccdeef";
        String result ="";

        for (int i = 0; i < str.length(); i++) {
            int freq = 0;
            for (int j = 0; j <str.length(); j++) {
                if (str.charAt(i) == str.charAt(j))
                    freq++;
            }
            if (freq==1){
                result+=""+ str.charAt(i);

            }
            //System.out.print(result); IF YOU WRITE HERE, EVERYTIME IT WILL PRINT EVERY RESULT
        }
        System.out.print(result);//IF YOU WRITE HERE, IT WILL PRINT LAST RESULT

    }
}
/*
	2. Write a program that can find the unique characters from a string without using indexOf() and lastIndexOf() methods

    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf

 */