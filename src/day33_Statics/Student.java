package day33_Statics;

public class Student {
    public String name, studentID;
    public char gender, grade;
    public int age;// if we have multiple objects we have to create instance variables

    public Student(String name){
        this.name=name;
    }
    public Student(String name, char gender){
        this(name);//ctrl and space will give constructor suggestions
        this.gender=gender;
    }
    public Student(String name, String studentID){
        this(name);
        this.studentID=studentID;
    }
    public Student(String name, String studentID, char grade){
        this(name,studentID);
        this.grade=grade;
    }
    public Student(String name, char gender, int age){
        this(name, gender);
        this.age=age;
    }
    public Student(String name, String studentID,char gender, int age){
        this(name, studentID);
        this.gender=gender;
        this.age=age;

    }
    public Student(String name,String studentID, char gender, int age, char grade){
        this(name, studentID, gender, age);
        this.grade=grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentID='" + studentID + '\'' +
                ", gender=" + gender +
                ", grade=" + grade +
                ", age=" + age +
                '}';
    }

}
/*
Warmup tasks:

	Student Task:
		1. Create a class called Student:
				Attributes:
					name, gender, age, studentID, grade

				Add a constructor that allows user to create object by setting the name of student

				Add a constructor that allows user to create object by setting the name and gender of the student

				Add a constructor that allows user to create object by setting the name and studentID of the student

				Add a constructor that allows user to create object by setting the name, studentID and grade of the student

				Add a constructor that allows user to create object by setting the name, gender and age of the student

				Add a constructor that allows user to create object by setting the name, gende, age and studentID of the student

				Add a constructor that allows user to create object by setting the name, gende, age, studentID and grade of the student

				Actions:
					toString()
					study()
 */