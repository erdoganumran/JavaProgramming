package day42_Interface.ElectricCar;

public class Ford extends ElectricCar{
    private int year;
    public Ford(String model, double price, String color, int year) {
        super(model, price, color);
        this.year=year;
    }

    public int getYear() {
        return year;
    }

    @Override
    public void start() {
        System.out.println("Ford starts by key.");
    }

    @Override
    public void charge() {
        System.out.println("Ford needs oil to charge.");
    }

    @Override
    public void drive() {
        System.out.println("Driving Ford is very easy.");
    }
}
