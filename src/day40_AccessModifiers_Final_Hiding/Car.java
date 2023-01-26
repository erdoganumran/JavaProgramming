package day40_AccessModifiers_Final_Hiding;

public class Car {

    String model;//default
    public int year;
    private int door;
    protected double engine;

    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", door=" + door +
                ", engine=" + engine +
                '}';
    }
}
