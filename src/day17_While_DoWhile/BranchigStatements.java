package day17_While_DoWhile;

import java.util.Scanner;

public class BranchigStatements {

    public static void main(String[] args) {

        for (char i = 'A'; i <= 'Z'; i++) {

            System.out.print(i + " ");

            if (i == 'F')//if you put ; after if condition (); like this it will be executing everything
            {
                break;
            }

        }
        System.out.println();
        System.out.println("--------------------------------------------------------------");

        //while(true){ if it is true it will execute infinite times


        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("Enter a number");
            int n = scan.nextInt();

            if(n<0)
            break;


        }




        }
    }


