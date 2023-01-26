package day41_Abstraction.Animal;

public abstract class Bird extends Animal{

    public Bird(String name) {
        super(name);
    }

    public void walk() {
        System.out.println("bird is walking");
    }
    public abstract void love();

}
