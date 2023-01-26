package day30_CustomClass;

public class Car {

    //ALL THESE FOR CREATING AN OBJECT.
    //FIRST CREATE ATTRIBUTES, THEN METHOD, LASTLY TOSTRING METHOD.

    public String brand;//attributes. every object have different attributes. public means always accessible.then we will create a method for these inputs.
    public String model;
    public String color;
    public int year;
    public double price;

    public void setInfo(String carBrand, String carModel, String carColor, int carYear, double carPrice){
        brand=carBrand;
        model=carModel;
        color=carColor;
        year=carYear;
        price=carPrice;
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price= $" + price +
                '}';
    }

    public void drive(){
        System.out.println("Driving " + brand+ " "+ model);
    }
    public void start(){
        System.out.println(brand+ " is starting");
    }
    public void stop(){
        System.out.println(brand+ " is stopped");
    }


}
/*
Car Class:

	Attributes:
		brand, model, color, year, price

	Actions:
		drive(), start(), stop(), toString(), setInfo()
 */