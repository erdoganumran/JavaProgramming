package day37_Inheritance.animalTask;

public class Dog extends Animal{

    //public int a;

    public Dog(String name, String breed, char gender, int age, String size, String color){//this is a constructor
        super(name, breed, gender, age, size, color);//super keyword functionality is similar with this keyword
   //this.a=a;-->for new attributes
    }

    public void bark(){

        System.out.println(name+" is barking");
    }

}