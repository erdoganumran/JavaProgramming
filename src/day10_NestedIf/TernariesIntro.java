package day10_NestedIf;

public class TernariesIntro {
    public static void main(String[] args) {

        int n = 100;

        if (n%2 == 0){
            System.out.println("even number");}//string
        else {
            System.out.println("odd number");} //string
        //same data type of value we represent. if all the data type is same you can use ternaries.

        System.out.println("------------------");
        String result1 = (n%2==0)? "even" : "odd";
        System.out.println(result1);

        System.out.println("------------------------");

        int age = 15;
        String isEligible = (age >=18)? "eligible" : "not eligible";
        System.out.println(isEligible);
//or
        System.out.println((age >=18)? "eligible" : "not eligible");

        System.out.println("------------------------------------");
        int number = -100;

        String posNeg = (number>0? "Positive" :(number == 0)? "Zero" : "Negative" );
        System.out.println(posNeg);

        System.out.println(number>0?"Positive" :(number<0)? "Negative" : "Zero");


        /*
        •	If (condition)  : (condition)?
•	Else=    :
•	Else if (condition)=      :(condition)?
•	If (condition)  : (condition)?
•	Else=    :
•	Else if (condition)=      :(condition)?

         */





    }



}
