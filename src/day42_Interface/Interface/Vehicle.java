package day42_Interface.Interface;

import day42_Interface.ElectricCar.TeslaTruck;

import java.util.ArrayList;

public class Vehicle extends Tesla implements SelfDriving, Electric{
    public void drive(){
        System.out.println("Vehicle is driven");
    }
    @Override
    public void charge() {
        ArrayList<String> arr= new ArrayList<>();
    }
    @Override
    public void charge2() {

    }

    @Override
    public void C() {

    }

    @Override
    public void selfDrive() {

    }

    @Override
    public void A() {
        SelfDriving.super.A();//both have same method, you have to override the default method
        Electric.super.A();
    }

    //arrayList is an interface
}
