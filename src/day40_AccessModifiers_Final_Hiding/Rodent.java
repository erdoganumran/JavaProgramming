package day40_AccessModifiers_Final_Hiding;

public class Rodent {
    protected int tailLength=4;
    public void getRodentDetails(){
        System.out.println("parentTail:" + tailLength);
    }
}
