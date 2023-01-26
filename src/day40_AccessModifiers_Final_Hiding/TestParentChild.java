package day40_AccessModifiers_Final_Hiding;

public class TestParentChild {
    public static void main(String[] args) {
        Child c= new Child();//200
        System.out.println("value of x before incrementation " + c.x);
        c.increment();
        c.increment();
        System.out.println(c.x);
        System.out.println("--------------------------------");
        Parent p=new Parent();//100
        System.out.println("value of x before incrementation " + p.x);
        p.increment();
        p.increment();
        System.out.println(p.x);
    }
}
