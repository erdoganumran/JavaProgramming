package day11_Switch_Scanner;

//import java.util.Scanner;

import java.util.Scanner;

public class ScannerIntro {

    //Scanner input = new Scanner(System.in);//constructor of scanner  in is input out is output
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); ///before creating the class name you can write scanner here and, it will create class name automatically

        System.out.println("Enter an integer: ");// before scanner, I want to show this message
        int num1 = input.nextInt();// this is a data providing by user. num1 assigned  to the input. here user provides the input before we must show message


        System.out.println("Enter a decimal: ");
        double num2 = input.nextDouble();// to reusing it we assigned to a primitive

        System.out.println(num1);
        System.out.println(num2);
        System.out.println("Multiplication:" + (num1+num2));

        // always after scanner close the scanner. if you don't close it, it will work at the back. it will affect performance.
        input.close();// closes the scanner. make sure you are not going to use the scanner again otherwise it will give error
       /* System.out.println("enter an integer");
        int num3= input.nextInt();
        System.out.println(num3);*/





    }


}
