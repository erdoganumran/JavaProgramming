package day43_Polymorphism;

public class TestAnimal {
    public static void main(String[] args) {
        Animal a= new Animal();
        a.type();//Parent class Animal
        a= new Dog();
        a.type();//Child class Dog
        a=new Bird();
        a.type();//Parent class Bird

    }
}
class Animal{
    public void type(){
        System.out.println("Parent class Animal");
    }
}
class Dog extends Animal{
    public void type(){
        System.out.println("Child class Dog");
    }
}
class Bird extends Animal{
    public void type(){
        System.out.println("Parent class Bird");
    }
}
