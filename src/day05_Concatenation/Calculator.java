package day05_Concatenation;

public class Calculator {

    public static void main(String[] args) {
         int firstNumber = 100;
         int secondNumber = 50;

        int addition = firstNumber+secondNumber;
         //100 + 50 = 150
        System.out.println(firstNumber + "+"+ secondNumber + "=" + (firstNumber+secondNumber));

        int subsraction = firstNumber-secondNumber;
        //100-50=50

        System.out.println(firstNumber+"-"+secondNumber+"="+subsraction);
        //100*50=5000

        System.out.println(firstNumber+"*"+secondNumber+"="+(firstNumber*secondNumber));


    }
}
