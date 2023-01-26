package day40_AccessModifiers_Final_Hiding.day40_AccessModifiers_Final_Hiding_2;

import day40_AccessModifiers_Final_Hiding.Car;

public class Car2 extends Car {

    public Car2(){
        //model="M3";//default. if you have an access you can inherit. so you can inherit protected but not private or default in a dif package
        engine=2.00;//protected. you have inheritance relationship
        year=2019;//public

    }


}
