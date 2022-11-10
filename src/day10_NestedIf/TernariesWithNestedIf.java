package day10_NestedIf;

public class TernariesWithNestedIf {
    public static void main(String[] args) {

        int score= 185;

       /*( if (score>=0 && score<=100){
            if (score>=60) {
                System.out.println("passed");
            }
            else {
                System.out.println("failed");
            }
        }

        else {
            System.out.println("invalid number");}

*/

        String result= (score >=0 && score <=100)? (score>= 60)? "passed" : "failed" : "Enter a valid number";
        System.out.println(result);






    }
}
