package day32_Constructor;

public class Employee {
    public String name, jobTitle;
    public char gender;
    public double salary;

    public Employee(String name){
        this.name=name;
    }
    public Employee(String name, char gender){
        this(name);// you can call constructors like this.this();
        this.gender=gender;

    }
    // if we have multiple constructor it means we have multiple options to creat an object

    public Employee(char gender,double salary){
        this.gender=gender;
        this.salary=salary;
    }
    public Employee (String name,char gender, double salary ){
        this(gender, salary);
        this.name=name;

    }

    public Employee (String name,char gender, String jobTitle, double salary) {
        this(name, gender, salary);
        this.jobTitle=jobTitle;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", gender=" + gender +
                ", salary=" + salary +
                '}';
    }
/*
    public void method1(){
        System.out.println("hello");
    }
    public void method2(){
        method1();
    }*/
}
