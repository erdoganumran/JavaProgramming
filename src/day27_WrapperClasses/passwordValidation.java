package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Scanner;

public class passwordValidation {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your password:");
        String password= scan.next();
        boolean a=false, b=false, c=false, d=false;
        while (password.length() < 8 || password.contains(" ")){
            System.out.println("Password MUST be at least have 8 characters long, and should not contain space.");
            System.out.println("Please enter again:");
            password= scan.next();
        }
        if (password.length() >= 8 && !password.contains(" ")) {
            for (char each : password.toCharArray()) {
                if (Character.isLowerCase(each)) {
                    a = true;
                }
                if (Character.isUpperCase(each)) {
                    b = true;
                }
                if (Character.isDigit(each)) {
                    c = true;
                }
                if (!Character.isLetterOrDigit(each)) {
                    d = true;
                }
            }
        }
            if((a && b&& c&& d)==true){
                System.out.println("Strong password!");
            } else {
                System.out.println("Weak password!");}
        scan.close();
        }

    }



/*
PasswordValidation:
    Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
                1. Password MUST be at least have 8 characters long, and should not contain space
                2. PassWord should at least contain one upper case letter
                3. PassWord should at least contain one lower case letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit


 */