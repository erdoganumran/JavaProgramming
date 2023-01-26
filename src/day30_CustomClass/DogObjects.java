package day30_CustomClass;

import java.util.ArrayList;

public class DogObjects {
    public static void main(String[] args) {
        Dog dog1=new Dog();// this is how to object of dog created
        //Class Name Object Name= Keyword(new) Constructor();
        dog1.name="Lucy";// I set the attribute
        dog1.breed="Husky";dog1.age=5;
        dog1.gender='F';
        dog1.size="Big";
        dog1.color="Black";

        Dog dog2= new Dog();
        dog2.name="Ace";//objectName.attributes=variable;
        dog2.breed="Husky";dog2.age=3;
        dog2.gender='M';
        dog2.size="Small";
        dog2.color="Brown";

        Dog dog3= new Dog();
       dog3.setInfo("Jack", "Pit-Bull",7, 'M', "Large", "Black-White");
// we creat a method called setInfo to make description easier

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        dog1.eat();
        dog2.bark();

        Dog dog4= new Dog();
        dog4.setInfo("Cookie", "German Shepard", 2, 'M', "Large", "Brown");

        Dog dog5=new Dog();
        dog5.setInfo("Papa", "Terrier", 1, 'F', "Small", "White");

        Dog [] dogs= {dog1, dog2,dog3,dog4, dog5};
        ArrayList <Dog> femaleDogs= new ArrayList<>();
        ArrayList <Dog> maleDogs= new ArrayList<>();

        for (Dog each : dogs) {
            if (each.gender=='F'){
                femaleDogs.add(each);
            }else {
                maleDogs.add(each);
            }
        }
        System.out.println(femaleDogs);
        System.out.println(maleDogs);


    }
}
