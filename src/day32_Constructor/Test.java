package day32_Constructor;

public class Test {
    public Test(){//A
        System.out.println("A");
    }
    public Test(int a){
        this();
        System.out.println("B");//A B
    }
    public Test(double a){
        this(10);
        System.out.println("C");//A B C
    }
    public Test(String a){
        this(10.0);
        System.out.println("D");//A B C D
    }

    public static void main(String[] args) {
        Test T1= new Test("C");
        System.out.println(T1);
    }

}
