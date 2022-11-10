package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {

        int grade = 145;
 /*
        if (grade >=0 && grade<=100){

            if (grade >=90) {
                System.out.println("excellent");}
            else if (grade<=89 && grade >=80) {
                System.out.println("great");}
            else if (grade<=79 && grade >=70) {
                System.out.println("good");}
            else if (grade<=69 && grade >=60) {
                System.out.println("passed");}
            else {
                System.out.println("failed");}

        }else {
            System.out.println("invalid score");
        }
        System.out.println("---------------------------");

        String result= "";// temporary variable
*/

        String result = ""; //temporary

        if (grade >=0 && grade<=100) {

            if (grade >= 90) {
                result = "excellent";
            } else if (grade <= 89 && grade >= 80) {
                result = "great";
            } else if (grade <= 79 && grade >= 70) {
                result = "good";
            } else if (grade <= 69 && grade >= 60) {
                result = "passed";
            } else {
                result = "failed";
            }
        }
        else { result = "failed";}


        System.out.println(result);





    }


}
