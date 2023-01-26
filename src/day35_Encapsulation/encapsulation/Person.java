package day35_Encapsulation.encapsulation;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class Person {

    private String name;
    private int age;

    public String getName(){//instance method because parameter is instanced
        return name;
    }
    public void setName(String name){//data type of parameter has to match data type of private variable. String name is a new data here
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){//it doesnt return any value, it is just set the value, that is why is void.
        if(age<=0 || age>120){
            System.err.println("Invalid age: "+ age);
            System.exit(0);
        }

        this.age=age;//I set age to a new value, that is why we have argument (int age)
    }



}
