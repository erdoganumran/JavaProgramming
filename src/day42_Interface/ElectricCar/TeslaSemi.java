package day42_Interface.ElectricCar;

public class TeslaSemi extends ElectricTruck {
    private double engineSize;
    public TeslaSemi(String model, double price, String color, double engineSize) {
        super(model, price, color);
        this.engineSize=engineSize;
    }
    public double getEngineSize() {
        return engineSize;
    }
    @Override
    public void load(String item) {
        System.out.println("TeslaSemi load: " + item+ " is loading by lowering the truck and opening the door.");
    }

    @Override
    public void start() {
        System.out.println("TeslaSemi starts by pressing the button.");
    }

    @Override
    public void charge() {
        System.out.println("TeslaSemi plugs in charge for 30 min.");

    }

    @Override
    public void drive() {
        System.out.println("TeslaSemi - truck is driving with load.");
    }

}
