package day33_Statics;

public class TestIphone {
    public static void main(String[] args) {
        Iphone i1=new Iphone();
        i1.color="Yellow";
        System.out.println(i1.color);
        System.out.println(Iphone.isTouchScreen);//if it is static yopu can call method by class but if it is instance you have to create object
        Iphone.printHasBatter();
        i1.size="5";
        System.out.println(i1);
    }
}
