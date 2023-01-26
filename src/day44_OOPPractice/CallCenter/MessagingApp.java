package day44_OOPPractice.CallCenter;

public abstract class MessagingApp {
    public String name;
    protected boolean isFree;
    boolean allOSCompatible;
    private static int count;//you have to have getter and setter because it is private
    public static final String APP_TYPE="Call Center";

    public MessagingApp() {//constructor
        System.out.println("Messaging app non-arg constructor");
    }
    public MessagingApp(String name, int count){
        this.name=name;//name belongs to object
        MessagingApp.count=count;//because count belongs to class
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        MessagingApp.count = count;
    }

    public abstract void sendMessage(String message);
    public void launch(){
        System.out.println("MessagingApp is launched");
    }
    public static void close(){//you can not override static methods
        System.out.println("MessagingApp is closed");
    }


}
/*
Variable: public String name
Variable: protected boolean isFree
Variable: boolean allOSCompatible
Variable: private static int count
Variable: public static final String APP_TYPE
Constructor: No-Argument
Abstract Method: void sendMessage(String msg)
Instance Method: void launch()
Static Method: void close()
 */