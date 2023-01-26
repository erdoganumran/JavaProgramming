package day44_OOPPractice.Shapes;

public class Test1 {
    public static void main(String[] args) {
        Shape diamond= new Diamond();
        Shape square= new Square();
        Object shape= new Shape();

        diamond.draw();
        square.draw();
        ((Square)square).squareMethod();
    }
}
