package day04_Variables;

public class Currency {

    public static void main(String[] args) {

        int dollar = 9999;

        double lira = dollar * 17.53;
        double euro =dollar * 0.9;
        double jpy = dollar*114.14;

        System.out.println("dollar = " + dollar);
        System.out.println("euro = " + euro);
        System.out.println("lira = " + lira);
        System.out.println("jpy = " + jpy);
    }
}
