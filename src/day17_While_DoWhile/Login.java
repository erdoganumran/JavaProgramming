package day17_While_DoWhile;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String username = "Cydeo";
        String password = "Cydeo123";
        Scanner scan= new Scanner(System.in);


        for (int i=3; i>0;i--) {
            System.out.println("Please enter your username:");
            String validUN = scan.next();
            System.out.println("Please enter your password:");
            String validPW = scan.next();

            //girisi burada yaptim ve son hakkimda yanlis yaptim diyelim ki son donguye gelldiginde eger dogruysa giris olacak yalnissa once else if e giedecek bakti ki
            //if yanlisti burada i=1 conditioni tutuyor o halde print onu basacak ve else blocku exit olacak
            if (username.equals(validUN) && password.equals(validPW)) {
                System.out.println("Logged in.");
            } else if (i<=1) {
                System.out.println("Your account is locked.");
            }
            else {
                System.out.println("Incorrect username or password.");
            }

        }

    }
}
/*
 2. You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts to enter correct credentials and if all three attempts are failed, then print "Your account is locked."

 */