package Day45_Exceptions;

import java.util.ConcurrentModificationException;

public class ThrowAndThrows {
    public static void main(String[] args) throws Exception{
        System.out.println("Hello World");
        try{
            throw  new RuntimeException("This is throw exception");// we made it manually
        }catch (Exception e){
            e.printStackTrace();
        }
        //throw new RuntimeException("second runtime");

        String userName="";
        if (userName.isEmpty()){
            throw new RuntimeException("User name can not be empty");
        }
        else {
            System.out.println("Valid username");
        }

        sleep3(2);

    }

    public static void sleep(int seconds) throws InterruptedException {
        Thread.sleep(seconds*1000);//this is checked exception
        //if it is checked i have to handle it with try-catch ot throws declaration

    }
    public static void sleep2(int second) {
        try {
            sleep(second);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void sleep3(int seconds) {
        sleep2(seconds);
    }


}
