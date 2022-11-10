package day12_Scanner;
import java.util.Scanner;

public class PickACard2 {


public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number between 1-52");
        int n = input.nextInt();

        String suits = (n >= 1 && n <= 13) ? " of Hearts" : (n > 13 && n <= 26) ? " of Diamonds"
                : (n > 26 && n <= 39) ? " of Spades " : " of Clubs";

        boolean valid2 = n>0&& n<=52;

        if (valid2)
            if (n>1 && n<=10) System.out.println("The number you provided is " +n + suits + suits);
            else if (n>14 && n<=23) System.out.println("The number you provided is " +(n-13) + suits );
            else if (n>27 && n<=36) System.out.println("The number you provided is " +(n-26) + suits);
            else  if (n>49 && n<=39)System.out.println("The number you provided is " +(n-39) + suits);
            else if (n==1 ||n== 14|| n== 27|| n== 40) System.out.println("The number you provided is ace " + suits);
            else if (n == 11 || n== 24 || n == 37 || n == 50) System.out.println("The number you provided is Jack " + suits);
            else if (n == 12 || n== 25 || n == 38 || n == 51)System.out.println("The number you provided is Queen " + suits);
            else System.out.println("The number you provided is King " + suits);
        else System.out.println("Invalid number");

        /*String name = (n >= 1 && n <= 52) ? ((n == 1 || n == 14 || n == 27 || n == 40) ? "Ace" : (n == 2 || n == 15 || n == 28 || n == 41) ? "2"
                : (n == 3 || n == 16 || n == 29 || n == 42) ? "3" : (n == 4 || n == 17 || n == 30 || n == 43) ? "4"
                : (n == 5 || n == 18 || n == 31 || n == 44) ? "5" : (n == 6 || n == 19 || n == 32 || n == 45) ? "6"
                : (n == 7 || n == 20 || n == 33 || n == 46) ? "7" : (n == 8 || n == 21 || n == 34 || n == 47) ? "8"
                : (n == 9 || n == 22 || n == 35 || n == 48) ? "9" : (n == 10 || n == 23 || n == 36 || n == 49) ? "10"
                : (n == 11 || n == 24 || n == 37 || n == 50) ? "Jack" : (n == 12 || n == 25 || n == 38 || n == 51) ? "Queen"
                : "King") : "invalid";*/
        /*int number= 0;
         if ((n>1 && n<=10)||(n>14 && n<=23)||(n>27 && n<=36)||(n>40 && n<=49)){
         if (n>1 && n<=10) number=n;
            else if (n>14 && n<=23) number=(n-13);
            else if (n>27 && n<=36) number= (n-26);
            else  number = (n-39);}*/


         /*String valid ="" ;
         if (n<=0 && n> 52) valid = " not in the rage";
         else if (n==1 ||n== 14|| n== 27|| n== 40) valid= "Ace";
         else if (n == 11 || n== 24 || n == 37 || n == 50) valid = "Jack";
         else if (n == 12 || n== 25 || n == 38 || n == 51)valid= "Queen";
         else if (n == 13 || n== 26 || n == 98 || n == 52) valid= "King";
         else valid="";*/



        //String ace = (n==1 ||n== 14|| n== 27|| n== 40)? "Ace" :"";

       // String name2= (n == 11 || n== 24 || n == 37 || n == 50)? "Jack" :(n == 12 || n== 25 || n == 38 || n == 51)? "Queen"
                //: (n == 13 || n== 26 || n == 98 || n == 52)? "King" : "";



        input.close();


 }
    }