package day43_Polymorphism.Apple;

public class Mac extends AppleDevice{
    @Override
    public void use() {
        System.out.println("using Mac");
    }
    public void code(){
        System.out.println("coding in Mac");
    }
}
