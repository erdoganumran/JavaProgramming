package day43_Polymorphism;

public class InstanceOf {
    public static void main(String[] args) {

        Shape sh = new Circle();
        if (sh instanceof Triangle) {
            System.out.println("Triangle");
        } else if (sh instanceof Circle) {
            System.out.println("Circle");
        } else System.out.println("Square");
    }
}
//instanceof operator can be used to check if the object is certain class.}
