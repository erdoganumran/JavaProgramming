package day30_CustomClass;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {
    public static void main(String[] args) {

        Car car1= new Car();//Car is data type or object.
        car1.setInfo("Mercedes", "a4", "black", 2016, 65000 );

        Car car2=new Car();
        car2.setInfo("Audi", "Q5", "white", 2019, 70000 );
        Car car3= new Car();
        car3.setInfo("BMW", "335is", "Red", 2020, 80000);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

/*        Car[] cars= {car1, car2, car3};
        System.out.println(Arrays.toString(cars));*/

        ArrayList<Car> carList= new ArrayList<>(Arrays.asList(car1, car2, car3));
        System.out.println(carList);

        for (Car each : carList) {
            System.out.println(each.brand+" " + each.price);
        }

        System.out.println("---------------------------------------------");

        /*
        bmw=2005-2008
        toyota=1996-1998
         */

        carList.removeIf(p->p.brand.equals("BMW") && p.year>=2005 && p.year<=2008);
        carList.removeIf(p->p.brand.equals("Toyota") && p.year>=1995 && p.year<=1997);

    }

}