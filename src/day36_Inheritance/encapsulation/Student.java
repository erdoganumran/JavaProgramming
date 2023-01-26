package day36_Inheritance.encapsulation;

import java.util.Arrays;

public class Student {
     private String name;
     private int age;
     private char gender, grade;
     public static  boolean isStudent=true;
     private static String schoolName;
     static {
         schoolName="Cydeo";
     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<5 || age>90){
            return;// if it is not true it will give 0, null , or you can add error message
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(!(gender=='M' || gender=='F')){
            System.err.println("Gender should be F or M");
            System.exit(0);
        }
        this.gender = gender;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
         if(!Arrays.asList('A', 'B', 'C', 'D', 'F').contains(grade)){
             System.out.println("Invalid grade");
             System.exit(0);
         }
        this.grade = grade;
    }

    public Student(String name, int age, char gender, char grade) {
        setName(name);
        setAge(age);
        setGender(gender);
        setGrade(grade);
    }

    public void study(){
        System.out.println(name+ " is studying.");
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                '}';
    }
}


/*
	1. Create a class named Student:
			private variables:
				name, age, gender, grade, schoolName

			Encapsulate all the fileds (at least encapsulate two fields manually)
					requirments:
						1. age should not be set less than 5 or greater than 90
						2. gender should not be set to any chanarcter other than: 'M' and 'F'
						3. grade should not be set to any chanacters other than: 'A', 'B', 'C', 'D', and 'F'

			Add a constructor that can set all teh fields when the object is created
						(requirments of fileds in the above must be applied)


			Methods:
				study()
				toString()
 */