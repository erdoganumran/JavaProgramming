package day41_Abstraction.Animal;

public class Parrot extends Bird{
    public Parrot(String name) {
        super(name);
    }

    @Override
    public void sleep() {// because this is abstract from animal
        System.out.println("parrot is sleeping");
    }

    @Override
    public void love() {//abstract in bird class
        System.out.println("parrot is loving");
    }
    public void speak(){
        System.out.println("Parrot is speaking");
    }

    @Override
    public void breath() {
        System.out.println("Parrot is breathing");
        super.breath();//Animal is breathing
    }

//    @Override
//    public void walk() {
//        super.walk();//bird is walking
//    }
}
