package day40_AccessModifiers_Final_Hiding;

public class TestMouse {
    public static void main(String[] args) {

        //there is a default constructor here you don't see as like
        //public Mouse(){super;}
        Mouse mouse= new Mouse();
        mouse.getRodentDetails();// this is in the parent class and, we have same int tailLength so, it will take parent value which is 4
        mouse.getMouseDetails();// this is from child class so, it means it will go child class will take child value

        }
    }

