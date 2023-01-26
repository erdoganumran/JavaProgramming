package day42_Interface.Interface;

public interface Electric {

    public static final boolean hasBateries=true;
    boolean isHasBateries=false;//it is public static final

    public abstract void charge();
    void charge2();//it is always public abstract in interfaces. you don't have to write public abstract.
    //class can extend only one class but Java allows a class implement a lot of interfaces. but you have override all the methods in all the interfaces
    //in interface variables must be final or static

    //a class extends a class and interface at the same time.extends comes first
    //interfaces cannot have instance methods. they can have abstract, default and static method. d

    public default void A(){
        //public is redundant for interface members
    }
    public static void B(){//you don't have to override static and default method, because they have implemantation they have body. you have to do it in abstract methods
        //body/implementation

        //static is hiding
    }
    abstract void C();
    //interfaces cannot have static block and instance block

}
