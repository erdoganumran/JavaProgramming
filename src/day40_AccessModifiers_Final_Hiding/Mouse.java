package day40_AccessModifiers_Final_Hiding;

public class Mouse extends Rodent{
    protected int tailLength=8;

    public void getMouseDetails(){
        System.out.println("tail: " + tailLength+ ", parentTail: " + super.tailLength);
        //i have to write super keyword to specific parent class value with the same name
    }
}
