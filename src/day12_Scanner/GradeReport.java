package day12_Scanner;

import java.util.Scanner;
import java.util.ServiceConfigurationError;

public class GradeReport {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your score");

        int score = scan.nextInt();

        String grade = "";

        if (score>=0 && score<=100)
        {
            grade = (score>=90 && score<=100)? "Excellent"
                    :(score>=80 && score<90)? "Great Job"
                    :(score>=70 && score<80)? "Good"
                    :(score>=60 && score<70)? "Passed"
                    :"Failed";

        }

        else grade= "please enter a valid number";

        System.out.println(grade);
        scan.close();
    }
}
/*
  GradeReport:
            2.1 Ask the user to enter the score
            2.2 Print the grade of the student (A, B, C, D, F)
            2.3 If user enter invalid score (negative or more than 100) print invalid score
            'A': excellent
			'B': great job
			'C': good
			'D': passed
			'F': failed
 */