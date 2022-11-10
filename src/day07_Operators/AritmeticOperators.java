package day07_Operators;

public class AritmeticOperators {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 =3;
        System.out.println("deneme"+num2);// it's concatenation string+sth

        int division = num1/num2;//division variable contains the result of num1 divided by num2
        int remainder = num1%num2;// remainder variable contains the remainder of number of num1 divided by number

        System.out.println("division = " + division);
        System.out.println("remainder = " + remainder);
        System.out.println(num1 + " divided by " + num2 +" is equal to " + division + " with a remainder of "+ remainder);

        System.out.println(25%4);
        System.out.println(25%5);
        
    }
}
