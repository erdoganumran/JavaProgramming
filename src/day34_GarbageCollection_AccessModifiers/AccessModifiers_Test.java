package day34_GarbageCollection_AccessModifiers;

public class AccessModifiers_Test {
    public static void main(String[] args) {
        System.out.println(AccessModifiers.publicData);
        System.out.println(AccessModifiers.defaultData);

        AccessModifiers.method2();
        AccessModifiers.method3();//method 4 is private, i can not call it
    }
}
