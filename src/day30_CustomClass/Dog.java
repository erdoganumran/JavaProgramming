package day30_CustomClass;

public class Dog {//public: access modifier. class is class keyword. dog is class name.//CUSTOM CLASS. you can think Dog is object and name, breed etc variables or values of the object.
//We don't need main method. because they meant to create objects. not meant for running.

    //class is a template and collection of similar objects
    public String name;    // these are attributes.attributes==fields.instance variable.
    public String breed;//we have different copies for the variable breed for each dog. each dog have different breed because each object will be different
    public int age;// every object will have different age, gender etc.
    public char gender;//instance means each object have different copy for every method and attribute.
    public String size;
    public  String color;

    public void setInfo(String dogName,String dogBreed,int dogAge,char dogGender, String dogSize, String dogColor){
        name=dogName;
        breed=dogBreed;
        age=dogAge;
        gender=dogGender;
        size=dogSize;
        color=dogColor;
    }

    public void eat()
    {//methods
        System.out.println(name+ " is eating");
    }// instance methods of objects
    public void bark(){
        System.out.println(name+ " is barking");
    }//if it is static, means every dogs will be barking.but if it is instance, each objects will have different copy.

    public String toString() {// if you dont have string method you will get hashcode
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
//toString is needed for every class in order to print the object. right click+generate+choose objects
//when your attributes and methods are ready, now you can create objects.

}
/*
Attributes: you will give as an instance
           name, age, gender, bree, size, color: every object will have separate copy of these objects.

Actions:
        eat(), play(),bark()...



 */