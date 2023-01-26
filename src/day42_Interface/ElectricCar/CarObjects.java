package day42_Interface.ElectricCar;

public class CarObjects {
    public static void main(String[] args) {
        TeslaSemi semi= new TeslaSemi("2019", 100000, "Black", 3.50);
        var truck= new TeslaTruck("2020", 120000, "Yellow",6.00);
        var ford= new Ford("2021", 80000, "Blue", 2022);
        var tesla= new Tesla("Last", 150000, "Grey");
        System.out.println(semi);
        semi.load("Food");
        System.out.println("-------------");
        System.out.println(truck);
        System.out.println(truck.toString());
        truck.start();
        System.out.println("---------------");
        System.out.println(ford);
        ford.drive();
        System.out.println("------------");
        System.out.println(tesla);
        tesla.charge();


    }
}
