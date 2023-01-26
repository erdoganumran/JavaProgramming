package day36_Inheritance.Employee;

public class Employee {
    public String name, jobTitle, id;
    public static String companyName="Cydeo";
    public char gender;
    public double salary;
    public  int age;

    public void setInfo(String name, String jobTitle, String id, char gender, double salary, int age) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.id = id;
        this.gender = gender;
        this.salary = salary;
        this.age = age;
    }
    public void work(){
        System.out.println(name + " is working");
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", id='" + id + '\'' +
                ", gender=" + gender +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
/*
	Employee:
		name, gender, age, jobTitle, id, salary, companyName
		setInfo(), work(), toString()


	Tester

	Developer

	Driver

	Teacher



 */