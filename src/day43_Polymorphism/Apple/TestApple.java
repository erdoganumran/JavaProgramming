package day43_Polymorphism.Apple;

public class TestApple {
    public static void main(String[] args) {
        AppleDevice mac= new Mac();
        mac.use();//using Mac
        //mac.code();

        Mac mac2= new Mac();
        mac2.code();//coding in Mac
        mac2.use();//using Mac
    }
}
