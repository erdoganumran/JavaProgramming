package day17_While_DoWhile;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your age:");
        int age = scan.nextByte();

        while (!(age>=1 && age<=120)) {
            System.err.println("invalid entry, please re-entry");
            System.err.println("Please enter your age:");
            age =scan.nextInt();
        }


        System.out.println("Are you a US citizen? yes/no:");
        String cs = scan.next();

        while (!(cs.equalsIgnoreCase("YES") ||  cs.equalsIgnoreCase("NO"))) {
            System.err.println("invalid entry, please re-entry");
            System.err.println("Are you a US citizen? yes/no:");
            cs =scan.next();
        }


        if (age>=18 && cs.equalsIgnoreCase("YES")){System.out.println("Eligible to vote");}
        else {System.out.println("not eligible to vote");}

scan.close();
    }
}
