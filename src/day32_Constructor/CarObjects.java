package day32_Constructor;

public class CarObjects {
    public static void main(String[] args) {
        Car car1= new Car("Toyota");
        Car car2= new Car("Toyota", "Corolla");
        Car car3= new Car("Honda", "Civic", 2022);
        Car car4= new Car("Audi", "A5", 2021, 100000);
        Car car5= new Car("Testa", "Model 3", 2021, 150000, "Black");
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
    }
}
