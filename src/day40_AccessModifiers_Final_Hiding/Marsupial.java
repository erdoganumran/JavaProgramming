package day40_AccessModifiers_Final_Hiding;

public class Marsupial {
    public static boolean isBiped(){
        return false;
    }// if it is static it will hide this method from the child class

    public void getMarsupialDescription(){
        System.out.println("Marsupials walks on the two legs:" + isBiped());
    }
}
