package day41_Abstraction.Animal;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void sleep() {

    }
    @Override
    public void breath() {
        //super.breath();
        System.out.println("Dog is breathing");
    }

}
