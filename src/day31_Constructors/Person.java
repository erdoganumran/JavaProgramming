package day31_Constructors;

public class Person {//this is class, class represents an object. this class or object name is Person.
    //Constructor method name has to be Person.

    public String name;
    public char gender;
    public int age;
    //these are helping us to set the objects


    public Person(String name, char gender, int age){//this is a constructor. (parameters)
        this.name=name;
        this.gender=gender;
        this.age=age;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
