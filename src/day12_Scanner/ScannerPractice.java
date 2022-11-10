package day12_Scanner;

import java.util.Scanner;

//import java.util.Scanner; here Scanner is just a class. You can see import java.util.*; "*" import everything. but it will take much more memory and more cost. util is package.

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  // this means reusable right now because scanner is assigned to the input
//Scanner scan(object of scanner can be any name but scan or input is logical to understand. = new Scanner (here you will declare the scanner . System is class and in is input);
        System.out.println("Please enter the number of the day");

        int num= scan.nextInt(); // if we want to use the number we use

        String result = "";
         if (num>0 && num<8 ){
             // or you can use { result= (num==1)?"Monday":(num==2)? "Tuesday ..... :"Sunday } we assign 'result' to  a string here
             switch (num) {
                 case 1: result = "Monday";
                 break;
                 case 2: result = "Tuesday";
                     break;
                 case 3: result = "Wednesday";
                     break;
                 case 4: result = "Thusday";
                     break;
                 case 5: result = "Friday";
                     break;
                 case 6: result = "Saturday";
                     break;
                 default:result = "Sunday";


             }
         }
         else result= "invalid number";
        System.out.println(result);

scan.close();// closing statement





    }
}
