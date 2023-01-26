package day43_Polymorphism.Apple;

import day40_AccessModifiers_Final_Hiding.Child;

public class TestMethod {
    public static void main(String[] args) {
Parent cha= new childA();
cha.m1();
Parent chb= new childB();
chb.m1();
MyInterface cha1= new childA();
cha1.m2();
childA cha2= (childA)cha1;// this is down casting to see childA method
        cha2.m2();
        cha2.m3();
        cha2.m2();

        //without creating an object casting is possible like below
        ((childA) cha1).m2();

    }
}
class Parent{
    public void m1(){
        System.out.println("PARENT");
    }
}
interface MyInterface{
    void m2();
}
class childA extends Parent implements MyInterface{
    public void m2() {
        System.out.println("m2 childA");
    }
    public void m3() {
        System.out.println("m3 childA");
    }
}
class childB extends Parent implements MyInterface{
    public void m2(){
        System.out.println("m2 childB");
    }
    public void m4(){
        System.out.println("m4 childB");
    }
}
