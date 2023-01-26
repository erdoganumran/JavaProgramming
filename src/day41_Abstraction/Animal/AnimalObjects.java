package day41_Abstraction.Animal;

public class AnimalObjects {
    public static void main(String[] args) {
        //Animal a= new Animal();--> it is abstract class and, it can not be instantiated. will give compile error
        Dog d= new Dog("Terrier");
        d.breath();
        System.out.println("-----------------");
        Parrot p=new Parrot("Brasil");
        p.love();
        p.sleep();
        p.speak();
        p.eat();
        p.breath();
        p.walk();

    }
}

