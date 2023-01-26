package day34_GarbageCollection_AccessModifiers;

public class Constructor_vs_StaticBlock {
    static {
        System.out.println("Static Block");

    }
    public Constructor_vs_StaticBlock(){
        System.out.println("Constructor");
    }// if we don't have or create any object, constructor won't be executed

    public static void main(String[] args) {
        System.out.println("Main Method");
        new Constructor_vs_StaticBlock();
    }
}
