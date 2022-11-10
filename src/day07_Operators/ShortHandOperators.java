package day07_Operators;

public class ShortHandOperators {

    public static void main(String[] args) {

        //assignment=
        int number =100;
        System.out.println("number = " + number);//100
        number = 200; // changed the value of number
        System.out.println("number = " + number);

         String word = "Java Programming";
        System.out.println("word = " + word);// java programming
        word = "wooden spoon";
        System.out.println("word = " + word);// wooden spoon
        word= "124";
        System.out.println("word = " + word); //124

        System.out.println("--------------------------------------");

        //Addition assignment :
         int x=100;
        System.out.println("x = " + x);
        System.out.println(x+200);//300
        //System.out.println(x=+200);//200
        //x=x+200
        x+=200;
        System.out.println("x = " + x);
        
        String str ="Wooden";
        str += "Spoon";
        System.out.println("str = " + str);

        double num1 =2.5;
        System.out.println("num1 = " + num1);//2.5
        num1 +=5.5;
        System.out.println("num1 =" + num1);//8.0

        double avaliableBalance=1000.5;
        avaliableBalance += 300; //1300.5
        System.out.println("avaliableBalance = " + avaliableBalance);
        System.out.println("------------------------------");
        //withdrawing
        avaliableBalance -= 800;
        System.out.println("avaliableBalance = " + avaliableBalance);

        System.out.println("-----------------------------------");

        double salary = 50000.50;
        System.out.println("salary = " + salary);// 50000.50

        salary *= 2; //100001.00 // salary = salary *2
        System.out.println("salary = " + salary);

        double doge = 0.0000001;

        doge *= 10000000;
        System.out.println("doge = " + doge);

        System.out.println("-------------------------------");

        double num2= 25000;
        num2 /= 2; // num2 = num2/2
        System.out.println("num2 = " + num2);

        System.out.println("------------------------------");

        double num3= 100;
        num3 %=30;
        System.out.println("num3 = " + num3);//10.0

        System.out.println("------------------------------------");

        int amount = 127; // cents
        int quarters = amount /25;
        int cents = amount %= quarters;

        System.out.println("quarters = " + quarters);//5
        System.out.println("cents = " + cents);//2


        System.out.println("---------------------------");

        int cents2 = 127;

        cents2 %=25;
        System.out.println("cents2 = " + cents2);
        System.out.println("-----------------------");
         int y = 300;
         y %= 16;
        System.out.println("y = " + y);

        System.out.println("----------------------------");
        int balance = 3500;
         //insurance fee= $153;
        balance %= 153;
        System.out.println("/                                                                                                balance = " + balance);


        




    }
}
