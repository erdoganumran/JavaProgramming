package day37_Inheritance.phoneTask;

public class PhoneShop {

    public static void main(String[] args) {

        IPhone iphone = new IPhone("Iphone 12", "Black", "6.7 inches", 1000);

        Samsung samsung = new Samsung("galaxy S19", "White", "6 inches", 900);

        Nokia nokia = new Nokia("Brick", "Gray", "4 inches", 50);

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(911);
        iphone.text(123456789);
        iphone.faceTime(78945613);
        iphone.faceTime("yahoo@gmail.com");

        System.out.println("--------------------------------------------------");

        samsung.call(911);
        samsung.text(123456789);
        samsung.freeze();

        System.out.println("--------------------------------------------------");

        nokia.call(432109876);
        nokia.text(321098765);
        nokia.selfDefense();

        System.out.println("-------------------------------------------------");

        System.out.println( Phone.hasBattery );
        System.out.println( IPhone.hasBattery );
        System.out.println( Samsung.hasBattery );
        System.out.println( Nokia.hasBattery );


    }

}

