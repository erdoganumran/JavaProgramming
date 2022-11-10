package day17_While_DoWhile;

import day12_Scanner.ScannerPractice3_NextLine;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //String userName = "Cydeo";
        //String passWord = "Cydeo123";

        System.out.println("Enter your user name");
        String userName = scan.next();
        System.out.println("Enter your password");
        String password = scan.next();

        int attempt=3;
        while ( !(userName.equals("Cydeo") && password.equals("Cydeo123")) && attempt>1 )
        {
            if (attempt==2){
                System.out.println("Your last chance");}// if it is 2 it will show
            attempt--;//if first try is wrong attempt will be 2, but this is after if statement so, you can not see last chance warning
            System.out.println("Incorrect password or username, please re-enter;");
            System.out.println("Enter your user name:");
            userName = scan.next();
            System.out.println("Enter your password:");
            password = scan.next();


        }

        if (userName.equals("Cydeo") && password.equals("Cydeo123"))
        {System.out.println("Logged in successfully");}
        else {System.out.println("Your account is locked.");}


scan.close();








    }
}
