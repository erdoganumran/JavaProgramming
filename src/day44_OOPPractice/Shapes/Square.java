package day44_OOPPractice.Shapes;

public class Square extends Shape{
    public Square() {
        type="Square";
    }

    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
    public void squareMethod(){
        System.out.println("Square method");
    }
}
