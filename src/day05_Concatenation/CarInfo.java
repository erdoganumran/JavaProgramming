package day05_Concatenation;

public class CarInfo {
    public static void main(String[] args) {
        String model = "tesla",
                color = "blue";
        int price = 80000,
                miles = 20000,
                year = 2022,
                make = 2020;

        System.out.println(year + " "+ model + ", " + miles + " miles, " +color+ ", $" + price);

        String name = "umran";

        System.out.println(name);



    }
}
//1. Create a class called CarInfo.java
//2. Declare the following variables:
//1. year
//2. make
//3. model
//4. miles
//5. color
//6. price
//3. Use concatenation to print the full info of the car in
//the following format:
//Year Make Model, Miles, Color, Price.
//Example:
//2018 Toyota Camry, 50000 miles, Red, $19000.