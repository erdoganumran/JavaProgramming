package day08_IfStatements;

public class GradeReport {
    public static void main(String[] args) {

        /*System.out.println(true == !false);
        System.out.println(!true == false);
        System.out.println(!false == true);
        System.out.println(!!false);//false
        System.out.println(!!!true);//false
        */

        int score =  30;

        boolean excellent = score >= 90 && score <= 100;
        boolean great = score >=80 && score<90;
        boolean good = score >=70 && score<80;
        boolean passed = score >=60 && score<70;
        boolean failed = score >=0 && score<60;

        if (excellent){System.out.println("your score is excellent");
        }
        if (great){System.out.println("your score is great");
        }
        if (good){System.out.println("your score is good");
        }
        if (passed){System.out.println("you passed");
        }
        if (failed){System.out.println("you failed");
        }

    }
}

/*
90-100 excellent
80-89 great
70-79 good
60-69 passed
0-59 failed

*/

