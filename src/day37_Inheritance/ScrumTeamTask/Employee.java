package day37_Inheritance.ScrumTeamTask;

import javax.swing.*;

public class Employee extends Person{
    public String ID, jobTitle;
    public double salary;

    public Employee(String name, int age, char gender, String ID, String jobTitle, double salary) {
        super(name, age, gender);
        this.ID=ID;
        this.jobTitle=jobTitle;
        this.salary=salary;
    }

    public void work(){
        System.out.println(jobTitle+ " " + name+ " is working");
    }

    public String toString() {
        return "Employee{" +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                "ID='" + ID + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
/*
	2. Create a sub class of Person named Employee
			Extra variables:
				id, jobTitle, salary

			Extra methods:
				SetInfo(): sets the name, age, gender, id, jobTitle and salary of Employee Object
							Hint: after creating setInfo method of employee class, you can call the inheritend setInfo() to set the name, age, and gender

				work()

				toString(): generate toString seperately in Employee class so that name, age, gender, id, jobTitle and salary of the emplyee can be displayed
 */