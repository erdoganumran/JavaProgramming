package day36_Inheritance.animalTask;

public class Dog extends Animal{// dog is an animal. dog is sub/child class, animal is super/parent class

    public void bark(){
        System.out.println(name+ "is barking");
    }

    public static void main(String[] args) {
        Dog d1= new Dog();
        d1.setInfo("Puppy", "Husky", "white", 'f', 2, 2);//this is setInfo method
    }

}
/*
dos has 8 variable now after extending and 6 methods
 */