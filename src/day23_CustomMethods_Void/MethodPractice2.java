package day23_CustomMethods_Void;

public class MethodPractice2 {
    public static void hello() {
        System.out.println("hello");
    }

    public static void helloCydeo() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo");
        }
    }

    public static void main(String[] args) {
        hello();
        hello();
        hello();
        hello();
        hello();
        helloCydeo();//ctrl + come over helloCydeo with your mouse. it will be blue that method and click it takes you where your method is
        System.out.println("------------------------------------------");
        evenNumbers1to10();
    }//you can switch the place of method

    public static void evenNumbers1to10() {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}