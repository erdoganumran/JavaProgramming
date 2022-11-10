package day10_NestedIf;

public class GradeReport2 {
    public static void main(String[] args) {

        /*if (grade >=0 && grade<=100) {

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
        */
        /* solution 2
        int number= 100;


        String result = (number <=100 && number >=0)? (number>=90)? "Excellent" :(number>=80 && number<90)? "great" : (number >=70 && number<80)? "good"
                : (number>=60 && number<70)? "passed" : "failed" : "invalid number";
        System.out.println(result);

*/
        int number= 170;
        String result = "";
        if (number <=100 && number >=0) {
            result = (number >= 90) ? "Excellent" : (number >= 80 && number < 90) ? "great" : (number >= 70 && number < 80) ? "good"
                    : (number >= 60 && number < 70) ? "passed" : "failed";
        }
        else System.out.println("invalid number");

        System.out.println(result);







    }
}
