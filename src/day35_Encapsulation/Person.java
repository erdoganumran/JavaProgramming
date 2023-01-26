package day35_Encapsulation;

public class Person {
    public String name;
    public String language;
    public int age;
    public char gender;
    public static String planet;
    public static boolean isHuman, hasNose;
    public static int numberOfWings, numberOfHead;

    static {
        isHuman=true;
        hasNose=true;
        planet="Earth";
        numberOfHead=1;
        numberOfWings=0;
    }

    public Person(String name, String language, int age, char gender) {// we create object by constructors
        this.name = name;// if parameter is having the same name with the instance name, we use this keyword this.instance= variable
        this.language = language;
        this.age = age;
        this.gender = gender;
    }

    public static void printPlanetName(){// if the method is static, i can call method through the class name, i dont have to create an object
        //but objects has everything that class has. so i can also call statics through the object.
        System.out.println(planet);
        //System.out.println(name);-> will give error because name is instance
    }
    public void eat(String food){
        System.out.println(name + " is eating " + food);
    }
    public void drink(String drink){// we use instance name, that is why it is not static
        System.out.println(name + " is drinking " + drink);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", planet=" + planet +
                '}';
    }
}
/*
	1. Create a class named Person:
			Variables:
				name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead

			Add a constructor to initialize all the fields

			Add a static block to initialize all the statics

			Methods:
				printPlanetName()
				eat(String food)
				drink(String drink)
				toString()

 */