package day17_While_DoWhile;

import java.util.Scanner;

public class MarriageProposal {
    public static void main(String[] args) {
        System.out.println("Will you marry me? yes/no");

        Scanner scan = new Scanner(System.in);
        String answer = scan.nextLine();

        while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no")))
        {
            System.out.println("Invalid answer! Please re-enter;");
            System.out.println("Will you marry me? yes/no");
            answer = scan.nextLine();
        }



            if (answer.equalsIgnoreCase("yes"))
            {
                System.out.println("Congrats!");}
            else {
                System.out.println("Goodbye!");}


            scan.close();
    }
}
