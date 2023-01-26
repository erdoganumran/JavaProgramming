package day43_Polymorphism.Apple;

public class IPad extends AppleDevice{
    @Override
    public void use() {
        System.out.println("using IPad");
    }
    public void draw(){
        System.out.println("drawing in IPad");
    }
}
