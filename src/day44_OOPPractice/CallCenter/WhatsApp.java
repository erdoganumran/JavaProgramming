package day44_OOPPractice.CallCenter;

public class WhatsApp extends MessagingApp implements VoiceCallable, VideoCallable{
    @Override
    public void sendMessage(String message) {
        System.out.println("You have a message on Whatsapp: " + message);
    }

    @Override
    public void videoCall() {//abstract method
        System.out.println("Make a video call on Whatsapp");
    }

    @Override
    public void call(String contact) {
        System.out.println("Call " + contact);
    }



}
