package day44_OOPPractice.CallCenter;

public class CallCenter {
    public static void main(String[] args) {
        WhatsApp wa= new WhatsApp();
        wa.allOSCompatible=true;
        wa.name="Umran";
        wa.isFree=true;
        wa.call(wa.name);
        wa.accept();
        wa.sendMessage("Thank you...");
        wa.videoCall();
        wa.launch();
        String appType = wa.APP_TYPE;
        System.out.println(appType);
        wa.setCount(10);
        System.out.println(wa.getCount());

        System.out.println(VoiceCallable.CAN_CALL);//true
        VoiceCallable.decline();

        MessagingApp.setCount(10);
        System.out.println(MessagingApp.getCount());

        VoiceCallable.decline();

        System.out.println("--------------------------------");

        VoiceCallable obj= new WhatsApp();//Messaging app non-arg constructor. Whatsapp extends Messaging app which has default cons. when run your code you will cons message,
        //go to VoiceCallable class, search the method. right side must be interface or parent.

        //right side decides where it goes. if you wanna reach left side method you can cast it like down below.
        ((MessagingApp)obj).launch();// go check VoiceCallable class. there is no launch method there. it is in the messaginApp class also whatsapp has access. you need to cast it.
        ((WhatsApp)obj).launch();

        ((MessagingApp)obj).allOSCompatible=false;
        obj.call("Umran");// go check call method in VoiceCallable and check if the method is overriden in Whatsapp class.
        //obj.sendMessage("aaaaa"); voiceCallable doesnt have sendMessage but whatsapp has it. but still like this it is giving compile error since c=vocecall doesnt have it.
        obj.accept();
        VoiceCallable.decline();//decline is static. so you can call it through class name.
        ((MessagingApp) obj).sendMessage("thanks...");

        ((WhatsApp) obj).videoCall();
        ((VideoCallable) obj).videoCall();//because whatsapp is implementing videoCall methods.

    }
}
