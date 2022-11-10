package day04_Variables;

import jdk.nashorn.api.tree.ClassDeclarationTree;

public class EmployeeInfo {
    public static void main(String[] args) {

        String name = "Umran Erdogan";//if you have more than 1 characters (if it is text or SSN like 123-443-33), then use string
        double age = 36;
        char gender = 'F';
        String company = "Amazon";
        String title = "SoftwareTester";
        double yearsOfExperience = 3;
        int salary = 100000;
        boolean fullTime = true;
        boolean isMarried = true;
        String employeeId = "1627291";
        String SSN = "134-12-12-222";

        System.out.println("SSN = " + SSN);
        System.out.println("employeeId = " + employeeId);
        System.out.println("isMarried = " + isMarried);
        System.out.println("fullTime = " + fullTime);
        System.out.println("salary = " + salary);
        System.out.println("yearsOfExperience = " + yearsOfExperience);
        System.out.println("title = " + title);
        System.out.println("company = " + company);
        System.out.println("gender = " + gender);
        System.out.println("age = " + age);
        System.out.println("name = " + name);

    }

}
//6. Create a class named EmployeeInfo. declare the following variables:
// name (String)
// age (int)
// gender (char)
// company (String)
// jobTitle (String)
// yearsOfExpereince (double)
// salary (int)
// isFullTime (boolean)
// isMarried (boolean)
// employeeId (String)
// SSN (String)


