package day12_Scanner;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your hourly rate");
        int hourlyRate = input.nextInt();
        System.out.println("How many hours do you work in a week");
        int hours = input.nextInt();
        System.out.println("Please enter your state tax in percentage");
        int stateTax = input.nextInt();
        System.out.println("Please enter your federal tax in percentage");
        int federalTax = input.nextInt();

        int salary= hourlyRate*hours;
        int sTax= salary* stateTax/100;
        int fTax= salary* federalTax/100;
        int tTax = sTax+fTax;
        int netIncome = salary- tTax;

        System.out.println("netIncome = " + netIncome);

        input.close();


    }
}
/*

    3. SalaryCalculator:
            3.1 Ask the user to enter his/her hourlyRate
            3.2 Ask the user how many hours he/she works in a week
            3.3 Ask the user to enter state tax (in percentage)
            3.4 Ask the user to enter federal tax (in percentage)
            3.5 Calculate the:
                    3.4.1 salary
                    3.4.2 stateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome



 */