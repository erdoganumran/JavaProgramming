package day37_Inheritance.phoneTask;

public class Phone {
     public String brand, model, color, size;
     public double price;
     public static boolean hasBattery;

     public Phone(String brand, String model, String color, String size, double price) {
          this.brand = brand;
          this.model = model;
          this.color = color;
          this.size = size;
          this.price = price;
     }

     static {
          hasBattery = true;
     }

     public void call(long phoneNumber) {
          System.out.println(brand+ " " + model + " is calling " + phoneNumber);
     }

     public void text(long phoneNumber) {
          System.out.println(brand+ " " + model + " is texting " + phoneNumber);
     }

     public String toString() {
          return "Phone{" +
                  "brand='" + brand + '\'' +
                  ", model='" + model + '\'' +
                  ", color='" + color + '\'' +
                  ", size='" + size + '\'' +
                  ", price=" + price +
                  '}';
     }
}


/*
1. Phone Task:
		1.1 Create a class named Phone:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					toString()

		1.2 Create a sub class of Phone named IPhone:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					faceTime(long phoneNumber)
					faceTime(String email)
					toString()

		1.3 Create a sub class of Phone named Samsung:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					freeze()
					toString()

		1.4 Create a sub class of Phone named Nokia:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					selfDefense()
					toString()

		1.5 Create a class named Phone Objects and test of the sub class' objects
 */