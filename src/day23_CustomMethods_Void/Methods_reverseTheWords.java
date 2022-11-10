package day23_CustomMethods_Void;

import java.util.Scanner;

public class Methods_reverseTheWords {// classname
    public static void main(String[] args) {// method. there is method after {}, {method body }
        //main is a method here. (String[] args)-> this is an argument.
        // method makes my code runnable
        //when you create a method we need to call the method. we call it with a name
        //Method:Function
        /**
        access modifier-specifier-returnType-methodName(Parameter){}==public static void main(String[] args){}
        */
        //access modifiers: public, protected, default, private
        //specifiers: static, final, abstract, synchronized
        //return type: void, any DataType(strung, int, or any other custom data type)
        //method name can be any time but make sure that it is meaningful
        //parameter: any data type

        Scanner scan= new Scanner(System.in);

        while (true) {

            System.out.println("enter your word:");
            String word = scan.nextLine();

            String reverse = "";
            for (int i = word.length()-1; i >= 0; i--) {
                reverse += word.charAt(i);
            }
            System.out.println(reverse);

            System.out.println("Would you like to continue?");
            String answer= scan.next();

            if (answer.equalsIgnoreCase("no")){
                break;
            }
            scan.nextLine();
        }

        System.out.println("Thank for visiting us!");
        scan.close();
    }
}
/*
Task:
		step1 : reverse "Java"
		....

		step5: rverse "python"
		...


		step10: reverse "Cydeo"
		...

 */