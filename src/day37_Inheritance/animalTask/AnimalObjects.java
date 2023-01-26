package day37_Inheritance.animalTask;

public class AnimalObjects {

        public static void main(String[] args) {

            Dog dog1 = new Dog("Alex", "Husky", 'M',1,"Small","White");

            System.out.println(dog1);

            dog1.bark();
            //dog1.scratch();
            //dog1.sing();

            Animal a1= new Animal("Animal", "Cat", 'f', 3, "large", "brown");
            System.out.println(a1);

            Cat cat1 = new Cat("Love", "Siamese",'F',2,"Large","Black");
            Cat cat2= new Cat("Lover", "Siamese",'m',2,"Large","White");
            System.out.println(cat1);
            cat1.scratch();
            System.out.println(cat2);
            //  cat1.bark();
            //  cat1.sing();


            Parrot parrot1 = new Parrot("King","Macaw",'M', 3,"Small", "Blue");

            System.out.println(parrot1);

            parrot1.sing();
            //  parrot1.bark();
            //  parrot1.scratch();


        }

    }
