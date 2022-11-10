package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {

        String name = "Umran";
        String lastName = "Erdogan";
        int age = 34;
        String fullName = name + " " + lastName;
        String jobTitle = " SDET";
        String companyName= "Apple Inc";
        int salary = 100000;

        System.out.println("Full name of the person is " + name + " " + lastName);
        System.out.println(name + " " + lastName + " is " + age + " years old.");
        System.out.println(fullName + " is " + age + " years old.");
        System.out.println(fullName + " works at " + companyName + " as a " + jobTitle + ". Salary is $" + salary + ".");



    }
}
//1. Create a class called FullName.java
//2. Declare the following variables:
//1. firstName
//2. lastName
//3. Use concatenation to print the full address