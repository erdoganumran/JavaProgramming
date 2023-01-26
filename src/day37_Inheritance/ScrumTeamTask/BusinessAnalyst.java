package day37_Inheritance.ScrumTeamTask;

public class BusinessAnalyst extends Employee{
    public BusinessAnalyst(String name, int age, char gender, String ID, double salary) {
        super(name, age, gender, ID, "Business Analyst", salary);
    }
    public void analyze(){
        System.out.println(name + " is analyzing the requirements");
    }
}
