package day11_Switch_Scanner;

public class Grade {
    public static void main(String[] args) {

        char grade='F';

        /*switch (grade){

            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Great Job");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Passed");
                break;
            case 'E':
                System.out.println("Failed");
                break;
            default:
                System.out.println("invalid data")

        }*/

        //  // if you have or logic you can not use ||. you can leave empty the result and at the end you can put the result
        //                //char 2: char 3: char 4: ..... char:9 sout"passed" default: sout"failed"



        String result = "";
        switch (grade){
            case 'A': case 'B': case 'C': case 'D': case'E':
                result = "Passed";
                break;
            case 'F':
                result= "Failed";
            default:
                result= "Invalid data";
        }
                System.out.println(result);




        }

    }

/*
3. a char variable named grade is given. use switch statement to print the following messages:
			'A': excellent
			'B': great job
			'C': good
			'D': passed
			'F': failed
			other wise: invalid
 */