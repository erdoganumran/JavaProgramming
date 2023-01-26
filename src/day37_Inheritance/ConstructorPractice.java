package day37_Inheritance;

class A{

    public A(int a){
        System.out.println("A");
    }

}

class B extends A{

    public B(){
        super(9);// If parent class parameter is not default you have to call super class by super keyword and pass the argument
        System.out.println("B");
    }

}

public class ConstructorPractice {

    public static void main(String[] args) {

        B obj = new B();//A   B

    }

}