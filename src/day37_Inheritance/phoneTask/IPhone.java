package day37_Inheritance.phoneTask;

public class IPhone extends Phone{

    public IPhone(String model, String color, String size, double price) {
        super("Apple", model, color, size, price);
    }

    public void faceTime(long phoneNumber){
        System.out.println(brand+ " " + model + " is having Face Time with " + phoneNumber);
    }
    public void faceTime(String email){
        System.out.println(brand+ " " + model + " is having Face Time with " + email);
    }
}
