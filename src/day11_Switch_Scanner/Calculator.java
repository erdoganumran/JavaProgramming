package day11_Switch_Scanner;

public class Calculator {
    public static void main(String[] args) {
        double n1= 30.5;
        double n2= 60.6;
        char operator= '+';
        boolean valid = (operator =='+'|| operator== '-' || operator== '*' || operator == '/');
        if (valid){
        double result;
            switch (operator) {
                case '+':
                    result = n1 + n2;
                    break;
                case '-':
                    result = n1 - n2;
                    break;
                case '*':
                    result = n1 * n2;
                    break;
                default:
                    result = n1 / n2;
                    break;
            }

        }
        else System.out.println("invalid operator");

    }
}
//valid operator :- + * /