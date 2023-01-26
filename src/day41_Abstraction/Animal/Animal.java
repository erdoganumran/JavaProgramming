package day41_Abstraction.Animal;

public abstract class Animal {// we can not create an object from this class it is because abstract
    //for example, you can make you utility classes abstract because you don't need to create object from this classes

    public Animal(String name) {
    }

    public void eat(){//// this is instance method
        System.out.println("Animal is eating");
//block-implementation
    }
    //the way write to abstract method
    public abstract void sleep();//abstract method. child class has to put the implementation for abstract class
    public void breath(){
        System.out.println("Animal is breathing");
    }
    public void move(){//instance method

    }
    //regular class can not have abstract method

}
