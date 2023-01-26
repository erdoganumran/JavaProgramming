package day44_OOPPractice.CallCenter;

public interface VoiceCallable{
    boolean CAN_CALL=true;//because this is final in interface. public static final boolean CAN_CALL=true;
    //abstract method
    void call(String contact);
    //static method
    static void decline(){
        System.out.println("Call is declined");
    }
    //default method
    public default void accept(){
        System.out.println("Call is accepted");
    }
}
/*
Variable: boolean CAN_CALL
Abstract Method: void call(String contact)
Static Method: void decline()
Default Method: void accept()
 */