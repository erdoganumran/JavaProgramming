package day09_IfStatements;

public class BuyAlcohol {
    public static void main(String[] args) {
        int age = 21;

        boolean isEligible = (age >= 21);
        String name = "Joshua";


        if (isEligible) {
            System.out.println(name + " is eligible for alcohol");
        } else {
            System.out.println(name + " is not eligible for alcohol");
        }

        if (isEligible) {
            System.out.println(name + " is eligible to vote");
        } else {
            System.out.println(name + " is not eligible to vote");


        }
    }
}
