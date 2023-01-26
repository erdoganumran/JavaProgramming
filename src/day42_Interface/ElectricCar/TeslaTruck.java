package day42_Interface.ElectricCar;

public class TeslaTruck extends TeslaSemi{
    public TeslaTruck(String model, double price, String color, double engineSize) {
        super(model, price, color, engineSize);
    }

    @Override
    public void load(String item) {
        System.out.println("TeslaTruck load: " + item+ " is loading by lowering the truck and opening the door.");
    }

    @Override
    public void start() {
        System.out.println("Tesla Truck starts by pressing the button.");
    }

    @Override
    public void charge() {
        System.out.println("Tesla Truck plugs in charge for 30 min.");
    }

    @Override
    public void drive() {
        System.out.println("Tesla Truck can be driven by load.");
    }
}
