package day42_Interface.ElectricCar;

public class Tesla extends ElectricCar{

    public Tesla(String model, double price, String color) {
        super(model, price, color);
    }

    @Override
    public void start() {
        System.out.println("Tesla starts by pressing the start button.");
    }

    @Override
    public void charge() {
        System.out.println("Tesla is being charged by electric");
    }

    @Override
    public void drive() {
        System.out.println("Driving Tesla is very easy.");
    }
}
