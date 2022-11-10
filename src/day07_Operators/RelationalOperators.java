package day07_Operators;

import javax.lang.model.SourceVersion;

public class RelationalOperators {
    public static void main(String[] args) {


        boolean result1 = 20 > 40;
        System.out.println("result1 = " + result1);
        result1 = 40> 20;
        System.out.println("result1 = " + result1);

        boolean result2 = 100>=100;
        System.out.println("result2 = " + result2);

        boolean result3 = 100<=100;
        System.out.println("result3 = " + result3);

        boolean result4= 300>= 400;// false
        System.out.println("result4 = " + result4);
        
        // credit score of 720
        int score = 745;
        boolean isEligibleForLoan = score >= 720;
        System.out.println("isEligibleForLoan = " + isEligibleForLoan);
        
        boolean result5 = 100<120; //true
        System.out.println("result5 = " + result5);

        boolean result6 = 200<150;//false
        System.out.println("result6 = " + result6);

        int schoolScore = 75;
        boolean hasFailed = schoolScore <=59;
        System.out.println("hasFailed = " + hasFailed);

        boolean result7 = 45 <=60;
        System.out.println("result7 = " + result7);

        System.out.println("-----------------------------");

        int x= 100;
        int y = 200;
        boolean equal = 100==200; //false
        System.out.println("equal = " + equal);

         boolean result8 = "Umran" == "Umran";
        System.out.println("result8 = " + result8);

        boolean tf = "A"=="a";//false
        System.out.println("tf = " + tf);

        boolean result9 = 60!=60;//false
        System.out.println("result9 = " + result9);

        boolean result10 = 70 !=80;//true
        System.out.println("result10 = " + result10);

        boolean result11 = "JAVA" != "EQUAL";//true
        System.out.println("result11 = " + result11);






    }


}


