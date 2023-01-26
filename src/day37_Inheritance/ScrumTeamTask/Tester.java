package day37_Inheritance.ScrumTeamTask;

public class Tester extends Employee{//Tester IS A Employee
    public Tester(String name, int age, char gender, String ID, String jobTitle, double salary) {
        super(name, age, gender, ID, jobTitle, salary);
    }
    public void test(){
        System.out.println(name + " is creating a ticket");
    }



}
/*
	3. Create a sub class of Employee named Tester:

			Add any extra variable or method that Tester object need to have
 */