package day18_NestedLoop;

import java.util.Scanner;

public class logIn {
    public static void main(String[] args) {
        int n=0;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your username");
        String username= scan.next();
        System.out.println("Enter you password");
        String password= scan.next();
        ++n;

        if (username.equals("Cydeo") && password.equals("WoodenSpoon"))
        {
            System.out.println("Logged in.");
        }
        else {
            for (n=1; n < 3; n++) {
                if (n == 2) System.out.println("Your last chance!");
                System.out.println("Incorrect username or password!Please enter again:");

                System.out.println("Enter your username");
                username = scan.next();
                System.out.println("Enter you password");
                password = scan.next();
                if (username.equals("Cydeo") && password.equals("WoodenSpoon"))
                {System.out.println("Logged in.");
                    break;}// if user provides correct us and pas, it will exit from loop

                }
            if ((!username.equals("Cydeo") || !password.equals("WoodenSpoon")))
                System.out.println("Your account is locked");// i didn't put this statement inside the for loop
            //and that is why i didnt show (n==2 &&(!username.equals("Cydeo") || !password.equals("WoodenSpoon"))) like this
            }





    }
}
/*
 You are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                            username: Cydeo
                            password: WoodenSpoon

                Ask the user to enter their credentials.
                        If credentials are matched, your program should print "Logged in."
                        If the credentials are not matched, the program should allow the user to have three attempts to enter correct credentials and if all three attempts are failed, then print "Your account is locked."

 */