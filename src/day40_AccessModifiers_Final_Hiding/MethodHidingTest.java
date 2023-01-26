package day40_AccessModifiers_Final_Hiding;

public class MethodHidingTest {
    public static void main(String[] args) {
        Bear b= new Bear();
        b.eat();
        Panda p= new Panda();
        p.eat();
    }

}
class Bear{
    public static void eat(){
        System.out.println("Bear is eating");
    }
    public static void sneeze(){
        System.out.println("Bear is sneezing");
    }
    public static void hibernate(){
        System.out.println("Bear is hibernating");
    }
}
class Panda extends Bear{
    public static void eat(){// if parent class method is static child class has to be static
        System.out.println("Panda is eating");// but in static one we don't call it overriding it is hiding
    }
    public static void sneeze(){
        System.out.println("Panda is sneezing");
    }
    public static void hibernate(){
        System.out.println("Panda is hibernating");
    }
}
