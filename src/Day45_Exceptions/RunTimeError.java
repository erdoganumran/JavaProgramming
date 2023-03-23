package Day45_Exceptions;

public class RunTimeError {
    public static void main(String[] args) {
        go();//again again it will call go method and it will give runtime error "StackOverflowError"
    }
    public static void go(){
        System.out.println("Going");
        go();
    }
}
