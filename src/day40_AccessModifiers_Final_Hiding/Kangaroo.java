package day40_AccessModifiers_Final_Hiding;

public class Kangaroo extends Marsupial{
    public static boolean isBiped(){
        return true;
    }

    public void getKangarooDescription(){
        System.out.println("Kangaroos hops on two legs:" + isBiped());
    }
}
