package day30_CustomClass;

import day04_Variables.GallonsToLitters;

public class Student {//CLASS=STUDENT
    
    public String name;//ATTRIBUTE NAME
    public char gender;//ATTRIBUTE GENDER-- instance variable
    public int age;
    public String ID;
    public char grade;
    //local variables are declared in method, instance variables are declare outside the method. local and instance variable can have same name with using this keyword.
/*    public void setInfo(String name,char gender, int age, String ID, char grade ){//parameters
        this.name=name;// these are arguments- local variables
        this.gender=gender;//this.gender=instance variable, other gender is local variable or you can say user given argument
        this.age=age;
        this.ID= ID;
        this.grade= grade;
    }*/

    public void setInfo(String name, char gender, int age, String ID, char grade) {// i do this with shortcut. generate, constructor and choose all attibutes, click ok button, change class name and give void return type
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.grade = grade;
    }

    public void eat(){
        System.out.println(name + " is eating.");
    }
    public void sleep(){
        System.out.println(name + " is sleeping.");
    }
    public void drink(){
        System.out.println(name + " is drinking.");
    }
    public void code(){
        System.out.println(name + " is coding.");
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID='" + ID + '\'' +
                ", grade=" + grade +
                '}';
    }
}
/*
    Student Class:

        Attributes:
        name, gender, age, studentID

        Actions:
        eat(), sleep(), drink(), code()
        setInfo(): to set all the attributes of student object
        toString(): to print the full info of student
*/
