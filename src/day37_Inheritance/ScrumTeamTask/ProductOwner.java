package day37_Inheritance.ScrumTeamTask;

public class ProductOwner extends Employee{
    public ProductOwner(String name, int age, char gender, String ID, double salary) {
        super(name, age, gender, ID, "Product Owner", salary);
    }
    public void UserStory(){
        System.out.println(name + " is writing user stories");
    }
}
