package day37_Inheritance.ScrumTeamTask;

public class Developer extends Employee{
    public Developer(String name, int age, char gender, String ID, String jobTitle, double salary) {
        super(name, age, gender, ID, jobTitle, salary);
    }
    public void fixBug(){
        System.out.println(name + " is fixing bugs");
    }
}
/*
	4. Create a sub class of EMployee named Developer:

			Add any extra variable or method that Developer object need to have
 */