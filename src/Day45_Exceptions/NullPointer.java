package Day45_Exceptions;

public class NullPointer {
    static String name;
    public static void main(String[] args) {
        try {
            System.out.println(name.toUpperCase());//implemeting null value a method
        }catch (NullPointerException e){
            System.out.println("Null pointer exception happened");
            System.out.println("e.getMessage() = " + e.getMessage());
            System.out.println("e.getStackTrace() = " + e.getStackTrace());
            e.printStackTrace();
            System.out.println("e.toString() = " + e.toString());
        }

        //finally block: always execute. for example you went to data and you want to close it before move on.
   //• Finally block, always runs except in 2 situations:• System.exit(0);• JVM crash

    }
}
