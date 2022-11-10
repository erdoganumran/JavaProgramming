package day08_IfStatements;

import day02_HelloWorld.JavaComponents;

public class LogicalOperators {
    public static void main(String[] args) {
        String name = "John";
        int age = 16;
        String citizen = "USA";

        boolean isEligibleToVote = age >= 18 && citizen == "USA";

        System.out.println(name + " is eligible to vote: " + isEligibleToVote);

        System.out.println("---------------------------------------");

        String name1 = "Josh";
        int creditScore = 720;
        int age1 = 23;
        int income = 40000;
        boolean isEligibleForLoan = creditScore >= 720 && age >= 18 && income >= 60000;

        System.out.println(name + " is eligible for loan :" + isEligibleForLoan);

        String name2 = "Umran";
        int age2 = 34;
        char gender = 'F';
        boolean isEligible2 = age >= 18 && (gender == 'F' || gender == 'M');

        System.out.println(name2 + " is eligible for register: " + isEligible2);

        System.out.println("------------------------------------");
          String name3 = "Umran";
          String countryOfBirth = "Turkey";
          boolean marriedToUSCitizen = false;
          boolean isEligibleFor = countryOfBirth == "USA" || marriedToUSCitizen == false;
        System.out.println(name3 + " is eligible for US citizenship: " + isEligibleFor);

        System.out.println("---------------------------------");

        String student = "Anna";
        double gpa = 2.5;
        int familyIncome = 120000;

        boolean isEligible4 = gpa >= 3.0 || familyIncome <=100.000;
        System.out.println(name + " is eligible for scolarship : " + isEligible4);

        System.out.println("----------------------------------------");

        boolean result2 = true;
        System.out.println("result2 = " + result2);
        boolean result3 = !result2;
        System.out.println("result3 = " + result3);

        System.out.println("----------------------------------");

        int score = 85;
        boolean passed = score >= 60;
        boolean failed = !passed;

        System.out.println("failed = " + failed);
        System.out.println("passed = " + passed);





    }



    }




