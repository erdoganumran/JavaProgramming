package day34_GarbageCollection_AccessModifiers;

public class StaticBlock {
    public static void main(String[] args) {
        System.out.println("Main Method");
    }
    static {
        System.out.println("Static block");//only runs one time and first static block will be executed
    }
    static {
        System.out.println("Static block 2");//only runs one time and first static block will be executed
    }
    static {//you don't call static block, so can not initialize in the constructor
        System.out.println("Static block 3");//only runs one time and first static block will be executed
    }
}
