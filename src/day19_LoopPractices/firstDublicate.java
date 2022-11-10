package day19_LoopPractices;

public class firstDublicate {
    public static void main(String[] args) {
        String str = "abcccdeef";
        String result ="";

        for (int i = 0; i < str.length(); i++) {
            int n=0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i)== str.charAt(j))
                    n++;
            }
            if (n>1){
                System.out.println(str.charAt(i)) ;
            break;}
        }

    }
}
/*
	1. Write a program that can return the first duplicated character from a string

 */