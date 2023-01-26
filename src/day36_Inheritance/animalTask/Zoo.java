package day36_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {


        Dog dog = new Dog();
        dog.setInfo("Max", "Husky", "Brown", 'M', 5, 3);
        dog.bark();
        dog.move();


        Cat cat = new Cat();
        cat.setInfo("Tarcin", "British", "White", 'f', 2, 4);
        cat.meow();
        cat.sleep();
        cat.move();
        cat.scratch();


        Fish fish = new Fish();


        Tiger tiger = new Tiger();
        tiger.setInfo("Khan", "Bengal", "Orange", 'F', 3, 4);
        tiger.roar();
        tiger.sleep();
    }
}