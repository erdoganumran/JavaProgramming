package day43_Polymorphism.Apple;

public class IWatch extends AppleDevice{

    public void Wear(){
        System.out.println("wearing IWatch");
    }

    @Override
    public void use() {
        System.out.println("using IWatch");
    }
}
