package day37_Inheritance.ScrumTeamTask;

public class ScrumMaster extends Employee{
    public ScrumMaster(String name, int age, char gender, String ID, double salary) {
        super(name, age, gender, ID, "Scrum Master", salary);
    }
    public void meeting(){
        System.out.println(name + " is at meeting");
    }
}
