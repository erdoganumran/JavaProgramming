package day19_LoopPractices;

public class indexNumFirstCh {
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
                System.out.println(str.indexOf(""+ str.charAt(i))) ;
                break;}
        }

    }
}


/*
	2. Write a program that cna return the index number of the first duplicated character from a string
 */