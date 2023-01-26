package day40_AccessModifiers_Final_Hiding;

public class FinalVariables {

    public final int ROADSTER_MAX_RANGE=600;
    public  final  int MODEL_3_MAXSPEED;
    public final int MODEL_X_PASSENGERS;
    public static final String ADMIN_USERNAME;

    //static members go to VIP place(heap) we don't need to care about object or not. it  belongs to class.
    // constructors just only work when you create an object, that means static members can not belong to constructor
    public FinalVariables() {// this is constructor
        MODEL_3_MAXSPEED=40;
    }
    {
        MODEL_X_PASSENGERS=70;
    }// instance block only executes when you create an object before the constructor
    static {
        ADMIN_USERNAME="Mike";// this 'init method' or 'init statement' with just two curly braces {}
        //init is just shorthand for initiate.
        // Init method is a predefine method to initialize an object after its creation
        //static block only runs once whenever class is loading. it doesn't about creating an object
    }


    public static void main(String[] args) {
        FinalVariables finalVars= new FinalVariables();// new keyword invokes the constructor
        final int MAX_PASSENGERS_COUNT=5;//THIS IS LOCAL VARIABLE BECAUSE IT IS IN THE METHOD
        //public final int=40; local variables can not have access modifiers so, we can not write public here

       // finalVars.ROADSTER_MAX_RANGE;--> this will give compile error, because we don't have toString method here
        System.out.println(finalVars.ROADSTER_MAX_RANGE);
        System.out.println(finalVars.MODEL_X_PASSENGERS);
        System.out.println(finalVars.MODEL_3_MAXSPEED);
        System.out.println(FinalVariables.ADMIN_USERNAME);// BECAUSE IT IS IN THE SAME PACKAGE, THAT IS WHY YOU CAN ACCESS WITH CLASS NAME OR OBJECT NAME.
        //IF THEY ARE IN THE DIFFERENT CLASS, WE SHOULD USE STATIC IMPORT AT THE BEGINNING IMPORT.CLASSNAME ETC,.

    }
}
