package day11_Switch_Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        double salary = 40000;
        double taxRate = 0;
        boolean isMarried = true;

    /*    String status = "Married";
        double tax = 0;

        if (status == "Married")
            if (salary >= 130000) {
                tax = salary * 35 / 100;
            } else if (salary < 130000 && salary >= 100000) {
                tax = salary * 30 / 100;
            } else if (salary < 100000 && salary >= 80000) {
                tax = salary * 25 / 100;
            } else {
                tax = salary * 20 / 100;
            }
        else if (status == "Single")
            if (salary >= 130000) {
                tax = salary * 30 / 100;
            } else if (salary < 130000 && salary >= 100000) {
                tax = salary * 25 / 100;
            } else if (salary < 100000 && salary >= 80000) {
                tax = salary * 20 / 100;
            } else {
                tax = salary * 15 / 100;
            }

        System.out.println(salary-tax);

*/


            if (salary >= 130000) {
                taxRate = 0.35;
            } else if (salary < 130000 && salary >= 100000) {
                taxRate = 0.3;
            } else if (salary < 100000 && salary >= 80000) {
            taxRate = 0.25;
        } else {
            taxRate = 0.2;
        }
            if (isMarried){taxRate -= 0.05;}
            double salaryAfterTax= salary- (salary*taxRate);
        System.out.println("salaryAfterTax = " + salaryAfterTax);




    }
}


 /*
 2. Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
      			30% for salary of 100K to 130k (excluded)
      			25% for salary of 80K to 100K (excluded)
      			20% for salary less than 80K

                in addition, if the person is married, he/she will pay 5% less tax
  */