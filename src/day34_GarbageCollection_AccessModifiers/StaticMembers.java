package day34_GarbageCollection_AccessModifiers;

public class StaticMembers {//any outer class can not be static but inner class can be. (nested classes)
    public static int num=100;//static variable
    public static void method(){//static method
    }
    static{//static block

    }
    static class class1{//inner class

    }
    static class A{//Outer class

        static class B{//inner class

        }
    }

}
