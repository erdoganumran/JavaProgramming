package day05_Concatenation;

public class ShippingAdress {

    public static void main(String[] args) {
        String name = "Umran";
        String lastName = "Erdogan";

        String fullName= name + " " + lastName;

        int buldingNumber = 2023;
        String streetName = "101NE 53rd ";
        String city ="Oklahoma City";
        String state = " Oklahoma";
        int zipCode = 73105;

        System.out.println(fullName+ "\n" + streetName + "\n" +city + ", " + state + " " + zipCode);




    }
}

//Task
//1. Create a class called ShippingAddress.java
//2. Declare the following variables:
//1. name
//2. buildingNumber
//3. streetName
//4. city
//5. state
//6. zipCode
//3. Use concatenation to print the full address